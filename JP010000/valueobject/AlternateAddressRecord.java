package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssv.J0100004.valueobject.InternalGetAlternateAddresses;
import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * Exposed Input Value Object that represents an Alternate Address record <br>
 */
public class AlternateAddressRecord extends ValueObject implements Serializable {


    /**
     * Date - Beginning Effective<br>
     * <p>
     * The date on which an address, item, transaction, or table record becomes<br>
     * active. The meaning of this field differs, depending on the program. For<br>
     * example, the effective date could represent the following:<br>
     * <br>
     *   o  When a change of address becomes effective<br>
     * <br>
     *   o  When a lease becomes effective<br>
     * <br>
     *   o  When a price becomes effective<br>
     * <br>
     *   o  When the currency exchange rate becomes effective<br>
     * <br>
     *   o  When a tax rate becomes effective    <br>
     * <br>
     * <br>
     * @NOTE: The date time stamp entered is adjusted to Coordinated Universal Time (UTC),<br>
     * which is determined using the timezone on your BSSV server, unless an offset is used.<br>
     * For example, if the BSSV server were GMT-7, entering 2007-01-18T00:00:00.000 will<br>
     * result in an adjustment to this value of -7 hours, and the actual value that is<br>
     * passed in to E1 will become 2007-01-17T17:00:00.000.  An Offest can be passed in<br>
     * with the orginal value so that these adjustments do not occur, such as<br>
     * 2007-01-18T00:00:00.000-7:00, which offsets by 7 hours from UTC, will result<br>
     * in the date being passed into E1 as 2007-01-18T00:00:00.000.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: EFTB <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Calendar dateEffective = null;

    /**
     * Type - Address<br>
     * <p>
     * A user defined code (01/AT) that identifies the type of address, such as<br>
     * a home address or an office address.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: ATYPE <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String contactAddressTypeCode = null;

    /**
     * Main Address Flag<br>
     * <p>
     * A code that indicates the address as the primary address. Valid values<br>
     * are:<br>
     * <br>
     * Blank = Non primary address<br>
     * <br>
     * 1= Primary address<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MAINA <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String mainAddressFlagCode = null;

    /**
     * Address Line 1<br>
     * <p>
     * The first line of a mailing address for an employee, customer, or<br>
     * supplier in the Address Book system. The U.S. Internal Revenue Service<br>
     * (IRS) restricts the size of the address that prints on an employee's<br>
     * year-end tax return. To comply with IRS regulations, the system has the<br>
     * following restrictions:<br>
     * <br>
     *   o  On W-2 returns, the system prints only the last three nonblank<br>
     * address lines plus the city, state, and postal code.<br>
     * <br>
     *   o  On 1099 returns, the system prints only the last nonblank address<br>
     * line plus the city, state, and postal code.<br>
     * <br>
     *   o  On other U.S. federal magnetic media, the system prints only the<br>
     * last nonblank address line plus the city, state, and postal code.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine1 = null;

    /**
     * Address Line 2<br>
     * <p>
     * The second line of the mailing address for an employee, customer, or<br>
     * supplier in the Address Book system.<br>
     * <br>
     * Attention Payroll users: The Internal Revenue Service (IRS) restricts<br>
     * the size of the address that prints on employee's year-end forms. To<br>
     * comply with IRS regulations, the address that prints on W-2 forms<br>
     * includes only the last three nonblank address lines plus the city,<br>
     * state, and postal code. The address that prints on 1099 forms includes<br>
     * only the last nonblank address line plus the city, state, and postal<br>
     * code. If you process year-end information using the federal magnetic<br>
     * media format, the address that prints on those forms contains only the<br>
     * last nonblank address line plus the city, state, and postal code.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD2 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine2 = null;

    /**
     * Address Line 3<br>
     * <p>
     * The third line of the mailing address for an employee, customer, or<br>
     * supplier in the Address Book system.<br>
     * <br>
     * Attention Payroll users: The Internal Revenue Service (IRS) restricts<br>
     * the size of the address that prints on employee's year-end forms. To<br>
     * comply with IRS regulations, the address that prints on W-2 forms<br>
     * includes only the last three nonblank address lines plus the city,<br>
     * state, and postal code. The address that prints on 1099 forms includes<br>
     * only the last nonblank address line plus the city, state, and postal<br>
     * code. If you process year-end information using the federal magnetic<br>
     * media format, the address that prints on those forms contains only the<br>
     * last nonblank address line plus the city, state, and postal code.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD3 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine3 = null;

    /**
     * Address Line 4<br>
     * <p>
     * The fourth line of the mailing address for an employee, customer, or<br>
     * supplier in the Address Book system.<br>
     * <br>
     * Attention Payroll users: The Internal Revenue Service (IRS) restricts<br>
     * the size of the address that prints on employee's year-end forms. To<br>
     * comply with IRS regulations, the address that prints on W-2 forms<br>
     * includes only the last three nonblank address lines plus the city,<br>
     * state, and postal code. The address that prints on 1099 forms includes<br>
     * only the last nonblank address line plus the city, state, and postal<br>
     * code. If you process year-end information using the federal magnetic<br>
     * media format, the address that prints on those forms contains only the<br>
     * last nonblank address line plus the city, state, and postal code.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADD4 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String addressLine4 = null;

    /**
     * City<br>
     * <p>
     * A name that indicates the city associated with the address.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTY1 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String city = null;

    /**
     * County<br>
     * <p>
     * The name of a county, parish, or other political district that is<br>
     * necessary for the address or for tax purposes.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: COUN <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String countyCode = null;

    /**
     * State<br>
     * <p>
     * A user defined code (00/S) that specifies the state or province. This<br>
     * code is usually a postal service abbreviation.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDS <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String stateCode = null;

    /**
     * Postal Code<br>
     * <p>
     * The United States ZIP code or the postal code that specifies where a<br>
     * letter is to be routed.  Attach this code to the address for delivery in<br>
     * other countries. This code is used as the low end value when doing<br>
     * Postal Code Transaction range processing.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDZ <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String postalCode = null;

    /**
     * Country Code<br>
     * <p>
     * A user defined code (00/CN) that identifies a country. The country code<br>
     * has no effect on currency conversion.<br>
     * <br>
     * The Address Book system uses the country code for data selection and<br>
     * address formatting.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CTR <br>
     * EnterpriseOne field length: 3<br>
     */
    private String countryCode = null;


    /**
     * Default public constructor for instantiating: AlternateAddressRecord<br>
     */
    public AlternateAddressRecord() {
    }

    public AlternateAddressRecord(InternalGetAlternateAddresses internalAlternateAddress) {


        this.setDateEffective(internalAlternateAddress.getF01161_EFTB());
        this.setContactAddressTypeCode(internalAlternateAddress.getF01161_ATYPE());
        this.setMainAddressFlagCode(internalAlternateAddress.getF01161_MAINA());
        this.setAddressLine1(internalAlternateAddress.getF01161_ADD1());
        this.setAddressLine2(internalAlternateAddress.getF01161_ADD2());
        this.setAddressLine3(internalAlternateAddress.getF01161_ADD3());
        this.setAddressLine4(internalAlternateAddress.getF01161_ADD4());
        this.setCity(internalAlternateAddress.getF01161_CTY1());   
        this.setCountyCode(internalAlternateAddress.getF01161_COUN()); 
        this.setStateCode(internalAlternateAddress.getF01161_ADDS());  
        this.setPostalCode(internalAlternateAddress.getF01161_ADDZ());  
        this.setCountryCode(internalAlternateAddress.getF01161_CTR());
    }

    //*****************************************************************
    //          Accessors
    //*****************************************************************

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
}

