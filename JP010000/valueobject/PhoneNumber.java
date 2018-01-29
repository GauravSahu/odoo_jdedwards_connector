package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100005.valueobject.InternalPhone;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * Exposed Input Value Object that represents a single phone number and the action to be peformed for it.
 * Usually included as an array in another value object.
 */
public class PhoneNumber extends ValueObject implements Serializable {


    /**
     * Action Type
     * Inicates the type of processing desired.
     * Valid codes are 1(add), 2(Change), 3(Delete), 5(Net Change)
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     */
    private String actionType;

    /**
     * Who's Who Line Number - ID
     * This field is used to identify the line ID number for a Who's Who record (F0111)
     * Zero indicates direct relationship to the address book entity
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)
     */
    private Integer contactId;

    /**
     * Line Number ID - 5.0
     * This field is used to create a unique key within a file. 
     * Use this field to specific the phone number that should be changed or updated
     * Can be blank for add
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)
     */
    private Integer phoneLineNumber = null;

    /**
     * Phone Number Type
     * A user defined code (01/PH) that indicates either the location or use of the 
     * telephone number on line two for this entity. 
     * Valid values include:
     * (Blank) Business telephone number,
     * (FAX) Fax telephone number,
     * (HOM) Home telephone number.
     * EnterpriseOne field length:  4 (Data exceeding this length will be truncated)
     */
    private String phoneTypeCode = null;

    /**
     * Phone Prefix
     * The first segment of the telephone number on line 2 for this address book record 
     * In the United States, the prefix is the three-digit area code.
     * EnterpriseOne field length:  6 (Data exceeding this length will be truncated)
     */
    private String areaCode = null;

    /**
     * Phone Number
     * A number without the prefix or special characters, such as hyphens or periods, 
     * that makes up the telephone number for an entity. You can use any applicable
     * telephone number format for a country. This field is used in conjunction with
     * the Prefix field (AR1), where you enter the first segment of the telephone number,
     * which is called the area code in the United States.
     * EnterpriseOne field length:  20 (Data exceeding this length will be truncated)
     */
    private String phoneNumber = null;


    public PhoneNumber() {
    }

    public PhoneNumber(InternalPhone internalPhone) {
        this.actionType = internalPhone.getCActionCode();
        this.setContactId(internalPhone.getMnWhosWhoLine());
        this.setPhoneLineNumber(internalPhone.getMnPhoneLine());
        this.areaCode = internalPhone.getSzPhoneAreaCode();
        this.phoneTypeCode = internalPhone.getSzPhoneNumberType();
        this.phoneNumber = internalPhone.getSzPhoneNumber();
    }

    public void mapFromPublished(InternalPhone internalPhone) {

        internalPhone.setSzPhoneAreaCode(this.areaCode);
        internalPhone.setSzPhoneNumber(this.phoneNumber);
        internalPhone.setSzPhoneNumberType(this.phoneTypeCode);
        internalPhone.setCActionCode(this.actionType);
        internalPhone.setMnPhoneLine(this.phoneLineNumber);
        internalPhone.setMnWhosWhoLine(this.contactId);
    }

    public void setPhoneTypeCode(String phoneNumberType) {
        this.phoneTypeCode = phoneNumberType;
    }

    public String getPhoneTypeCode() {
        return phoneTypeCode;
    }

    public void setAreaCode(String phoneAreaCode) {
        this.areaCode = phoneAreaCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public void setContactId(MathNumeric contactId) {
        if (contactId != null)
            this.contactId = new Integer(contactId.intValue());
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setPhoneLineNumber(Integer phoneLineNumber) {
        this.phoneLineNumber = phoneLineNumber;
    }

    public void setPhoneLineNumber(MathNumeric phoneLineNumber) {
        if (phoneLineNumber != null) {
            this.phoneLineNumber = new Integer(phoneLineNumber.intValue());
        }
    }

    public Integer getPhoneLineNumber() {
        return phoneLineNumber;
    }
}
