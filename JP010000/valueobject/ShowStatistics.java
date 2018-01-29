package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssvfoundation.util.MathNumeric;


public class ShowStatistics extends Statistics {

    public ShowStatistics() {
    }

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
     * EnterpriseOne Alias: GLBA<br>
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
     * EnterpriseOne Alias: DUNS<br>
     * EnterpriseOne field length:  13 (Data exceeding this length will be truncated)<br>
     */
    private String dunBradStreetId;


    /**
     * G/L Bank Account<br>
     * <p>
     * The number of the bank account (general ledger account) to be updated<br>
     * automatically when receipts or disbursements are entered. The bank<br>
     * account number is assumed to be the same for every document in a batch.<br>
     * Therefore, it is not cleared from entry to entry. However, if you leave<br>
     * the bank account number blank, the system retrieves a default bank<br>
     * account number from the Automatic Accounting Instructions file (F0012),<br>
     * item number RB for Accounts Receivable and PB for Accounts Payable.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GLBA <br>
     * EnterpriseOne field length:  8 <br>
     */
    private String glBankAccount = null;

    public void setGlBankAccount(String glBankAccount) {
        this.glBankAccount = glBankAccount;
    }

    public String getGlBankAccount() {
        return glBankAccount;
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

