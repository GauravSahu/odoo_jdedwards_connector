package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssv.J0100024.valueobject.InternalAlternateAddress;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * Exposed Input Value Object that represents an alternate address and the 
 * action to be peformed for it.  This is usually included as an array in 
 * another value object.
 */
public class AlternateAddress extends ValueObject implements Serializable {

    /**
     * Action Code
     * A code that specifies the action that is performed. Valid values are:
     * 1 = Add
     * 2 = Change
     * 3 = Delete
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  1
     */
    private String actionType = null;

    /**
     * Who's Who Line Number - ID
     * This field is used to identify the line ID number for a Who's Who record (F0111)
     * Zero indicates direct relationship to the address book entity
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)
     */
    private Integer contactId;

    /**
     * Date - Beginning Effective
     * The date on which an address, item, transaction, or table record becomes
     * active. The meaning of this field differs, depending on the program. For 
     * example, the effective date could represent the following:   
     * o  When a change of address becomes effective   
     * o  When a lease becomes effective   
     * o  When a price becomes effective   
     * o  When the currency exchange rate becomes effective   
     * o  When a tax rate becomes effective 
     * EnterpriseOne Key Field: true
     * EnterpriseOne field length:  6
     */
    private Calendar dateEffective = null;

    /**
     * Type - Address
     * A user defined code (01/AT) that identifies the type of address, such as 
     * a home address or an office address.
     * EnterpriseOne Key Field: true
     * EnterpriseOne field length:  5
     */
    private String contactAddressTypeCode = null;

    /**
     * Main Address Flag
     * A code that indicates the address as the primary address. Valid values are:
     * Blank = Non primary address 
     * 1= Primary address
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  1
     * EnterpriseOne Default value: 0
     */
    private String mainAddressFlagCode = null;

    /**
     * Address Line 1
     * The first line of a mailing address for an employee, customer, or 
     * supplier in the Address Book system. The U.S. Internal Revenue Service 
     * (IRS) restricts the size of the address that prints on an employee's 
     * year-end tax return. To comply with IRS regulations, the system has the 
     * following restrictions:   
     * o  On W-2 returns, the system prints only the last three nonblank address
     *    lines plus the city, state, and postal code.   
     * o  On 1099 returns, the system prints only the last nonblank address line
     *    plus the city, state, and postal code.   
     * o  On other U.S. federal magnetic media, the system prints only the last 
     *    nonblank address line plus the city, state, and postal code.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String addressLine1 = null;

    /**
     * Address Line 2
     * The second line of the mailing address for an employee, customer, or 
     * supplier in the Address Book system. Attention Payroll users: The 
     * Internal Revenue Service (IRS) restricts the size of the address that 
     * prints on employee's year-end forms.  To comply with IRS regulations, the
     * address that prints on W-2 forms includes only the last three nonblank 
     * address lines plus the city, state, and postal code. The address that 
     * prints on 1099 forms includes only the last nonblank address line plus 
     * the city, state, and postal code. If you process year-end information 
     * using the federal magnetic media format, the address that prints on those
     * forms contains only the last nonblank address line plus the city, state, 
     * and postal code.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String addressLine2 = null;

    /**
     * Address Line 3
     * The third line of the mailing address for an employee, customer, or
     * supplier in the Address Book system. Attention Payroll users: The 
     * Internal Revenue Service (IRS) restricts the size of the address that 
     * prints on employee's year-end forms.  To comply with IRS regulations, the
     * address that prints on W-2 forms includes only the last three nonblank 
     * address lines plus the city, state, and postal code. The address that
     * prints on 1099 forms includes only the last nonblank address line plus 
     * the city, state, and postal code. If you process year-end information 
     * using the federal magnetic media format, the address that prints on those
     * forms contains only the last nonblank address line plus the city, state, 
     * and postal code.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String addressLine3 = null;

    /**
     * Address Line 4
     * The fourth line of the mailing address for an employee, customer, or
     * supplier in the Address Book system. Attention Payroll users: The 
     * Internal Revenue Service (IRS) restricts the size of the address that 
     * prints on employee's year-end forms.  To comply with IRS regulations, the
     * address that prints on W-2 forms includes only the last three nonblank 
     * address lines plus the city, state, and postal code. The address that 
     * prints on 1099 forms includes only the last nonblank address line plus 
     * the city, state, and postal code. If you process year-end information 
     * using the federal magnetic media format, the address that prints on those
     * forms contains only the last nonblank address line plus the city, state, 
     * and postal code.
     * EnterpriseOne field length:  40
     */
    private String addressLine4 = null;

