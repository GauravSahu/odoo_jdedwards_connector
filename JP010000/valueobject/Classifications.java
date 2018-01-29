package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;


public class Classifications extends ValueObject implements Serializable {
    /**
     * Classification Code 01
     * This is a code used to classify an address book entity.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String classificationCode001;

    /**
     * Classification Code 02
     * This is a code used to classify an address book entity.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String classificationCode002;

    /**
     * Classification Code 03
     * This is a code used to classify an address book entity.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String classificationCode003;

    /**
     * Classification Code 04
     * This is a code used to classify an address book entity.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String classificationCode004;

    /**
     * Classification Code 05
     * This is a code used to classify an address book entity.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String classificationCode005;

    public Classifications() {
    }

    public void setClassificationCode001(String classificationCode001) {
        this.classificationCode001 = classificationCode001;
    }

    public String getClassificationCode001() {
        return classificationCode001;
    }

    public void setClassificationCode002(String classificationCode002) {
        this.classificationCode002 = classificationCode002;
    }

    public String getClassificationCode002() {
        return classificationCode002;
    }

    public void setClassificationCode003(String classificationCode003) {
        this.classificationCode003 = classificationCode003;
    }

    public String getClassificationCode003() {
        return classificationCode003;
    }

    public void setClassificationCode004(String classificationCode004) {
        this.classificationCode004 = classificationCode004;
    }

    public String getClassificationCode004() {
        return classificationCode004;
    }

    public void setClassificationCode005(String classificationCode005) {
        this.classificationCode005 = classificationCode005;
    }

    public String getClassificationCode005() {
        return classificationCode005;
    }
}
