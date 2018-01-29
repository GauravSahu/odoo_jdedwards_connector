package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100007.valueobject.InternalShowPhones;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * Exposed Input Value Object that represents an Phone Number record <br>
 */
public class PhoneNumberRecord extends ValueObject implements Serializable {

    /**
     * Who's Who Line Number - ID<br>
     * <p>
     * This field is used to identify the line ID number for a Who's Who<br>
     * record.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: IDLN <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer contactId = null;

    /**
     * Line Number ID - 5.0<br>
     * <p>
     * This field is used to create a unique key within a file.  If you are<br>
     * using a program which will allow you to resequence the records, we<br>
     * recommend you use one of the following data dictionary items:  DSS5,<br>
     * DSS7, DSS9.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCK7 <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer phoneLineNumber = null;

    /**
     * Related Person - ID<br>
     * <p>
     * A field that associates a who's who or contact record with a name in the<br>
     * Related Person table (F0112). The Related Person ID field allows a<br>
     * contact to have multiple related persons.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: CNLN <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer relatedPersonId = null;

    /**
     * Phone Number Type<br>
     * <p>
     * A user defined code (01/PH) that indicates either the location or use of<br>
     * a telephone number. Valid values include:<br>
     * <br>
     * Blank<br>
     * Business telephone number<br>
     * <br>
     * FAX<br>
     * Fax telephone number<br>
     * <br>
     * HOM<br>
     * Home telephone number<br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PHTP <br>
     * EnterpriseOne field length:  4 <br>
     */
    private String phoneTypeCode = null;

    /**
     * Phone Prefix<br>
     * <p>
     * The first segment of a telephone number. In the United States, the<br>
     * prefix is the three-digit area code.<br>
     * <br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AR1 <br>
     * EnterpriseOne field length:  6 <br>
     */
    private String areaCode = null;

    /**
     * Phone Number<br>
     * <p>
     * A number without the prefix or special characters, such as hyphens or<br>
     * periods, that makes up the telephone number for an entity. You can use<br>
     * any applicable telephone number format for a country. This field is used<br>
     * in conjunction with the Prefix field (AR1), where you enter the first<br>
     * segment of the telephone number, which is called the area code in the<br>
     * United States.<br>
     * <br>
     * When you search for an address using a phone number, you must enter the<br>
     * number exactly as it is set up in the Address Book system, including any<br>
     * special characters.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PH1 <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String phoneNumber = null;

    /**
     * Default public constructor for instantiating: PhoneNumberRecord<br>
     */
    public PhoneNumberRecord() {
    }

    /**
     * Constructor with field mappings
     * @param internalPhone
     */
    public PhoneNumberRecord(InternalShowPhones internalPhone) {

        this.setRelatedPersonId(internalPhone.getF0115_CNLN());
        this.setContactId(internalPhone.getF0115_IDLN());
        this.setAreaCode(internalPhone.getF0115_AR1());
        this.setPhoneNumber(internalPhone.getF0115_PH1());
        this.setPhoneTypeCode(internalPhone.getF0115_PHTP());
        this.setPhoneLineNumber(internalPhone.getF0115_RCK7());

    }


    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public void setContactId(MathNumeric contactId) {
        if (contactId != null) {
            this.contactId = new Integer(contactId.intValue());

        }
    }

    public Integer getPhoneLineNumber() {
        return phoneLineNumber;
    }

    public void setPhoneLineNumber(Integer phoneLineNumber) {
        this.phoneLineNumber = phoneLineNumber;
    }

    public void setPhoneLineNumber(MathNumeric phoneLineNumber) {
        if (phoneLineNumber != null) {
            this.phoneLineNumber = new Integer(phoneLineNumber.intValue());

        }
    }

    public Integer getRelatedPersonId() {
        return this.relatedPersonId;
    }

    public void setRelatedPersonId(Integer relatedPersonId) {
        this.relatedPersonId = relatedPersonId;
    }

    public void setRelatedPersonId(MathNumeric relatedPersonId) {
        if (relatedPersonId != null) {
            this.relatedPersonId = new Integer(relatedPersonId.intValue());

        }
    }


    public void setPhoneTypeCode(String phoneNumberType) {
        this.phoneTypeCode = phoneNumberType;
    }

    public String getPhoneTypeCode() {
        return phoneTypeCode;
    }


    public void setAreaCode(String phoneAreaCode1) {
        this.areaCode = phoneAreaCode1;
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
}