    /**
     * City
     * A name that indicates the city associated with the address.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  25
     */
    private String city = null;

    /**
     * County
     * The name of a county, parish, or other political district that is 
     * necessary for the address or for tax purposes.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  25
     */
    private String countyCode = null;

    /**
     * State
     * A user defined code (00/S) that specifies the state or province. This
     * code is usually a postal service abbreviation.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  3
     */
    private String stateCode = null;

    /**
     * Postal Code
     * The United States ZIP code or the postal code that specifies where a 
     * letter is to be routed.  Attach this code to the address for delivery in 
     * other countries.  This code is used as the low end value when doing 
     * Postal Code Transaction range processing.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  12
     */
    private String postalCode = null;

    /**
     * Country
     * A user defined code (00/CN) that identifies a country. The country code 
     * has no effect on currency conversion. The Address Book system uses the 
     * country code for data selection and address formatting.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  3
     */
    private String countryCode = null;

    public AlternateAddress() {
    }

    public AlternateAddress(InternalAlternateAddress internalAA) {
        this.contactAddressTypeCode = internalAA.getSzTypeAddress();
        this.setDateEffective(internalAA.getJdDateEffective());
        this.actionType = internalAA.getCActionCode();
        this.setContactId(internalAA.getMnWhosWhoLine());
        this.addressLine1 = internalAA.getSzAddressLine1();
        this.addressLine2 = internalAA.getSzAddressLine2();
        this.addressLine3 = internalAA.getSzAddressLine3();
        this.addressLine4 = internalAA.getSzAddressLine4();
        this.postalCode = internalAA.getSzZipCodePostal();
        this.city = internalAA.getSzCity();
        this.countyCode = internalAA.getSzCountyAddress();
        this.countryCode = internalAA.getSzCountry();
        this.stateCode = internalAA.getSzState();
        this.mainAddressFlagCode = internalAA.getCMainAddressFlag();


    }

    public void mapFromPublished(InternalAlternateAddress internalAA) {
        internalAA.setCActionCode(this.actionType);
        internalAA.setJdDateEffective(this.dateEffective);
        internalAA.setMnWhosWhoLine(this.contactId);
        internalAA.setSzTypeAddress(this.contactAddressTypeCode);
        internalAA.setSzAddressLine1(this.addressLine1);
        internalAA.setSzAddressLine2(this.addressLine2);
        internalAA.setSzAddressLine3(this.addressLine3);
        internalAA.setSzAddressLine4(this.addressLine4);
        internalAA.setSzZipCodePostal(this.postalCode);
        internalAA.setSzCity(this.city);
        internalAA.setSzCountyAddress(this.countyCode);
        internalAA.setSzCountry(this.countryCode);
        internalAA.setSzState(this.stateCode);
        internalAA.setCMainAddressFlag(this.mainAddressFlagCode);
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setDateEffective(Calendar dateEffective) {
        this.dateEffective = dateEffective;
    }

    public void setDateEffective(Date dateEffective) {
        if (dateEffective != null) {
            Calendar effDate = Calendar.getInstance();
            effDate.setTime(dateEffective);
            this.dateEffective = effDate;
        }
    }

    public Calendar getDateEffective() {
        return dateEffective;
    }

    public void setContactAddressTypeCode(String contactAddressTypeCode) {
        this.contactAddressTypeCode = contactAddressTypeCode;
    }

    public String getContactAddressTypeCode() {
        return contactAddressTypeCode;
    }

    public void setMainAddressFlagCode(String mainAddressFlagCode) {
        this.mainAddressFlagCode = mainAddressFlagCode;
    }

    public String getMainAddressFlagCode() {
        return mainAddressFlagCode;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public void setContactId(MathNumeric contactId) {
        this.contactId = new Integer(contactId.intValue());
    }

    public Integer getContactId() {
        return contactId;
    }
}
