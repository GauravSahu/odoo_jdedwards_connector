package oracle.e1.bssv.JP010000;

import javax.jws.WebService;

import oracle.e1.bssv.J0100001.AddressBookProcessor;
import oracle.e1.bssv.J0100001.valueobject.InternalProcessAddressBook;
import oracle.e1.bssv.J0100002.AddressBookQueryProcessor;
import oracle.e1.bssv.J0100002.valueobject.InternalGetAddressBook;
import oracle.e1.bssv.J0100003.ContactProcessor;
import oracle.e1.bssv.J0100003.valueobject.InternalProcessContact;
import oracle.e1.bssv.J0100004.ContactQueryProcessor;
import oracle.e1.bssv.J0100004.valueobject.InternalGetContacts;
import oracle.e1.bssv.J0100009.InternalLookupAddressBookProcessor;
import oracle.e1.bssv.J0100009.valueobject.InternalLookupAddressBook;
import oracle.e1.bssv.JP010000.valueobject.ConfirmProcessAddressBook;
import oracle.e1.bssv.JP010000.valueobject.ConfirmProcessAddressBookV2;
import oracle.e1.bssv.JP010000.valueobject.ConfirmProcessContact;
import oracle.e1.bssv.JP010000.valueobject.GetAddressBook;
import oracle.e1.bssv.JP010000.valueobject.GetAddressBookV2;
import oracle.e1.bssv.JP010000.valueobject.GetContact;
import oracle.e1.bssv.JP010000.valueobject.GetContactV2;
import oracle.e1.bssv.JP010000.valueobject.LookupAddressBook;
import oracle.e1.bssv.JP010000.valueobject.ProcessAddressBook;
import oracle.e1.bssv.JP010000.valueobject.ProcessAddressBookV2;
import oracle.e1.bssv.JP010000.valueobject.ProcessContact;
import oracle.e1.bssv.JP010000.valueobject.ShowAddressBook;
import oracle.e1.bssv.JP010000.valueobject.ShowAddressBookV2;
import oracle.e1.bssv.JP010000.valueobject.ShowContact;
import oracle.e1.bssv.JP010000.valueobject.ShowContactV2;
import oracle.e1.bssv.JP010000.valueobject.ShowLookupAddressBook;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

import weblogic.jws.WLHttpTransport;


/**
 * The AddressBook Published Business Service shall manage the execution of the following SBFs:
 * - Process Address Book
 * - Process Contact
 * - Get Address Book
 * - Get Contact
 */
@WebService(endpointInterface = "oracle.e1.bssv.JP010000.AddressBookManagerPortType")
@WLHttpTransport(serviceUri = "/AddressBookManagerPort", portName = "AddressBookManagerPort")
public class AddressBookManager extends PublishedBusinessService {
    /**
     * Published Business Service Public Constructor
     */
    public AddressBookManager() {
    }

