package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100008.valueobject.InternalShowElectronicAddresses;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * Exposed Input Value Object that represents an Electronic Address Record <br>
 */
public class ElectronicAddressRecord extends ValueObject implements Serializable {
    /**
     * Address Number<br>
     * <p>
     * A number that identifies an entry in the Address Book system, such as<br>
     * employee, applicant, participant, customer, supplier, tenant, or<br>
     * location. <br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    //  private Integer addressNumber = null;

    /**
     * Who's Who Line Number - ID<br>
     * <p>
     * This field is used to identify the line ID number for a Who's Who<br>
     * record.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: IDLN <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer contactId = null;

    /**
     * Line Number ID - 5.0<br>
     * <p>
     * This field is used to create a unique key within a file.  If you are<br>
     * using a program which will allow you to resequence the records, we<br>
     * recommend you use one of the following data dictionary items:  DSS5,<br>
     * DSS7, DSS9.<br>
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: RCK7 <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer electronicAddressLineNumber = null;

    /**
     * Electronic Address Type<br>
     * <p>
     * A user defined code (01/ET) that indicates the type of electronic<br>
     * address. Valid values are:<br>
     * <br>
     * E<br>
     * Email address (name@domain)<br>
     * <br>
     * I<br>
     * Internet address (Uniform Resource Locator, or URL)<br>
     * <br>
     * W<br>
     * Internal address (Work center)<br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ETP <br>
     * EnterpriseOne field length:  4 <br>
     */
    private String electronicAddressTypeCode = null;

    /**
     * Electronic Address<br>
     * <p>
     * The e-mail address or Uniform Resource Locator (URL) for either an<br>
     * individual or an entity.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMAL <br>
     * EnterpriseOne field length:  256 <br>
     */
    private String electronicAddress = null;

    /**
     * Messaging Indicator<br>
     * <p>
     * The system specific category used to specify the purpose of the electronic<br>
     * address. This is an optional system field currently used only by SRM. <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ECLASS <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String electronicAddressClassificationCode = null;

    /**
     * The messaging indicator used by workflow to determine how email addresses will be processed. Valid values are: 
     * 00 
     * Email will not be sent to the specified email address.
     * 01
     * Email will be sent to the specified email address.
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EHIER <br>
     * EnterpriseOne field length:  2 <br>
     */
    private Integer messageIndicatorCode = null;


    /**
     *Default public constructor for instantiating: ElectronicAddressRecord<br>
     */
    public ElectronicAddressRecord() {
    }

    /**
     * Constructor that takes internal and maps to published
     * @param internalElectronicAddress
     */
    public ElectronicAddressRecord(InternalShowElectronicAddresses internalElectronicAddress) {

        this.setContactId(internalElectronicAddress.getF01151_IDLN());
        this.setElectronicAddressLineNumber(internalElectronicAddress.getF01151_RCK7());
        this.setElectronicAddressTypeCode(internalElectronicAddress.getF01151_ETP());
        this.setElectronicAddress(internalElectronicAddress.getF01151_EMAL());
        this.setElectronicAddressClassificationCode(internalElectronicAddress.getF01151_ECLASS());
        this.setMessageIndicatorCode(internalElectronicAddress.getF01151_EHIER());
    }


    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public void setContactId(MathNumeric contactId) {
        if (contactId != null) {
            this.contactId = new Integer(contactId.intValue());

        }
    }


    public Integer getElectronicAddressLineNumber() {
        return electronicAddressLineNumber;
    }

    public void setElectronicAddressLineNumber(Integer sequenceNumber70) {
        this.electronicAddressLineNumber = sequenceNumber70;
    }

    public void setElectronicAddressLineNumber(MathNumeric sequenceNumber70) {
        if (sequenceNumber70 != null) {
            this.electronicAddressLineNumber = 
                    new Integer(sequenceNumber70.intValue());

        }
    }


    public void setElectronicAddressTypeCode(String electronicAddressType) {
        this.electronicAddressTypeCode = electronicAddressType;
    }

    public String getElectronicAddressTypeCode() {
        return electronicAddressTypeCode;
    }


    public void setElectronicAddress(String emailAddressow) {
        this.electronicAddress = emailAddressow;
    }

    public String getElectronicAddress() {
        return electronicAddress;
    }


    public void setElectronicAddressClassificationCode(String emailHierarchy) {
        this.electronicAddressClassificationCode = emailHierarchy;
    }

    public String getElectronicAddressClassificationCode() {
        return electronicAddressClassificationCode;
    }


    public void setMessageIndicatorCode(Integer messageIndicatorCode) {
        this.messageIndicatorCode = messageIndicatorCode;
    }

    public Integer getMessageIndicatorCode() {
        return messageIndicatorCode;
    }

    public void setMessageIndicatorCode(MathNumeric messageIndicatorCode) {
        if (messageIndicatorCode != null) {
            this.messageIndicatorCode = 
                    new Integer(messageIndicatorCode.intValue());

        }
    }

}

