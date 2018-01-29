package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssv.J0100003.valueobject.InternalProcessContact;
import oracle.e1.bssv.J0100005.valueobject.InternalPhone;
import oracle.e1.bssv.J0100006.valueobject.InternalElectronicAddress;
import oracle.e1.bssv.J0100024.valueobject.InternalAlternateAddress;
import oracle.e1.bssv.util.J0100010.EntityProcessor;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1MessageList;


// Top level Published Business Service input value object for processContact
public class ProcessContact extends ValueObject implements Serializable {
    /**
     * Contact 
     */
    private Contact contact = new Contact();

    public ProcessContact() {

    }

    public void setContact(Contact contact) {
        // In the case of null, reinitialize compound object
        if (contact == null) {
            this.contact = new Contact();
        } else {
            this.contact = contact;
        }
    }

    public Contact getContact() {
        return contact;
    }

    //Method added as part of SAR 8635730

    /**
     * The mapFromPublished function takes the InternalProcessContact vo and maps
     * the ProcessContact vo values into the corresponding InternalProcessContact
     * values to be passed into the E1 business function during processing.  
     * It also calls entity processor utility for all entities.
     * @param context
     * @param connection
     * @param vo
     * @return
     */
    public E1MessageList mapFromPublished(IContext context, 
                                          IConnection connection, 
                                          InternalProcessContact vo) {
        /**
     * Contact group
     */

        //Create variable of type Contact in order to increase performance instead
        //of using vo.getContact
        Contact contact = this.contact;

        vo.setSzNameAlpha(contact.getEntityNameContact());
        vo.setSzNameMailing(contact.getMailingName());
        vo.setSzNameNick(contact.getNickName());
        vo.setSzContactTitle(contact.getContactTitle());
        vo.setSzRemark1(contact.getRemark());
        vo.setSzSalutationName(contact.getSalutationName());
        vo.setSzNameGiven(contact.getGivenName());
        vo.setSzNameMiddle(contact.getMiddleName());
        vo.setSzNameSurname(contact.getSurname());
        vo.setCTypeCode(contact.getTypeCode());
        vo.setSzDescripCompressed(contact.getDescription1());

        vo.setMnSequenceNumber(contact.getDisplaySequence());

        vo.setSzContactType(contact.getContactTypeCode());
        vo.setSzFunctionCode(contact.getFunctionCode());
        vo.setSzPreferredContactMethod(contact.getPreferredContactMethodCode());
        vo.setSzPrimaryContact(contact.getPrimaryContactCode());

        vo.setMnDayDateOfBirth(contact.getDayOfBirth());
        vo.setMnMonthDateOfBirth(contact.getMonthOfBirth());
        vo.setMnYearDateOfBirth(contact.getYearOfBirth());

        vo.setCGenderMaleFemale(contact.getGenderCode());
        vo.setSzSecondaryMailingName(contact.getMailingNameSecondary());
        vo.setSzSecondaryAlphaName(contact.getEntityNameSecondary());

        vo.setMnLineNumberID(contact.getContactId());

        /**
     * Processing group - compound items
     */

        vo.setCActionCode(this.contact.getProcessing().getActionType());
        vo.setSzVersion(this.contact.getProcessing().getProcessingVersion());

        /**
     * Category Codes Contact group - compound items
     */

        //Create variable of type CategoryCodesContact in order to increase performance instead
        //of using vo.getContact().getCategoryCodesContact()
        CategoryCodesContact categoryCodesContact = 
            this.contact.getCategoryCodesContact();

        vo.setSzCategoryCodeWhosWh001(categoryCodesContact.getCategoryCode001());
        vo.setSzCategoryCodeWhosWh002(categoryCodesContact.getCategoryCode002());
        vo.setSzCategoryCodeWhosWh003(categoryCodesContact.getCategoryCode003());
        vo.setSzCategoryCodeWhosWh004(categoryCodesContact.getCategoryCode004());
        vo.setSzCategoryCodeWhosWh005(categoryCodesContact.getCategoryCode005());
        vo.setSzCategoryCodeWhosWh006(categoryCodesContact.getCategoryCode006());
        vo.setSzCategoryCodeWhosWh007(categoryCodesContact.getCategoryCode007());
        vo.setSzCategoryCodeWhosWh008(categoryCodesContact.getCategoryCode008());
        vo.setSzCategoryCodeWhosWh009(categoryCodesContact.getCategoryCode009());
        vo.setSzCategoryCodeWhosWh010(categoryCodesContact.getCategoryCode010());
        vo.setSzCategoryCodeContacts01(categoryCodesContact.getCategoryCode011());
        vo.setSzCategoryCodeContacts02(categoryCodesContact.getCategoryCode012());
        vo.setSzCategoryCodeContacts03(categoryCodesContact.getCategoryCode013());
        vo.setSzCategoryCodeContacts04(categoryCodesContact.getCategoryCode014());
        vo.setSzCategoryCodeContacts05(categoryCodesContact.getCategoryCode015());
        vo.setSzCategoryCodeContacts06(categoryCodesContact.getCategoryCode016());
        vo.setSzCategoryCodeContacts07(categoryCodesContact.getCategoryCode017());
        vo.setSzCategoryCodeContacts08(categoryCodesContact.getCategoryCode018());
        vo.setSzCategoryCodeContacts09(categoryCodesContact.getCategoryCode019());
        vo.setSzCategoryCodeContacts10(categoryCodesContact.getCategoryCode020());

        /**
     * Phones Array - Loop Thru
     */
        ArrayList phonesList = new ArrayList();
        //SAR 8635730
        PhoneNumber[] phoneNumbers = this.getContact().getPhoneNumbers();
        if (this.getContact().getPhoneNumbers() != null) {
            for (int i = 0; i < phoneNumbers.length; i++) {

                //create internal phone from published and add to array list              
                InternalPhone phone = new InternalPhone();
                //SAR 8635730
                phoneNumbers[i].mapFromPublished(phone);
                phonesList.add(phone);

            }
            // Set entire array list
            vo.getInternalProcessPhones().setInternalPhones(phonesList);
        }

        /**
     * Electronic Addresses Array - Loop Thru
     */
        ArrayList electronicAddressList = new ArrayList();
        ElectronicAddress[] electronicAddresses = 
            this.getContact().getElectronicAddresses();
        if (this.getContact().getElectronicAddresses() != null) {
            for (int i = 0; i < electronicAddresses.length; i++) {

                //create electronic address from published and add to array list
                InternalElectronicAddress electronicAddress = 
                    new InternalElectronicAddress();
                electronicAddresses[i].mapFromPublished(electronicAddress);
                electronicAddressList.add(electronicAddress);
            }
            //set whole arraylist.
            vo.getInternalProcessElectronicAddresses().setInternalElectronicAddresses(electronicAddressList);
        }

        /**
     * Alternate Addresses Array - Loop Thru
     */

        ArrayList alternateAddressList = new ArrayList();
        AlternateAddress[] alternateAddresses = 
            this.getContact().getAlternateAddresses();
        if (this.getContact().getAlternateAddresses() != null) {
            for (int i = 0; i < alternateAddresses.length; i++) {

                // Create alternate address from published and add to array list
                InternalAlternateAddress alternateAddress = 
                    new InternalAlternateAddress();
                alternateAddresses[i].mapFromPublished(alternateAddress);
                alternateAddressList.add(alternateAddress);
            }
            //set whole arraylist.
            vo.getInternalProcessAlternateAddresses().setInternalAlternateAddresses(alternateAddressList);
        }

        /**
     * Entity Processor
     */
        E1MessageList retMessages = new E1MessageList();
        E1MessageList messages = null;
        messages = 
                EntityProcessor.processEntity(context, connection, this.contact.getEntity());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor");
            retMessages.addMessages(messages);
        }

        // Set Internal VO values retrieved by Entity Processor
        vo.setMnAddressNumber(this.contact.getEntity().getEntityId());
        vo.setSzTaxId(this.contact.getEntity().getEntityTaxId());
        vo.setSzLongAddressNumber(this.contact.getEntity().getEntityLongId());

        return retMessages;

    }
}
