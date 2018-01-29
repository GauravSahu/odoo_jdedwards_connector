package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


public class UserReservedData extends ValueObject implements Serializable {
    /**
     * User Reserved Code<br>
     * <p>
     * This is a 2 position code that is reserved for the user. <br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias:URCD <br>
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)<br>
     */
    private String userReservedCode;

    /**
     * User Reserved Date<br>
     * <p>
     * This is a 6 position code that is reserved for the user. <br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: URDT<br>
     * EnterpriseOne field length:  6 (Data exceeding this length will be truncated)<br>
     */
    private Calendar userReservedDate;

    /**
     * User Reserved Amount<br>
     * <p>
     * This is a 15 position code that is reserved for the user. <br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: URAT <br>
     * EnterpriseOne field length:  15 (Data exceeding this length will be truncated)<br>
     */
    private BigDecimal userReservedAmount;

    /**
     * User Reserved Number<br>
     * <p>
     * This is a 8 position code that is reserved for the user. <br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: URAB<br>
     * EnterpriseOne field length:  8 (Data exceeding this length will be truncated)<br>
     */
    private Integer userReservedNumber;

    /**
     * User Reserved Reference<br>
     * <p>
     * A 15-position reference that is reserved for the user. <br>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: URRF <br>
     * EnterpriseOne field length:  15 (Data exceeding this length will be truncated)<br>
     */
    private String userReservedReference;

    public UserReservedData() {
    }

    public void setUserReservedCode(String userReservedCode) {
        this.userReservedCode = userReservedCode;
    }

    public String getUserReservedCode() {
        return userReservedCode;
    }

    public void setUserReservedDate(Calendar userReservedDate) {
        this.userReservedDate = userReservedDate;
    }

    public void setUserReservedDate(Date userReservedDate) {
        if (userReservedDate != null) {
            Calendar userDate = Calendar.getInstance();
            userDate.setTime(userReservedDate);
            this.userReservedDate = userDate;
        }
    }

    public Calendar getUserReservedDate() {
        return userReservedDate;
    }

    public void setUserReservedAmount(BigDecimal userReservedAmount) {
        this.userReservedAmount = userReservedAmount;
    }

    public void setUserReservedAmount(MathNumeric userReservedAmount) {
        if (userReservedAmount != null) {
            this.userReservedAmount = userReservedAmount.asBigDecimal();
        }
    }

    public BigDecimal getUserReservedAmount() {
        return userReservedAmount;
    }

    public void setUserReservedNumber(Integer userReservedNumber) {
        this.userReservedNumber = userReservedNumber;
    }

    public void setUserReservedNumber(MathNumeric userReservedNumber) {
        if (userReservedNumber != null) {
            this.userReservedNumber = 
                    new Integer(userReservedNumber.intValue());
        }
    }

    public Integer getUserReservedNumber() {
        return userReservedNumber;
    }

    public void setUserReservedReference(String userReservedReference) {
        this.userReservedReference = userReservedReference;
    }

    public String getUserReservedReference() {
        return userReservedReference;
    }
}