    /**
     * Published method for process address book. 
     * processAddressBook method shall process adds, changes and deletes of Address Book information in EnterpriseOne 
     * Acts as wrapper method, passing null context and null connection,
     * will call protected processAddressBook.
     * @param vo the value object representing input data for 
     * @return confirmVO the response data from the business process
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ConfirmProcessAddressBook processAddressBook(ProcessAddressBook vo) throws BusinessServiceException {
        return (processAddressBook(null, null, vo));
    }

    /**
     * Protected method for AddressBookManager Published Business Service.  processAddressBook will call make calls 
     * to the AddressBookProcessor BSSV class for completing business process.     
     * @param vo the value object representing input data for 
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process 
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ConfirmProcessAddressBook processAddressBook(IContext context, 
                                                           IConnection connection, 
                                                           ProcessAddressBook vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "processAddressBook", vo);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();

            // Create a new internal vo based on the published vo passed in.
            InternalProcessAddressBook internalVO = 
                new InternalProcessAddressBook();

            //Call formatters and utilities
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, internalVO);
            mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE, 
                                          E1Message.WARNING_MSG_TYPE);
            messages.addMessages(mapMessages);


            //Call BSSV AddressBookProcessor passing context and internal VO        
            E1MessageList sbfMessages = 
                AddressBookProcessor.processAddressBook(context, connection, 
                                                        internalVO);

            //Add messages returned from BSSV to message list for Published Business Service.
            messages.addMessages(sbfMessages);
            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //get the string representation of all the messages
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }
            //Exception was not thrown, so create the confirm VO from internal VO
            ConfirmProcessAddressBook confirmVO = 
                new ConfirmProcessAddressBook(internalVO);

            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "processAddressBook");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "addAddressBook");

        }
    }

    /**
     * Published method for process address book. 
     * processAddressBookV2 method shall process adds, changes and deletes of Address Book information in EnterpriseOne 
     * Acts as wrapper method, passing null context and null connection,
     * will call protected processAddressBookV2.
     * @param vo the value object representing input data for 
     * @return confirmVO the response data from the business process
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ConfirmProcessAddressBookV2 processAddressBookV2(ProcessAddressBookV2 vo) throws BusinessServiceException {
        return (processAddressBookV2(null, null, vo));
    }
    /**
     * Protected method for AddressBookManager Published Business Service.  processAddressBookV2 will call make calls 
     * to the AddressBookProcessor BSSV class for completing business process.     
     * @param vo the value object representing input data for 
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process 
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ConfirmProcessAddressBookV2 processAddressBookV2(IContext context, 
                                                           IConnection connection, 
                                                           ProcessAddressBookV2 vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "processAddressBookV2", vo);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();

            // Create a new internal vo based on the published vo passed in.
            InternalProcessAddressBook internalVO = 
                new InternalProcessAddressBook();

            //Call formatters and utilities
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, internalVO);
            mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE, 
                                          E1Message.WARNING_MSG_TYPE);
            messages.addMessages(mapMessages);


            //Call BSSV AddressBookProcessor passing context and internal VO        
            E1MessageList sbfMessages = 
                AddressBookProcessor.processAddressBook(context, connection, 
                                                        internalVO);

            //Add messages returned from BSSV to message list for Published Business Service.
            messages.addMessages(sbfMessages);
            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception

            if (messages.hasErrors()) {
                //get the string representation of all the messages
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }
            //Exception was not thrown, so create the confirm VO from internal VO
            ConfirmProcessAddressBookV2 confirmVO = 
                new ConfirmProcessAddressBookV2(internalVO);

            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "processAddressBookV2");
            //return outVO, filled with return values and messages
            return confirmVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "addAddressBook");

        }
    }


    /**
     * Published method for process contact. 
     * The processContact method shall process adds, changes and deletes of 
     * Contact information in EnterpriseOne.
     * Acts as wrapper method, passing null context and null connection,
     * will call protected processAddressBook.
     * @param vo the value object representing input data for
     * @return confirmVO the response data from the business process
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ConfirmProcessContact processContact(ProcessContact vo) throws BusinessServiceException {
        return (processContact(null, null, vo));
    }

    /**
     * Protected method for AddressBookManager Published Business Service.  processContact will make calls 
     * to the ContactProcessor BSSV class for completing business process.     
     * @param vo the value object representing input data for 
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return response value object is the data returned from the business process 
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ConfirmProcessContact processContact(IContext context, 
                                                   IConnection connection, 
                                                   ProcessContact vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "processContact", vo);

            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();

            // Create a new internal value object.
            InternalProcessContact internalVO = new InternalProcessContact();

            //Begin SAR 8635730
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, internalVO);
            //End SAR 8635730
            mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE, 
                                          E1Message.WARNING_MSG_TYPE);
            messages.addMessages(mapMessages);

            //Call BSSV passing context, connection and internal VO
            E1MessageList sbfMessages = 
                ContactProcessor.processContact(context, connection, 
                                                internalVO);

            //Add messages returned from BSSV to message list for Published Business Service.
            messages.addMessages(sbfMessages);

            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            if (messages.hasErrors()) {
                //Get the string representation of all the messages.
                String error = messages.getMessagesAsString();

                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ConfirmProcessContact confirmVO = 
                new ConfirmProcessContact(internalVO);

            confirmVO.setE1MessageList(messages);
            finishPublishedMethod(context, "processContact");

            //return outVO, filled with return values and messages
            return confirmVO;

        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "processContact");

        }
    }


    /**
     * Published method for Get Contact
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getContact.
     * @param vo the value object representing input data for
     * @return confirmVO the response data from the business process
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ShowContact getContact(GetContact vo) throws BusinessServiceException {
        return (getContact(null, null, vo));
    }

    /**
     * Protected method for extends Published Business Service.  getContact will call make calls 
     * to the ContactQueryProcessor BSSV class for querying on AdddressBook info
     * @param vo the value object representing input data for querying on AdddressBook info..
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return confirmVO the response data from the business process AddressBook query.
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ShowContact getContact(IContext context, IConnection connection, 
                                     GetContact vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            //Create Default Transaction using auto commit connection for query.
            context = 
                    startPublishedMethod(context, "getContact", vo, IConnection.AUTO);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            // Create a new internal vo based on the published vo passed in.
            InternalGetContacts internalVO = new InternalGetContacts();
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, 
                                    internalVO.getQueryWhereFields());
            if (mapMessages != null) {
                //mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE, E1Message.WARNING_MSG_TYPE);
                messages.addMessages(mapMessages);
            }

            //Call BSSV ContactQueryProcessor passing context and internal VO
            E1MessageList sbfMessages = 
                ContactQueryProcessor.getContacts(context, connection, 
                                                  internalVO);

            //Add messages returned from BSSV to message list for Published Business Service.
            messages.addMessages(sbfMessages);

            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            if (messages.hasErrors()) {
                //get the string representation of all the messages
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ShowContact showVO = new ShowContact(internalVO, vo);
            showVO.setE1MessageList(messages);
            //Call finish published method, passing the context  
            //to commit default implicit transaction(in case of no exceptions)            
            finishPublishedMethod(context, "getContact");
            //return outVO, filled with return values and messages
            return showVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getContact");

        }
    }

    /**
     * Published method for Get Contact
     * Acts as wrapper method, passing null context and null connection,
     * will call protected getContact.
     * This version is created to address the bug 13374635 which requires field name change. 
     * This method uses newly created/versioned GetContactV2, ShowContactV2 and ContactRecordV2 value objects.
     * Functionally works simillar to getContact.
     * @param vo the value object representing input data for
     * @return confirmVO the response data from the business process
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ShowContactV2 getContactV2(GetContactV2 vo) throws BusinessServiceException {
        return (getContactV2(null, null, vo));
    }

    /**
     * Protected method for extends Published Business Service.  getContact will call make calls 
     * to the ContactQueryProcessor BSSV class for querying on AdddressBook info
     * @param vo the value object representing input data for querying on AdddressBook info..
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return confirmVO the response data from the business process AddressBook query.
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ShowContactV2 getContactV2(IContext context, IConnection connection, 
                                     GetContactV2 vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            //Create Default Transaction using auto commit connection for query.
            context = 
                    startPublishedMethod(context, "getContact", vo, IConnection.AUTO);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            // Create a new internal vo based on the published vo passed in.
            InternalGetContacts internalVO = new InternalGetContacts();
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, 
                                    internalVO.getQueryWhereFields());
            if (mapMessages != null) {
                //mapMessages.changeMessageType(E1Message.ERROR_MSG_TYPE, E1Message.WARNING_MSG_TYPE);
                messages.addMessages(mapMessages);
            }

            //Call BSSV ContactQueryProcessor passing context and internal VO
            E1MessageList sbfMessages = 
                ContactQueryProcessor.getContacts(context, connection, 
                                                  internalVO);

            //Add messages returned from BSSV to message list for Published Business Service.
            messages.addMessages(sbfMessages);

            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            if (messages.hasErrors()) {
                //get the string representation of all the messages
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ShowContactV2 showVO = new ShowContactV2(internalVO, vo);
            showVO.setE1MessageList(messages);
            //Call finish published method, passing the context  
            //to commit default implicit transaction(in case of no exceptions)            
            finishPublishedMethod(context, "getContact");
            //return outVO, filled with return values and messages
            return showVO;
        } finally {
            //Call close to clean up all remaining connections and resources.
            close(context, "getContact");

        }
    }


    /**
     * Published method for getAddressBook
     * This exposed method Acts as wrapper method, passing null context and null connection,
     * will call protected Published Business ServiceMethodName.
     * @param vo the value object representing input data for getAddressBook
     * @return showVO the response data from the query of V0101XPI
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ShowAddressBook getAddressBook(GetAddressBook vo) throws BusinessServiceException {
        return (getAddressBook(null, null, vo));
    }

    /**
     * Protected method for AddressBookManager Published Business Service.  getAddressBook will call make calls to BSSV classes
     * for completing business process.     
     * @param vo the value object representing input data for getAddressBook.
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return confirmVO the response data from the business process getAddressBook.
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ShowAddressBook getAddressBook(IContext context, 
                                             IConnection connection, 
                                             GetAddressBook vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = 
                    startPublishedMethod(context, "getAddressBook", vo, IConnection.AUTO);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            // Create a new internal value object.
            InternalGetAddressBook internalVO = new InternalGetAddressBook();
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, 
                                    internalVO.getQueryWhereFields());
            if (mapMessages != null) {
                messages.addMessages(mapMessages);
            }

            if (!messages.hasErrors()) {
                // Call BSSV passing context and internal VO
                E1MessageList sbfMessages = 
                    AddressBookQueryProcessor.getAddressBook(context, 
                                                             connection, 
                                                             internalVO);

                //Add messages returned from BSSV to message list for Published Business Service.
                messages.addMessages(sbfMessages);
            }
            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception                        
            if (messages.hasErrors()) {
                //get the string representation of all the messages
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ShowAddressBook showVO = new ShowAddressBook(internalVO);
            showVO.setE1MessageList(messages);
            //Call finish published method, passing the context  
            //to commit default implicit transaction(in case of no exceptions)
            finishPublishedMethod(context, "getAddressBook");
            //return confirmVO, mapped with return values and messages
            return showVO;
        } finally {

            //Call close to clean up all remaining connections and resources.
            close(context, "getAddressBook");
        }
    }
    /**
     * Published method for getAddressBookV2
     * This exposed method Acts as wrapper method, passing null context and null connection,
     * will call protected Published Business ServiceMethodName.
     * @param vo the value object representing input data for getAddressBookV2
     * @return showVO the response data from the query of V0101XPI
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    public ShowAddressBookV2 getAddressBookV2(GetAddressBookV2 vo) throws BusinessServiceException {
        return (getAddressBookV2(null, null, vo));
    }
    /**
     * Protected method for AddressBookManager Published Business Service.  getAddressBookV2 will call make calls to BSSV classes
     * for completing business process.     
     * @param vo the value object representing input data for getAddressBookV2.
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return confirmVO the response data from the business process getAddressBookV2.
     * @throws oracle.e1.bssvfoundation.exception.BusinessServiceException
     */
    protected ShowAddressBookV2 getAddressBookV2(IContext context, 
                                             IConnection connection, 
                                             GetAddressBookV2 vo) throws BusinessServiceException {
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = 
                    startPublishedMethod(context, "getAddressBookV2", vo, IConnection.AUTO);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            // Create a new internal value object.
            InternalGetAddressBook internalVO = new InternalGetAddressBook();
            E1MessageList mapMessages = 
                vo.mapFromPublished(context, connection, 
                                    internalVO.getQueryWhereFields());
            if (mapMessages != null) {
                messages.addMessages(mapMessages);
            }

            if (!messages.hasErrors()) {
                // Call BSSV passing context and internal VO
                E1MessageList sbfMessages = 
                    AddressBookQueryProcessor.getAddressBook(context, 
                                                             connection, 
                                                             internalVO);

                //Add messages returned from BSSV to message list for Published Business Service.
                messages.addMessages(sbfMessages);
            }
            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception                        
            if (messages.hasErrors()) {
                //get the string representation of all the messages
                String error = messages.getMessagesAsString();
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }

            //Exception was not thrown, so create the confirm VO from internal VO
            ShowAddressBookV2 showVO = new ShowAddressBookV2 (internalVO);
            showVO.setE1MessageList(messages);
            //Call finish published method, passing the context  
            //to commit default implicit transaction(in case of no exceptions)
            finishPublishedMethod(context, "getAddressBookV2");
            //return confirmVO, mapped with return values and messages
            return showVO;
        } finally {

            //Call close to clean up all remaining connections and resources.
            close(context, "getAddressBookV2");
        }
    }


