package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100001.valueobject.InternalProcessAddressBook;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.MessageValueObject;


/**TODO: Java Doc comments for Value Object here
 *
 */
public class ConfirmProcessAddressBook extends MessageValueObject implements Serializable {

    /**
     * Name 
     * The text that names or describes an address book record.    
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String entityName;

    /**
     * Business Unit
     * An alphanumeric code that identifies a separate entity within a business for which you want to track costs. 
     * For example, a business unit might be a warehouse location, job, project, work center, branch, or plant.
     * You can assign a business unit to a document, entity, or person for purposes of responsibility reporting. 
     * EnterpriseOne field length:  12 (Data exceeding this length will be truncated)
     */
    private String businessUnit;

    /**
     * Entity Type
     * A user defined code (01/ST) that specifies a kind of address book record 
     * Examples include:
     *      E Employees
     *      X Ex-employees
     *      V Suppliers
     *      C Customers
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String entityTypeCode;

    /**
     * Language
     * A prefered language associated with an individual address record.
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)
     */
    private String languageCode;

    /**
     * Entity
     */
    private Entity entity = new Entity();

    /**
     * Address
     */
    private Address address = new Address();

    /**
     * Phone Numbers
     */
    private PhoneNumber[] phoneNumbers;

    /**
     * Electronic Addresses
     */
    private ElectronicAddress[] electronicAddresses;

    public ConfirmProcessAddressBook() {

    }

    public ConfirmProcessAddressBook(InternalProcessAddressBook internalVO) {

        this.entityTypeCode = internalVO.getSzSearchType();
        this.businessUnit = internalVO.getSzBusinessUnit();
        this.entityName = internalVO.getSzAlphaName();
        this.languageCode = internalVO.getSzLanguage();

        this.entity.setEntityId(internalVO.getMnAddressBookNumber());
        this.entity.setEntityTaxId(internalVO.getSzTaxId());
        this.entity.setEntityLongId(internalVO.getSzLongAddressNumber());

        this.getAddress().setMailingName(internalVO.getSzMailingName());
        this.address.setAddressLine1(internalVO.getSzAddressLine1());
        this.address.setAddressLine2(internalVO.getSzAddressLine2());
        this.address.setAddressLine3(internalVO.getSzAddressLine3());
        this.address.setAddressLine4(internalVO.getSzAddressLine4());
        this.address.setCity(internalVO.getSzCity());
        this.getAddress().setCountyCode(internalVO.getSzCounty());
        this.getAddress().setStateCode(internalVO.getSzState());
        this.getAddress().setPostalCode(internalVO.getSzPostalCode());
        this.getAddress().setCountryCode(internalVO.getSzCountry());
        this.getAddress().setDateEffective(internalVO.getJdDateEffective());

        if (internalVO.getInternalProcessPhones().getInternalPhones() != 
            null) {
            //phones loop through array
            this.setPhoneNumbers(new PhoneNumber[internalVO.getInternalProcessPhones().getInternalPhones().size()]);
            for (int i = 0; 
                 i < internalVO.getInternalProcessPhones().getInternalPhones().size(); 
                 i++) {
                //loop through phones
                this.setPhoneNumbers(i, 
                                     new PhoneNumber(internalVO.getInternalProcessPhones(i)));
            }
        }
        if (internalVO.getInternalProcessElectronicAddresses().getInternalElectronicAddresses() != 
            null) {
            this.setElectronicAddresses(new ElectronicAddress[internalVO.getInternalProcessElectronicAddresses().getInternalElectronicAddresses().size()]);
            for (int i = 0; 
                 i < internalVO.getInternalProcessElectronicAddresses().getInternalElectronicAddresses().size(); 
                 i++) {
                //loop throug electronic addresses                
                this.setElectronicAddresses(i, 
                                            new ElectronicAddress(internalVO.getInternalElectronicAddresses(i)));
            }
        }


    }


    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setPhoneNumbers(int i, PhoneNumber phoneNumber) {
        this.phoneNumbers[i] = phoneNumber;
    }


    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setElectronicAddresses(ElectronicAddress[] electronicAddresses) {
        this.electronicAddresses = electronicAddresses;
    }

    public void setElectronicAddresses(int i, 
                                       ElectronicAddress electronicAddresses) {
        this.electronicAddresses[i] = electronicAddresses;
    }

    public ElectronicAddress[] getElectronicAddresses() {
        return electronicAddresses;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }
}
