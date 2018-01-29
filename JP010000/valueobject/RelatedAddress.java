package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


public class RelatedAddress extends ValueObject {


    /**
     * Address Number - 1st
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN81 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdRelated1 = null;


    /**
     * Address Number - 2nd
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN82 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdRelated2 = null;

    /**
     * Address Number - 3rd
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN83 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdRelated3 = null;

    /**
     * Address Number - 4th
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN84 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdRelated4 = null;

    /**
     * Address Number - 5th
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN86 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdRelated5 = null;

    /**
     * Factor/Special Payee
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN85 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdRelated6 = null;


    public void setEntityIdRelated1(Integer entityIdRelated1) {
        this.entityIdRelated1 = entityIdRelated1;
    }

    public void setEntityIdRelated1(MathNumeric entityIdRelated1) {
        if (entityIdRelated1 != null) {
            this.entityIdRelated1 = new Integer(entityIdRelated1.intValue());
        }
    }

    public Integer getEntityIdRelated1() {
        return entityIdRelated1;
    }

    public void setEntityIdRelated2(Integer entityIdRelated2) {
        this.entityIdRelated2 = entityIdRelated2;
    }

    public void setEntityIdRelated2(MathNumeric entityIdRelated2) {
        if (entityIdRelated2 != null) {
            this.entityIdRelated2 = new Integer(entityIdRelated2.intValue());
        }
    }

    public Integer getEntityIdRelated2() {
        return entityIdRelated2;
    }

    public void setEntityIdRelated3(Integer entityIdRelated3) {
        this.entityIdRelated3 = entityIdRelated3;
    }

    public void setEntityIdRelated3(MathNumeric entityIdRelated3) {
        if (entityIdRelated3 != null) {
            this.entityIdRelated3 = new Integer(entityIdRelated3.intValue());
        }
    }

    public Integer getEntityIdRelated3() {
        return entityIdRelated3;
    }

    public void setEntityIdRelated4(Integer entityIdRelated4) {
        this.entityIdRelated4 = entityIdRelated4;
    }

    public void setEntityIdRelated4(MathNumeric entityIdRelated4) {
        if (entityIdRelated4 != null) {
            this.entityIdRelated4 = new Integer(entityIdRelated4.intValue());
        }
    }

    public Integer getEntityIdRelated4() {
        return entityIdRelated4;
    }

    public void setEntityIdRelated5(Integer entityIdRelated5) {
        this.entityIdRelated5 = entityIdRelated5;
    }

    public void setEntityIdRelated5(MathNumeric entityIdRelated5) {
        if (entityIdRelated5 != null) {
            this.entityIdRelated5 = new Integer(entityIdRelated5.intValue());
        }
    }

    public Integer getEntityIdRelated5() {
        return entityIdRelated5;
    }

    public void setEntityIdRelated6(Integer entityIdRelated6) {
        this.entityIdRelated6 = entityIdRelated6;
    }

    public void setEntityIdRelated6(MathNumeric entityIdRelated6) {
        if (entityIdRelated6 != null) {
            this.entityIdRelated6 = new Integer(entityIdRelated6.intValue());
        }
    }

    public Integer getEntityIdRelated6() {
        return entityIdRelated6;
    }
}
