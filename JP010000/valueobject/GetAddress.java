package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;


public class GetAddress extends ValueObject implements Serializable {

    /**
     * Postal Code
     * The United States ZIP code or the postal code that specifies where a letter is to be routed. 
     * Attach this code to the address for delivery in other countries.
     * EnterpriseOne field length:  12 (Data exceeding this length will be truncated)
     */
    private String postalCode = null;

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

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
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

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
