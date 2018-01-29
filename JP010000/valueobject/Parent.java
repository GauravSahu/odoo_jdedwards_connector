package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssv.J0100002.valueobject.InternalParent;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

public class Parent extends ValueObject {
    public Parent() {
    }

    public Parent(InternalParent internalParent) {
        this.setEntityIdParent(internalParent.getF0150_PA8());
        parentStructureTypeCode = internalParent.getF0150_OSTP();
    }


    /**
     * Address Number - Parent
     * <p>
     * The address book number of the parent company. The system uses this number to associate a particular address with a parent company or location. Any value that you enter in this field updates the Address Organizational Structure Master table (F0150) for the blank structure type. This address number must exist in the Address Book Master table (F0101) for validation purposes. <BR>
     * Examples of address book records that would have a parent number include:<BR>
     *  o  Subsidiaries with parent companies  <BR>
     *  o  Branches with a home office  <BR>
     *  o  Job sites with a general contractor 
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PA8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer entityIdParent = null;

    /**
     * Parent Structure Type Code
     * <p>
     * A user defined code (01/TS) that identifies a type of organizational structure that has its own hierarchy in the Address Book system (for example, e-mail).<BR>   
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OSTP <br>
     * EnterpriseOne field length:  3 <br>     
     */
    private String parentStructureTypeCode = null;


    public void setEntityIdParent(Integer entityIdParent) {
        this.entityIdParent = entityIdParent;
    }

    public void setEntityIdParent(MathNumeric entityIdParent) {
        if (entityIdParent != null) {
            this.entityIdParent = new Integer(entityIdParent.intValue());
        }
    }

    public Integer getEntityIdParent() {
        return entityIdParent;
    }

    public void setParentStructureTypeCode(String parentStructureTypeCode) {
        this.parentStructureTypeCode = parentStructureTypeCode;
    }

    public String getParentStructureTypeCode() {
        return parentStructureTypeCode;
    }
}
