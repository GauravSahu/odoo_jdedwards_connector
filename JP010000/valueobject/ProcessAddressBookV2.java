package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.util.ArrayList;

import oracle.e1.bssv.J0100001.valueobject.InternalProcessAddressBook;
import oracle.e1.bssv.J0100005.valueobject.InternalPhone;
import oracle.e1.bssv.J0100006.valueobject.InternalElectronicAddress;
import oracle.e1.bssv.util.J0100010.EntityProcessor;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;


//Top level Published Business Service input value object for processAddressBookV2
public class ProcessAddressBookV2 extends ValueObject implements Serializable {
    /**
     * Address Book 
     */
    private static

    //Constant for Whos Who Line ID (ContactId) 
    MathNumeric WHOS_WHO_LINE_ZERO = new MathNumeric(0.0);

    private AddressBookV2 addressBook = new AddressBookV2();

    public ProcessAddressBookV2() {

    }

    public void setAddressBook(AddressBookV2 addressBook) {
        //just in case setter is called with null, re-initialize comppound object
        if (addressBook == null) {
            this.addressBook = new AddressBookV2();
        } else {
            this.addressBook = addressBook;
        }
    }

    public AddressBookV2 getAddressBook() {
        return addressBook;

    }

    /**
     * The mapFromPublished function takes the ProcessAddressBookV2 vo values and maps
     * them to their corresponding InternalProcessAddressBook values to be passed into
     * the E1 business functions during processing.  It also formats the business unit field
     * and calls entity processor utility for all entities.
     * @param context
     * @param connection
     * @param vo
     * @return
     */
    public E1MessageList mapFromPublished(IContext context, 
                                          IConnection connection, 
                                          InternalProcessAddressBook vo) {
        //8949037
        String szTaxId = null;
        vo.setSzSearchType(this.addressBook.getEntityTypeCode());

        vo.setSzAlphaName(this.addressBook.getEntityName());
        //8949037
        szTaxId = this.addressBook.getEntity().getEntityTaxId();
        vo.setSzSecondaryAlphaName(this.addressBook.getEntityNameSecondary());
        vo.setSzLanguage(this.addressBook.getLanguageCode());
        vo.setSzIndustryClassification(this.addressBook.getIndustryClassificationCode());
        vo.setSzRemark(this.addressBook.getRemark());
        vo.setCCallSalesTeamAlignment(this.addressBook.getCallSalesTeamAlignment());
        vo.setSzCreditMessage(this.addressBook.getCreditMessageCode());
        vo.setCPersonCorporationCode(this.addressBook.getPersonCorporationCode());
        vo.setSzAddlIndTaxID(this.addressBook.getEntityTaxIdAdditional());
        vo.setSzCertificate(this.addressBook.getTaxExemptCertificate());

        vo.setCARAPNettingY(this.addressBook.getIsEntityTypeNettingIndicator());
        vo.setCPayablesYNM(this.addressBook.getIsEntityTypePayables());
        vo.setCReceivablesYN(this.addressBook.getIsEntityTypeReceivables());
        vo.setCUserCode(this.addressBook.getIsEntityTypePurchaser());
        vo.setCEmployeeYN(this.addressBook.getIsEntityTypeEmployee());

        vo.setSzGlobalLocatorNumber(this.addressBook.getGlobalLocatorNumber());

        vo.setSzEmployeeGroupApprovals(this.addressBook.getEmployeeGroupApprovalsCode());
        vo.setCActionCode(this.addressBook.getProcessing().getActionType());
        vo.setSzVersion(this.addressBook.getProcessing().getProcessingVersion());
        vo.setSzCategoryCode01(this.addressBook.getCategoryCodesAddressBook().getCategoryCode001());
        vo.setSzAccountRepresentative(this.addressBook.getCategoryCodesAddressBook().getCategoryCode002());
        vo.setSzCategoryCode03(this.addressBook.getCategoryCodesAddressBook().getCategoryCode003());
        vo.setSzGeographicRegion(this.addressBook.getCategoryCodesAddressBook().getCategoryCode004());
        vo.setSzCategoryCode05(this.addressBook.getCategoryCodesAddressBook().getCategoryCode005());
        vo.setSzCategoryCode06(this.addressBook.getCategoryCodesAddressBook().getCategoryCode006());
        vo.setSz1099Reporting(this.addressBook.getCategoryCodesAddressBook().getCategoryCode007());
        vo.setSzCategoryCode08(this.addressBook.getCategoryCodesAddressBook().getCategoryCode008());
        vo.setSzCategoryCode09(this.addressBook.getCategoryCodesAddressBook().getCategoryCode009());
        vo.setSzCategoryCode10(this.addressBook.getCategoryCodesAddressBook().getCategoryCode010());
        vo.setSzSalesRegion(this.addressBook.getCategoryCodesAddressBook().getCategoryCode011());
        vo.setSzCategoryCode12(this.addressBook.getCategoryCodesAddressBook().getCategoryCode012());
        vo.setSzLineOfBusiness(this.addressBook.getCategoryCodesAddressBook().getCategoryCode013());
        vo.setSzSalesVolume(this.addressBook.getCategoryCodesAddressBook().getCategoryCode014());
        vo.setSzCategoryCode15(this.addressBook.getCategoryCodesAddressBook().getCategoryCode015());
        vo.setSzCategoryCode16(this.addressBook.getCategoryCodesAddressBook().getCategoryCode016());
        vo.setSzCategoryCode17(this.addressBook.getCategoryCodesAddressBook().getCategoryCode017());
        vo.setSzCategoryCode18(this.addressBook.getCategoryCodesAddressBook().getCategoryCode018());
        vo.setSzCategoryCode19(this.addressBook.getCategoryCodesAddressBook().getCategoryCode019());
        vo.setSzCategoryCode20(this.addressBook.getCategoryCodesAddressBook().getCategoryCode020());
        vo.setSzCategoryCode21(this.addressBook.getCategoryCodesAddressBook().getCategoryCode021());
        vo.setSzCategoryCode22(this.addressBook.getCategoryCodesAddressBook().getCategoryCode022());
        vo.setSzCategoryCode23(this.addressBook.getCategoryCodesAddressBook().getCategoryCode023());
        vo.setSzCategoryCode24(this.addressBook.getCategoryCodesAddressBook().getCategoryCode024());
        vo.setSzCategoryCode25(this.addressBook.getCategoryCodesAddressBook().getCategoryCode025());
        vo.setSzCategoryCode26(this.addressBook.getCategoryCodesAddressBook().getCategoryCode026());
        vo.setSzCategoryCode27(this.addressBook.getCategoryCodesAddressBook().getCategoryCode027());
        vo.setSzCategoryCode28(this.addressBook.getCategoryCodesAddressBook().getCategoryCode028());
        vo.setSzCategoryCode29(this.addressBook.getCategoryCodesAddressBook().getCategoryCode029());
        vo.setSzCategoryCode30(this.addressBook.getCategoryCodesAddressBook().getCategoryCode030());
        vo.setSzClassificationCode01(this.addressBook.getClassifications().getClassificationCode001());
        vo.setSzClassificationCode02(this.addressBook.getClassifications().getClassificationCode002());
        vo.setSzClassificationCode03(this.addressBook.getClassifications().getClassificationCode003());
        vo.setSzClassificationCode04(this.addressBook.getClassifications().getClassificationCode004());
        vo.setSzClassificationCode05(this.addressBook.getClassifications().getClassificationCode005());
        vo.setSzMailingName(this.addressBook.getAddress().getMailingName());
        vo.setSzSecondaryMailingName(this.addressBook.getAddress().getMailingNameSecondary());
        vo.setSzAddressLine1(this.addressBook.getAddress().getAddressLine1());
        vo.setSzAddressLine2(this.addressBook.getAddress().getAddressLine2());
        vo.setSzAddressLine3(this.addressBook.getAddress().getAddressLine3());
        vo.setSzAddressLine4(this.addressBook.getAddress().getAddressLine4());
        vo.setSzCity(this.addressBook.getAddress().getCity());
        vo.setSzCounty(this.addressBook.getAddress().getCountyCode());
        vo.setSzState(this.addressBook.getAddress().getStateCode());
        vo.setSzPostalCode(this.addressBook.getAddress().getPostalCode());
        vo.setSzCountry(this.addressBook.getAddress().getCountryCode());
        vo.setJdDateEffective(this.addressBook.getAddress().getDateEffective());
        vo.setSzTicker(this.addressBook.getStock().getStockTickerSymbol());
        vo.setSzStockExchange(this.addressBook.getStock().getStockExchange());
        vo.setMnNumberOfEmployee(this.addressBook.getStatistics().getNumberOfEmployees());
        vo.setMnGrowthRate(this.addressBook.getStatistics().getRateGrowth());
        vo.setSzRevenueRange(this.addressBook.getStatistics().getRevenueRangeCode());
        vo.setSzYearStarted(this.addressBook.getStatistics().getYearCompanyFounded());
        vo.setSzDUNSNumber(this.addressBook.getStatistics().getDunBradStreetId());
        vo.setSzUserReservedCode(this.addressBook.getUserReservedData().getUserReservedCode());
        vo.setJdUserReservedDate(this.addressBook.getUserReservedData().getUserReservedDate());
        vo.setMnUserReservedAmount(this.addressBook.getUserReservedData().getUserReservedAmount());
        vo.setMnUserReservedNumber(this.addressBook.getUserReservedData().getUserReservedNumber());
        vo.setSzUserReservedReference(this.addressBook.getUserReservedData().getUserReservedReference());

        //phones loop through array
        //new arraylist
        ArrayList phonesList = new ArrayList();
        PhoneNumber[] phoneNumbers = this.addressBook.getPhoneNumbers();
        if (this.addressBook.getPhoneNumbers() != null) {
            for (int i = 0; i < phoneNumbers.length; i++) {
                //create internal phone and add to array list              
                InternalPhone phone = new InternalPhone();
                phoneNumbers[i].mapFromPublished(phone);
                //Hardcode ContactId to zero -- do here because only appropriate 
                //for Address Book and not Contact
                this.addressBook.getPhoneNumbers(i).setContactId(WHOS_WHO_LINE_ZERO);

                phonesList.add(phone);
            }
            //set whole arraylist.
            vo.getInternalProcessPhones().setInternalPhones(phonesList);
        }

        //electronic address
        ArrayList electronicAddressList = new ArrayList();
        ElectronicAddress[] electronicAddresses = 
            this.addressBook.getElectronicAddresses();
        if (this.addressBook.getElectronicAddresses() != null) {
            for (int i = 0; i < electronicAddresses.length; i++) {
                //create each new electronic address based on the published electronic address
                InternalElectronicAddress electronicAddress = 
                    new InternalElectronicAddress();
                electronicAddresses[i].mapFromPublished(electronicAddress);
                //add to array list
                electronicAddressList.add(electronicAddress);
            }
            //set whole arraylist.
            vo.getInternalProcessElectronicAddresses().setInternalElectronicAddresses(electronicAddressList);
        }

        // Format MCU
        E1MessageList retMessages = new E1MessageList();
        String formattedMCU = null;
        if (this.addressBook.getBusinessUnit() != null) {
            try {
                formattedMCU = 
                        context.getBSSVDataFormatter().format(this.addressBook.getBusinessUnit(), 
                                                              "MCU");
                //Set in internal VO
                vo.setSzBusinessUnit(formattedMCU);
            } catch (BSSVDataFormatterException e) {
                context.getBSSVLogger().app(context, 
                                            "Error when formatting Business Unit.", 
                                            null, vo, e);
                //Create new E1 Message with error from exception
                retMessages.addMessage(new E1Message(context, "002FIS", 
                                                     this.addressBook.getBusinessUnit()));
            }
        }
        //Don't call entity processor for add mode for the entity         
        E1MessageList messages = null;
        if (!("1".equals(this.addressBook.getProcessing().getActionType()))) {
            messages = 
                    EntityProcessor.processEntity(context, connection, this.addressBook.getEntity());
            if (messages != null) {
                messages.setMessagePrefix("EntityProcessor - Entity");
                retMessages.addMessages(messages);
            }
        }

        //Call Entity Processor for all entities
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getParent());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Parent");
            retMessages.addMessages(messages);
        }
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getRelatedAddress1());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Related Address 1");
            retMessages.addMessages(messages);
        }
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getRelatedAddress2());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Related Address 2");
            retMessages.addMessages(messages);
        }
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getRelatedAddress3());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Related Address 3");
            retMessages.addMessages(messages);
        }
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getRelatedAddress4());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Related Address 4");
            retMessages.addMessages(messages);
        }
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getRelatedAddress5());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Related Address 5");
            retMessages.addMessages(messages);
        }
        messages = 
                EntityProcessor.processEntity(context, connection, this.addressBook.getRelatedAddress6());
        if (messages != null) {
            messages.setMessagePrefix("EntityProcessor Related Address 6");
            retMessages.addMessages(messages);
        }

        //now that entity values are filled pass to internal vo
        vo.setMnAddressBookNumber(this.addressBook.getEntity().getEntityId());
        vo.setSzLongAddressNumber(this.addressBook.getEntity().getEntityLongId());
        //8949037 begin
        if (szTaxId != null) {
            vo.setSzTaxId(szTaxId);
        }
        else{
            vo.setSzTaxId(this.addressBook.getEntity().getEntityTaxId());
        }
        //8949037 end
        vo.setMnParentNumber(this.addressBook.getParent().getEntityId());
        vo.setMn1stAddressNumber(this.addressBook.getRelatedAddress1().getEntityId());
        vo.setMn2ndAddressNumber(this.addressBook.getRelatedAddress2().getEntityId());
        vo.setMn3rdAddressNumber(this.addressBook.getRelatedAddress3().getEntityId());
        vo.setMn4thAddressNumber(this.addressBook.getRelatedAddress4().getEntityId());
        vo.setMnFactorSpecialPayee(this.addressBook.getRelatedAddress5().getEntityId());
        vo.setMn5thAddressNumber(this.addressBook.getRelatedAddress6().getEntityId());

        return retMessages;
    }
}
