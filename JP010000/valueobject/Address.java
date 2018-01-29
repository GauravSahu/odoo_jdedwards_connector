package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * Address is part of the Exposed Input value object
 */
public class Address extends ValueObject implements Serializable {
    /**
     * Name - Mailing
     * The company or person to whom billing or correspondence is addressed.
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String mailingName;

    /**
     * Secondary Mailing Name
     * An alternate mailing name field in the Address Book system to accomodate double-byte coding.
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String mailingNameSecondary;

    /**
     * Address Line 1
     * The first line of a mailing address for an employee, customer, or supplier in the Address Book system.      
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String addressLine1 = null;

    /**
     * Address Line 2
     * The second line of a mailing address for an employee, customer, or supplier in the Address Book system. 
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String addressLine2 = null;

    /**
     * Address Line 3
     * The third line of a mailing address for an employee, customer, or supplier in the Address Book system.
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String addressLine3 = null;

    /**
     * Address Line 4
     * The fourth line of a mailing address for an employee, customer, or supplier in the Address Book system.
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)
     */
    private String addressLine4 = null;

    /**
     * Postal Code
     * The United States ZIP code or the postal code that specifies where a letter is to be routed. 
     * Attach this code to the address for delivery in other countries.
     * EnterpriseOne field length:  12 (Data exceeding this length will be truncated)
     */
    private String postalCode = null;

    /**
     * City
     * A name that indicates the city associated with the address.
     * EnterpriseOne field length:  25 (Data exceeding this length will be truncated)
     */
    private String city = null;

    /**
     * County
     * The name of a county, parish, or other political district that is necessary for the address or for tax purposes.
     * EnterpriseOne field length:  25 (Data exceeding this length will be truncated)
     */
    private String countyCode = null;

    /**
     * State
     * A user defined code (00/S) that specifies the state or province. 
     * This code is usually a postal service abbreviation.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String stateCode = null;

    /**
     * Country
     * A user defined code (00/CN) that identifies a country. 
     * The country code has no effect on currency conversion.     
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String countryCode = null;

    /**
     * Date - Effective
     * The date on which an address record becomes active.      
     * EnterpriseOne field length:  6 (Data exceeding this length will be truncated)
     */
    private Calendar dateEffective;


    public void setMailingName(String mailingName) {
        this.mailingName = mailingName;
    }

    public String getMailingName() {
        return mailingName;
    }

    public void setMailingNameSecondary(String mailingNameSecondary) {
        this.mailingNameSecondary = mailingNameSecondary;
    }

    public String getMailingNameSecondary() {
        return mailingNameSecondary;
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
}
