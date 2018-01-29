package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100003.valueobject.InternalProcessContact;
import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * ConfirmProcessContact Output VO 
 */
public class ConfirmProcessContact extends MessageValueObject implements Serializable {

    /**
     * Who's Who Line Number - ID
     * This field is used to identify the line ID number for a Who's Who record.
     * EnterpriseOne Key Field: true
     * EnterpriseOne field length:  5
     * EnterpriseOne decimal places: 0
     */
    private Integer contactId = null;

    /**
     * Entity
     */
    private
    //Output VO only uses entityID, not full Entity Array
    Integer entityID = null;

    /**
     * Alternate Addresses
     */
    private AlternateAddress[] alternateAddresses;

    /**
     * Phone Numbers
     */
    private PhoneNumber[] phoneNumbers;

    /**
     * Electronic Addresses
     */
    private ElectronicAddress[] electronicAddresses;

    public ConfirmProcessContact() {
    }

    public ConfirmProcessContact(InternalProcessContact internalVO) {

        // Map fields to output from internal VO
        this.contactId = 
                new Integer(internalVO.getMnLineNumberID().intValue());
        this.entityID = 
                new Integer(internalVO.getMnAddressNumber().intValue());

        // Alternate Address Array   
        if (internalVO.getInternalProcessAlternateAddresses().getInternalAlternateAddresses() != 
            null) {
            this.setAlternateAddresses(new AlternateAddress[internalVO.getInternalProcessAlternateAddresses().getInternalAlternateAddresses().size()]);
            for (int i = 0; 
                 i < internalVO.getInternalProcessAlternateAddresses().getInternalAlternateAddresses().size(); 
                 i++) {
                // Loop thru alternate addresses                
                this.setAlternateAddresses(i, 
                                           new AlternateAddress(internalVO.getInternalAlternateAddresses(i)));
            }
        }

        // Phones Array    
        if (internalVO.getInternalProcessPhones().getInternalPhones() != 
            null) {
            // Loop thru phones array
            this.setPhoneNumbers(new PhoneNumber[internalVO.getInternalProcessPhones().getInternalPhones().size()]);
            for (int i = 0; 
                 i < internalVO.getInternalProcessPhones().getInternalPhones().size(); 
                 i++) {
                //loop through phones
                this.setPhoneNumbers(i, 
                                     new PhoneNumber(internalVO.getInternalProcessPhones(i)));
            }
        }

        // Electronic Address Array
        if (internalVO.getInternalProcessElectronicAddresses().getInternalElectronicAddresses() != 
            null) {
            this.setElectronicAddresses(new ElectronicAddress[internalVO.getInternalProcessElectronicAddresses().getInternalElectronicAddresses().size()]);
            for (int i = 0; 
                 i < internalVO.getInternalProcessElectronicAddresses().getInternalElectronicAddresses().size(); 
                 i++) {
                // Loop thru electronic addresses                
                this.setElectronicAddresses(i, 
                                            new ElectronicAddress(internalVO.getInternalElectronicAddresses(i)));
            }
        }

    }

    /**
     * All Accessors
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setAlternateAddresses(AlternateAddress[] alternateAddresses) {
        this.alternateAddresses = alternateAddresses;
    }

    public void setAlternateAddresses(int i, 
                                      AlternateAddress alternateAddresses) {
        this.alternateAddresses[i] = alternateAddresses;
    }

    public AlternateAddress[] getAlternateAddresses() {
        return alternateAddresses;
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


    public void setEntityID(Integer entityID) {
        this.entityID = entityID;
    }

    public Integer getEntityID() {
        return entityID;
    }
}

