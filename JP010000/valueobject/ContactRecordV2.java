package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;


/**
 * Exposed Input Value Object that represents a contact record that will be returned to the consumer <br>
 */
public class ContactRecordV2 extends GetContactV2 implements Serializable {

    /**
     * Alternate Address<br>
     * <p>
     * This object contains and array of alternate addresses<br>
     * </p>
     */
    private AlternateAddressRecord[] alternateAddress;

    /**
     * Phone<br>
     * <p>
     * This object contains and array of Phones<br>
     * </p>
     */
    private PhoneNumberRecord[] phone;

    /**
     * Entity<br>
     * <p>
     * This object contains and array of entities<br>
     * </p>
     */
    private ElectronicAddressRecord[] electronicAddress;


    /**
     * Default public constructor for instantiating: ContactRecord<br>
     */
    public ContactRecordV2() {
    }


    public void setAlternateAddress(AlternateAddressRecord[] alternateAddress) {
        if (alternateAddress != null)
            this.alternateAddress = alternateAddress;
    }

    public void setAlternateAddress(int i, 
                                    AlternateAddressRecord alternateAddress) {
        if (alternateAddress != null)
            this.alternateAddress[i] = alternateAddress;
    }

    public AlternateAddressRecord[] getAlternateAddress() {
        return alternateAddress;
    }

    public AlternateAddressRecord getAlternateAddress(int i) {
        if (i >= 0 && i < alternateAddress.length)
            return alternateAddress[i];
        return null;
    }


    public void setPhone(PhoneNumberRecord[] phone) {
        if (phone != null)
            this.phone = phone;
    }

    public void setPhone(int i, PhoneNumberRecord phone) {
        if (phone != null)
            this.phone[i] = phone;
    }

    public PhoneNumberRecord[] getPhone() {
        return phone;
    }

    public PhoneNumberRecord getPhone(int i) {
        if (i >= 0 && i < phone.length)
            return phone[i];
        return null;
    }


    public void setElectronicAddress(ElectronicAddressRecord[] electronicAddress) {
        if (electronicAddress != null)
            this.electronicAddress = electronicAddress;
    }

    public void setElectronicAddress(int i, 
                                     ElectronicAddressRecord electronicAddress) {
        if (electronicAddress != null)
            this.electronicAddress[i] = electronicAddress;
    }

    public ElectronicAddressRecord[] getElectronicAddress() {
        return electronicAddress;
    }

    public ElectronicAddressRecord getElectronicAddress(int i) {
        if (i >= 0 && i < electronicAddress.length)
            return electronicAddress[i];
        return null;
    }


}

