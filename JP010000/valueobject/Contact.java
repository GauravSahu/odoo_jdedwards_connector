package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.ValueObject;


/**
 * Exposed input value object of Contact information
 */
public class Contact extends ValueObject implements Serializable {

    /**
     * Name - Alpha
     * The text that names or describes an address. This 40-character 
     * alphabetic field appears on a number of forms and reports. You can enter 
     * dashes, commas, and other special characters, but the system cannot 
     * search on them when you use this field to search for a name.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String entityNameContact = null;

    /**
     * Name - Mailing
     * The company or person to whom billing or correspondence is addressed.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String mailingName = null;

    /**
     * Nickname
     * The nickname of an individual. Nickname is linked to a who's who line of 
     * an address book number.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String nickName = null;

    /**
     * Professional Title
     * The professional title of a Who's Who person.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String contactTitle = null;

    /**
     * Remark 1
     * A 40-character field that you can use to enter text.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String remark = null;

    /**
     * Salutation Name
     * The name that you would use to address an individual in written 
     * correspondence. Examples include Ms. Green, Dr. Strasheim, 
     * Herr Obermeyer, Mr. Pitt. The software does not use the value in this 
     * field in any reports. It is informational only.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String salutationName = null;

    /**
     * Name - Given
     * The first name of an individual. This field is informational only.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  25
     */
    private String givenName = null;

    /**
     * Name - Middle
     * The middle name or initial of an individual. This field is informational 
     * only. The name  does not appear on any reports. 
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  25
     */
    private String middleName = null;

    /**
     * Name - Surname
     * The last name of an individual. This field is informational only.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  25
     */
    private String surname = null;

    /**
     * Type Code
     * A user defined code (01/W0) that identifies the Who's Who entry. 
     * Examples include: 
     * A Attention name 
     * B Billing 
     * C Contact name 
     * E Emergency Contact 
     * O Other 
     * T 1099 legal name  
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  1
     */
    private String typeCode = null;

    /**
     * Description - Compressed
     * The compressed description contains the alpha name without spaces, 
     * slashes,dashes, commas, and other special characters.  The compressed 
     * description is the field used in the Name Search.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String description1 = null;

    /**
     * Display Sequence- 5.2
     * A number that specifies the order of a group of records on the form.  
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  5
     * EnterpriseOne decimal places: 2
     */
    private BigDecimal displaySequence = null;

    /**
     * Contact Type
     * A user defined code (01/CT) that describes a contact. For example, you 
     * might set up codes to describe a contact as a decision maker, an 
     * influencer, a recommender, a competitor, and so on. 
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  3
     */
    private String contactTypeCode = null;

    /**
     * Function Code
     * A user defined code (system 01, type FC) that indicates the function the 
     * contact plays in the company.  Examples include: 
     * CO Chief Officer 
     * CON Consultant 
     * DIR Director 
     * MGR Manager 
     * STAF Staff 
     * SUPR Supervisor 
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  10
     */
    private String functionCode = null;

    /**
     * Preferred Contact Method
     * A user defined code (system 01, type CQ) that defines the desired contact
     * method for the contact.  Examples include: 
     * E Email 
     * F Fax 
     * C Phone 
     * W Address 
     * P Pager 
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  10
     */
    private String preferredContactMethodCode = null;

    /**
     * Primary Contact
     * This field is used to designate the contact type as primary for an 
     * address book entity.   Valid values are: 
     * Checked (or 1) Primary contact 
     * Unchecked (or 0) Not primary contact 
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  3
     * EnterpriseOne Default value: 0
     */
    private String primaryContactCode = null;

    /**
     * Day of Birth
     * A number that specifies the day portion for the Date of Birth field. For 
     * example, if the birth date is February 5, 1973, you would enter 05 in 
     * this field.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  2
     * EnterpriseOne decimal places: 0
     */
    private Integer dayOfBirth = null;

    /**
     * Month of Birth
     * A number that specifies the month portion for the Date of Birth field. 
     * For example, if the birth date is February 5, 1973, you would enter 02 in
     * this field.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  2
     * EnterpriseOne decimal places: 0
     */
    private Integer monthOfBirth = null;

    /**
     * Year of Birth
     * A number that specifies the year portion for the Date of Birth field. For
     * example, if the birth date is February 5, 1973, you would enter 1973 in 
     * this field.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  4
     * EnterpriseOne decimal places: 0
     */
    private Integer yearOfBirth = null;

    /**
     * Gender (Male/Female)
     * A code that indicates an individual's gender. Valid values are: 
     * Blank 1  Male 
     * 2        Female  
     * 3        Unknown 
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  1
     */
    private String genderCode = null;

    /**
     * Secondary Mailing Name
     * An alternate mailing name field in the Address Book system to accomodate 
     * double-byte coding.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String mailingNameSecondary = null;

    /**
     * Secondary Alpha Name
     * An alternate name field in the Address Book system to accommodate 
     * double-byte coding.
     * EnterpriseOne Key Field: false
     * EnterpriseOne field length:  40
     */
    private String entityNameSecondary = null;