/**
 * Published method for TODO:  Document method
 * This exposed method Acts as wrapper method, passing null context and null connection,
 * will call protected lookupAddressBook.
 * @param vo the value object representing input data for LookupAddressBook
 * @return confirmVO the response data from the business process TODO:complete javadoc ShowLookupAddressBook.
 * @throws BusinessServiceException
 */
    public ShowLookupAddressBook lookupAddressBook(LookupAddressBook vo) throws BusinessServiceException {
        return (lookupAddressBook(null, null, vo));
    }

    /**
     * Protected method for AddressBookManager Published Business Service.  lookupAddressBook will call make calls to BSSV classes
     * for completing business process.
     * TODO: Comment parameters
     * @param  vo the value object representing input data for LookupAddressBook.
     * @param context conditionally provides the connection for the database operation and logging information
     * @param connection can either be an explicit connection or null. If null the default connection is used.
     * @return confirmVO the response data from the business process ShowLookupAddressBook.
     * @throws BusinessServiceException
     */
    protected ShowLookupAddressBook lookupAddressBook(IContext context, 
                                       IConnection connection,
                                       LookupAddressBook vo) throws BusinessServiceException{
        //perform all work within try block, finally will clean up any connections
        try {
            //Call start published method, passing context of null 
            //will return context object so BSFN or DB operation can be called later.
            //Context will be used to indicate default transaction boundary, as well as access
            //to formatting and logging operations.
            context = startPublishedMethod(context, "lookupAddressBook",vo);
            //Create new Published Business Service messages object for holding errors and warnings that occur during processing.
            E1MessageList messages = new E1MessageList();
            // Create a new internal value object.
            InternalLookupAddressBook internalVO = new InternalLookupAddressBook();
            
            //send fields from published input to internal vo
            vo.mapFromPublished(internalVO);
            
            messages = InternalLookupAddressBookProcessor.lookupAddressBook(context, connection, internalVO);
	          
            //Published Business Service will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
            //If messages contains errors, throw the exception
            
            if (messages.hasErrors()) {
                

                for(int i=0; i<messages.getE1Messages().length; i++){
                    E1Message e1m=   messages.getE1Messages()[i];      
                    if(i==0){
                      e1m.setMessagePrefix("Errors:{" + String.valueOf(messages.getE1Messages().length) + "}" +
                            " Error Code:["+e1m.getCallObjError().getDDItem()+"]" + " Error Item:|"+e1m.getCallObjError().getErrorID()+"|");
                    }else
                    {
                    e1m.setMessagePrefix("Error Code:["+e1m.getCallObjError().getDDItem()+"]"+ " Error Item:|"+e1m.getCallObjError().getErrorID()+"|");
                    }
                }
                //get the string representation of all the messages
                String error = messages.getMessagesAsString(); 
                //Throw new BusinessServiceException
                throw new BusinessServiceException(error, context);
            }
            
            //Exception was not thrown, so create the confirm VO from internal VO
            ShowLookupAddressBook confirmVO = new ShowLookupAddressBook(internalVO);
            confirmVO.setE1MessageList(messages);
            //Call finish published method, passing the context  
            //to commit default implicit transaction(in case of no exceptions)
            finishPublishedMethod(context, "lookupAddressBook");
            //return confirmVO, mapped with return values and messages
            return confirmVO;
        } finally {
            
            //Call close to clean up all remaining connections and resources.
            close(context,"lookupAddressBook");
        }
    }
}

