package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100006.valueobject.InternalElectronicAddress;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * Published Value Object that represents a single electronic address and the action to be performed on it.
 * Usually included as an array in another value object.
 */
public class ElectronicAddress extends ValueObject implements Serializable {

    /**
     * Action Type
     * Inicates the type of processing desired.
     * Valid codes are 1(add), 2(Change), 3(Delete), 5(Net Change)
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     */
    private String actionType;

    /**
     * Who's Who Line Number - ID
     * This field is used to identify the line ID number for a Who's Who record (F0111)
     * Zero indicates direct relationship to the address book entity
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)
     */
    private Integer contactId;

    /**
     * Line Number ID - 5.0
     * This field is used to create a unique key within a file. 
     * Use this field to specific the phone number that should be changed or updated
     * Can be blank for add
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)
     */
    private Integer electronicAddressLineNumber = null;


    /**
     * Electronic Address Type
     * A user defined code (01/ET) that indicates the type of electronic address. 
     * Valid values are:
     * (E) Email address (name@domain),
     * (I) Internet address (Uniform Resource Locator, or URL),
     * (W) Internal address (Work center).
     * EnterpriseOne field length:  4 (Data exceeding this length will be truncated)
     */
    private String electronicAddressTypeCode = null;

    /**
     * Electronic Address
     * The e-mail address or Uniform Resource Locator (URL) for either an individual or an entity.
     * EnterpriseOne field length:  256 (Data exceeding this length will be truncated)
     */
    private String electronicAddress = null;


    /**
     * Electronic Address Category
     * The system specific category used to specify the purpose of the electronic address. 
     * This is an optional system field currently used only by SRM.
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)
     */
    private String electronicAddressClassificationCode = null;


    /**
     * Messaging Indicator
     * The messaging indicator used by workflow within E1 to determine how email addresses will be processed.
     * Valid values are:
     * 00 Email will not be sent to the specified email address.
     * 01 Email will be sent to the specified email address.
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)
     * EnterpriseOne Default value: 0
     */
    private Integer messageIndicatorCode = null;


    public ElectronicAddress() {

    }

    public ElectronicAddress(InternalElectronicAddress internalEA) {
        this.actionType = internalEA.getCActionCode();
        this.setMessageIndicatorCode(internalEA.getMnEmailHierarchy());
        this.setElectronicAddressLineNumber(internalEA.getMnEmailSequenceNumber());
        this.setContactId(internalEA.getMnWhosWhoLine());
        this.electronicAddress = internalEA.getSzElectronicAddress();
        this.electronicAddressTypeCode = internalEA.getSzEmailAddressType();
        this.electronicAddressClassificationCode = 
                internalEA.getSzEmailClassification();

    }

    public void mapFromPublished(InternalElectronicAddress internalEA) {
        internalEA.setCActionCode(this.actionType);
        internalEA.setMnEmailHierarchy(this.messageIndicatorCode);
        internalEA.setMnEmailSequenceNumber(this.electronicAddressLineNumber);
        internalEA.setMnWhosWhoLine(this.contactId);
        internalEA.setSzElectronicAddress(this.electronicAddress);
        internalEA.setSzEmailAddressType(this.electronicAddressTypeCode);
        internalEA.setSzEmailClassification(this.electronicAddressClassificationCode);
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public void setContactId(MathNumeric contactId) {
        /** SAR 8940051  check to see if contactId is null
         */
        if (contactId != null)
            this.contactId = new Integer(contactId.intValue());
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setElectronicAddressLineNumber(Integer electronicAddressLineNumber) {
        this.electronicAddressLineNumber = electronicAddressLineNumber;
    }

    public void setElectronicAddressLineNumber(MathNumeric electronicAddressLineNumber) {
        if (electronicAddressLineNumber != null) {
            this.electronicAddressLineNumber = 
                    new Integer(electronicAddressLineNumber.intValue());
        }
    }

    public Integer getElectronicAddressLineNumber() {
        return electronicAddressLineNumber;
    }

    public void setElectronicAddressTypeCode(String electronicAddressTypeCode) {
        this.electronicAddressTypeCode = electronicAddressTypeCode;
    }

    public String getElectronicAddressTypeCode() {
        return electronicAddressTypeCode;
    }

    public void setElectronicAddress(String electronicAddress) {
        this.electronicAddress = electronicAddress;
    }

    public String getElectronicAddress() {
        return electronicAddress;
    }

    public void setElectronicAddressClassificationCode(String electronicAddressClassificationCode) {
        this.electronicAddressClassificationCode = 
                electronicAddressClassificationCode;
    }

    public String getElectronicAddressClassificationCode() {
        return electronicAddressClassificationCode;
    }

    public void setMessageIndicatorCode(Integer messageIndicatorCode) {
        this.messageIndicatorCode = messageIndicatorCode;
    }

    public void setMessageIndicatorCode(MathNumeric messageIndicatorCode) {
        if (messageIndicatorCode != null) {
            this.messageIndicatorCode = 
                    new Integer(messageIndicatorCode.intValue());
        }
    }

    public Integer getMessageIndicatorCode() {
        return messageIndicatorCode;
    }
}