    /**
     * Who's Who Line Number - ID
     * This field is used to identify the line ID number for a Who's Who record.
     * EnterpriseOne Key Field: true
     * EnterpriseOne field length:  5
     * EnterpriseOne decimal places: 0
     */
    private Integer contactId = null;

    /**
     * Processing - Reused from JP010000
     */
    private Processing processing = new Processing();

    /**
     * Entity - Reused from J0100010
     */
    private Entity entity = new Entity();

    /**
     * Category Codes for Contact - Reused from JP010000
     */
    private CategoryCodesContact categoryCodesContact = 
        new CategoryCodesContact();

    /**
     * Alternate Addresses - Reused from JP010000
     */
    private AlternateAddress alternateAddresses[];

    /**
     * Phone Numbers - Reused from JP010000
     */
    private PhoneNumber phoneNumbers[];

    /**
     * Electronic Addresses - Reused from JP010000
     */
    private ElectronicAddress electronicAddresses[];

    public Contact() {

    }

    /** 
     * All Accessors
     */
    public void setEntityNameContact(String entityNameContact) {
        this.entityNameContact = entityNameContact;
    }

    public String getEntityNameContact() {
        return entityNameContact;
    }

    public void setMailingName(String mailingName) {
        this.mailingName = mailingName;
    }

    public String getMailingName() {
        return mailingName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setSalutationName(String salutationName) {
        this.salutationName = salutationName;
    }

    public String getSalutationName() {
        return salutationName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDisplaySequence(BigDecimal displaySequence) {
        this.displaySequence = displaySequence;
    }

    public BigDecimal getDisplaySequence() {
        return displaySequence;
    }

    public void setContactTypeCode(String contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    public String getContactTypeCode() {
        return contactTypeCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setPreferredContactMethodCode(String preferredContactMethodCode) {
        this.preferredContactMethodCode = preferredContactMethodCode;
    }

    public String getPreferredContactMethodCode() {
        return preferredContactMethodCode;
    }

    public void setPrimaryContactCode(String primaryContactCode) {
        this.primaryContactCode = primaryContactCode;
    }

    public String getPrimaryContactCode() {
        return primaryContactCode;
    }

    public void setDayOfBirth(Integer dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Integer getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(Integer monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public Integer getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setMailingNameSecondary(String mailingNameSecondary) {
        this.mailingNameSecondary = mailingNameSecondary;
    }

    public String getMailingNameSecondary() {
        return mailingNameSecondary;
    }

    public void setEntityNameSecondary(String entityNameSecondary) {
        this.entityNameSecondary = entityNameSecondary;
    }

    public String getEntityNameSecondary() {
        return entityNameSecondary;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setProcessing(Processing processing) {
        // In the case where null, reinitialize compound object
        if (processing == null) {
            this.processing = new Processing();
        } else {
            this.processing = processing;

        }
    }

    public Processing getProcessing() {
        return processing;
    }

    public void setEntity(Entity entity) {
        // In the case where null, reinitialize compound object
        if (entity == null) {
            this.entity = new Entity();
        } else {
            this.entity = entity;

        }

    }

    public Entity getEntity() {
        return entity;
    }

    public void setCategoryCodesContact(CategoryCodesContact categoryCodesContact) {
        // In the case where null, reinitialize compound object
        if (categoryCodesContact == null) {
            this.categoryCodesContact = new CategoryCodesContact();
        } else {
            this.categoryCodesContact = categoryCodesContact;

        }
    }

    public CategoryCodesContact getCategoryCodesContact() {
        return categoryCodesContact;
    }

    public void setAlternateAddresses(AlternateAddress[] alternateAddresses) {
        this.alternateAddresses = alternateAddresses;
    }

    public void setAlternateAddresses(int i, AlternateAddress alterAddress) {
        this.alternateAddresses[i] = alterAddress;
    }

    public AlternateAddress[] getAlternateAddresses() {
        return alternateAddresses;
    }

    public AlternateAddress getAlternateAddresses(int i) {
        return alternateAddresses[i];
    }

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(int i, PhoneNumber phone) {
        this.phoneNumbers[i] = phone;
    }

    public PhoneNumber getPhoneNumbers(int i) {
        return phoneNumbers[i];
    }

    public void setElectronicAddresses(ElectronicAddress[] electronicAddresses) {
        this.electronicAddresses = electronicAddresses;
    }

    public void setElectronicAddresses(int i, ElectronicAddress elecAddress) {
        this.electronicAddresses[i] = elecAddress;
    }

    public ElectronicAddress[] getElectronicAddresses() {
        return electronicAddresses;
    }

    public ElectronicAddress getElectronicAddresses(int i) {
        return electronicAddresses[i];
    }
}
