package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


public class Statistics extends ValueObject implements Serializable {
    /**
     * Number Of Employee<br>
     * <p>
     * This field indicates the number of people employed by the customer/supplier<br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: NOE <br>
     * EnterpriseOne field length:  15 (Data exceeding this length will be truncated)<br>
     */
    private Integer numberOfEmployees;

    /**
     * Growth Rate<br>
     * <p>
     * This field indicates the growth rate of the customer.<br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: GROWTHR<br>
     * EnterpriseOne field length:  8 (Data exceeding this length will be truncated)<br>
     */
    private Integer rateGrowth;

    /**
     * Revenue range<br>
     * <p>
     * Company revenue range.<br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: REVRNG<br>
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)<br>
     */
    private String revenueRangeCode;

    /**
     * Year Started<br>
     * <p>
     * This field indicates the year the company (entity) became a customer.<br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: YEARSTAR     <br>
     * EnterpriseOne field length:  15 (Data exceeding this length will be truncated)<br>
     */
    private String yearCompanyFounded;

    /**
     * DUNS Number<br>
     * <p>
     * The Dun And Bradstreet identifier used to obtain credit reports on companies.<br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias:  GLBA <br>
     * EnterpriseOne field length:  13 (Data exceeding this length will be truncated)<br>
     */
    private String dunBradStreetId;

    public Statistics() {
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNumberOfEmployees(MathNumeric numberOfEmployees) {
        if (numberOfEmployees != null) {
            this.numberOfEmployees = new Integer(numberOfEmployees.intValue());
        }
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setRateGrowth(Integer rateGrowth) {
        this.rateGrowth = rateGrowth;
    }

    public void setRateGrowth(MathNumeric rateGrowth) {
        if (rateGrowth != null) {
            this.rateGrowth = new Integer(rateGrowth.intValue());
        }
    }

    public Integer getRateGrowth() {
        return rateGrowth;
    }

    public void setRevenueRangeCode(String revenueRangeCode) {
        this.revenueRangeCode = revenueRangeCode;
    }

    public String getRevenueRangeCode() {
        return revenueRangeCode;
    }

    public void setYearCompanyFounded(String yearCompanyFounded) {
        this.yearCompanyFounded = yearCompanyFounded;
    }

    public String getYearCompanyFounded() {
        return yearCompanyFounded;
    }

    public void setDunBradStreetId(String dunBradStreetId) {
        this.dunBradStreetId = dunBradStreetId;
    }

    public String getDunBradStreetId() {
        return dunBradStreetId;
    }
}

