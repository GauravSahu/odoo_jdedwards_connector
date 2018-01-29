package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;


public class Processing extends ValueObject implements Serializable {
    /**
     * Action Code
     * A code that specifies the action that is performed. 
     * Valid values are:
     * 1 - Add
     * 2 - Change (Net Change)
     * 3 - Delete
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     */
    private String actionType;

    /**
     * Version
     * A user-defined set of specifications that control how applications and reports run. 
     * You use versions to group and save a set of user-defined processing option values
     * and data selection and sequencing options. 
     * EnterpriseOne field length:  10 (Data exceeding this length will be truncated)
     */
    private String processingVersion;


    public Processing() {
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setProcessingVersion(String processingVersion) {
        this.processingVersion = processingVersion;
    }

    public String getProcessingVersion() {
        return processingVersion;
    }
}
