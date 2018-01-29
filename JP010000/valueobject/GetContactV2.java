package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssv.J0100004.valueobject.InternalGetContacts;
import oracle.e1.bssv.J0100004.valueobject.InternalGetContactsWhereFields;
import oracle.e1.bssv.util.J0100010.EntityProcessor;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;


/**
 * Exposed Input Value Object that provides input fields used to query the contact table. 
 */
public class GetContactV2 extends ValueObject implements Serializable {
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
    private Integer contactID = null;

    /**
     * Display Sequence- 5.2<br>
     * <p>
     * A number that specifies the order of a group of records on the form.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSS5 <br>
     * EnterpriseOne field length:  5 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private BigDecimal displaySequence = null;

    /**
     * Name - Mailing<br>
     * <p>
     * The company or person to whom billing or correspondence is addressed.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MLNM <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String nameMailing = null;

    /**
     * Professional Title<br>
     * <p>
     * The professional title of a Who's Who person.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ATTL <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String contactTitle = null;

    /**
     * Remark 1<br>
     * <p>
     * A 40-character field that you can use to enter text.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: REM1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String remark = null;

    /**
     * Salutation Name<br>
     * <p>
     * The name that you would use to address an individual in written<br>
     * correspondence. Examples include Ms. Green, Dr. Strasheim, Herr<br>
     * Obermeyer, Mr. Pitt. The software does not use the value in this field<br>
     * in any reports. It is informational only.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SLNM <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String salutationName = null;

    /**
     * Name - Alpha<br>
     * <p>
     * The text that names or describes an address. This 40-character<br>
     * alphabetic field appears on a number of forms and reports. You can enter<br>
     * dashes, commas, and other special characters, but the system cannot<br>
     * search on them when you use this field to search for a name.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String entityNameContact = null;

    /**
     * Description - Compressed<br>
     * <p>
     * The compressed description contains the alpha name without spaces,<br>
     * slashes,dashes, commas, and other special characters.  The compressed<br>
     * description is the field used in the Name Search.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DC <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String description1 = null;

    /**
     * Name - Given<br>
     * <p>
     * The first name of an individual. This field is informational only.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GNNM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String giveName = null;

    /**
     * Name - Middle<br>
     * <p>
     * The middle name or initial of an individual. This field is informational<br>
     * only. The name <br>
     * does not appear on any reports.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MDNM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String middleName = null;

    /**
     * Name - Surname<br>
     * <p>
     * The last name of an individual. This field is informational only.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRNM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String surname = null;

    /**
     * Type Code<br>
     * <p>
     * A user defined code (01/W0) that identifies the Who's Who entry.<br>
     * Examples include:<br>
     * <br>
     * A<br>
     * Attention name<br>
     * <br>
     * B<br>
     * Billing<br>
     * <br>
     * C<br>
     * Contact name<br>
     * <br>
     * E<br>
     * Emergency Contact<br>
     * <br>
     * O<br>
     * Other<br>
     * <br>
     * T<br>
     * 1099 legal name <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TYC <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String typeCode = null;

    /**
     * Secondary Mailing Name<br>
     * <p>
     * An alternate mailing name field in the Address Book system to accomodate<br>
     * double-byte coding.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MLN1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String mailingNameSecondary = null;

    /**
     * Secondary Alpha Name<br>
     * <p>
     * An alternate name field in the Address Book system to accommodate<br>
     * double-byte coding.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALP1 <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String entityNameSecondary = null;

    /**
     * Contact Type<br>
     * <p>
     * A user defined code (01/CT) that describes a contact. For example, you<br>
     * might set up codes to describe a contact as a decision maker, an<br>
     * influencer, a recommender, a competitor, and so on.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NTYP <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String contactTypeCode = null;

    /**
     * Nickname<br>
     * <p>
     * The nickname of an individual. Nickname is linked to a who's who line of<br>
     * an address book number.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NICK <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String nickName = null;

    /**
     * Gender (Male/Female)<br>
     * <p>
     * A code that indicates an individual's gender. Valid values are:<br>
     * <br>
     * Blank<br>
     * <br>
     * 1 <br>
     * Male<br>
     * <br>
     * 2 <br>
     * Female <br>
     * <br>
     * 3<br>
     * Unknown<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: GEND <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String genderCode = null;

    /**
     * Day of Birth<br>
     * <p>
     * A number that specifies the day portion for the Date of Birth field. For<br>
     * example, if the birth date is February 5, 1973, you would enter 05 in<br>
     * this field.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DDATE <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer dayOfBirth = null;

    /**
     * Month of Birth<br>
     * <p>
     * A number that specifies the month portion for the Date of Birth field.<br>
     * For example, if the birth date is February 5, 1973, you would enter 02<br>
     * in this field.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DMON <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer monthOfBirth = null;

    /**
     * Year of Birth<br>
     * <p>
     * A number that specifies the year portion for the Date of Birth field.<br>
     * For example, if the birth date is February 5, 1973, you would enter 1973<br>
     * in this field.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DYR <br>
     * EnterpriseOne field length:  4 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private Integer yearOfBirth = null;

    /**
     * Function Code<br>
     * <p>
     * A user defined code (system 01, type FC) that indicates the function the<br>
     * contact plays in the company.  Examples include:<br>
     * <br>
     * CO<br>
     * Chief Officer<br>
     * <br>
     * CON<br>
     * Consultant<br>
     * <br>
     * DIR<br>
     * Director<br>
     * <br>
     * MGR<br>
     * Manager<br>
     * <br>
     * STAF<br>
     * Staff<br>
     * <br>
     * SUPR<br>
     * Supervisor<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FUCO <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String functionCode = null;

    /**
     * Preferred Contact Method<br>
     * <p>
     * A user defined code (system 01, type CQ) that defines the desired<br>
     * contact method for the contact.  Examples include:<br>
     * <br>
     * E<br>
     * Email<br>
     * <br>
     * F<br>
     * Fax<br>
     * <br>
     * C<br>
     * Phone<br>
     * <br>
     * W<br>
     * Address<br>
     * <br>
     * P<br>
     * Pager<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PCM <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String preferredContactMethod = null;

    /**
     * Primary Contact<br>
     * <p>
     * This field is used to designate the contact type as primary for an<br>
     * address book entity.  <br>
     * Valid values are:<br>
     * <br>
     * Checked (or 1)<br>
     * Primary contact<br>
     * <br>
     * Unchecked ( or 0)<br>
     * Not primary contact<br>
     * <br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PCF <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String primaryContactCode = null;


    /**
     * Category Codes<br>
     * <p>
     * This compound field contains the category codes<br>
     * </p>
     */
    private CategoryCodesContact categoryCodesContact = 
        new CategoryCodesContact();

    /**
     * Entity<br>
     * <p>
     * This compound field contains the entity fields<br>
     * </p>
     */
    private Entity entity = new Entity();

    //****************************************************************
    // public constructor 

    public GetContactV2() {
    }

    //****************************************************************
    // accessors 

    public void setContactID(Integer contactID) {
        this.contactID = contactID;
    }

    public void setContactID(MathNumeric contactID) {
        if (contactID != null)
            this.contactID = new Integer(contactID.intValue());
    }

    public Integer getContactID() {
        return contactID;
    }


    public void setDisplaySequence(BigDecimal displaySequence) {
        this.displaySequence = displaySequence;
    }

    public void setDisplaySequence(MathNumeric displaySequence) {
        if (displaySequence != null)
            this.displaySequence = displaySequence.asBigDecimal();
    }

    public BigDecimal getDisplaySequence() {
        return displaySequence;
    }


    public void setNameMailing(String nameMailing) {
        this.nameMailing = nameMailing;
    }

    public String getNameMailing() {
        return nameMailing;
    }


    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactTitle() {
        return contactTitle;
    }


    public void setRemark(String remark1) {
        this.remark = remark1;
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


    public void setEntityNameContact(String nameAlpha) {
        this.entityNameContact = nameAlpha;
    }

    public String getEntityNameContact() {
        return entityNameContact;
    }


    public void setDescription1(String descripCompressed) {
        this.description1 = descripCompressed;
    }

    public String getDescription1() {
        return description1;
    }


    public void setGiveName(String nameGiven) {
        this.giveName = nameGiven;
    }

    public String getGiveName() {
        return giveName;
    }


    public void setMiddleName(String nameMiddle) {
        this.middleName = nameMiddle;
    }

    public String getMiddleName() {
        return middleName;
    }


    public void setSurname(String nameSurname) {
        this.surname = nameSurname;
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


    public void setMailingNameSecondary(String secondaryMailingName) {
        this.mailingNameSecondary = secondaryMailingName;
    }

    public String getMailingNameSecondary() {
        return mailingNameSecondary;
    }


    public void setEntityNameSecondary(String kanjialpha) {
        this.entityNameSecondary = kanjialpha;
    }

    public String getEntityNameSecondary() {
        return entityNameSecondary;
    }


    public void setContactTypeCode(String contactType) {
        this.contactTypeCode = contactType;
    }

    public String getContactTypeCode() {
        return contactTypeCode;
    }


    public void setNickName(String nameNick) {
        this.nickName = nameNick;
    }

    public String getNickName() {
        return nickName;
    }


    public void setGenderCode(String genderMaleFemale) {
        this.genderCode = genderMaleFemale;
    }

    public String getGenderCode() {
        return genderCode;
    }


    public void setDayOfBirth(Integer dayDateOfBirth) {
        this.dayOfBirth = dayDateOfBirth;
    }

    public void setDayDateOfBirth(MathNumeric dayDateOfBirth) {
        if (dayDateOfBirth != null)
            this.dayOfBirth = new Integer(dayDateOfBirth.intValue());
    }

    public Integer getDayOfBirth() {
        return dayOfBirth;
    }


    public void setMonthOfBirth(Integer monthDateOfBirth) {
        this.monthOfBirth = monthDateOfBirth;
    }

    public void setMonthDateOfBirth(MathNumeric monthDateOfBirth) {
        if (monthDateOfBirth != null)
            this.monthOfBirth = new Integer(monthDateOfBirth.intValue());
    }

    public Integer getMonthOfBirth() {
        return monthOfBirth;
    }


    public void setYearOfBirth(Integer yearDateOfBirth) {
        this.yearOfBirth = yearDateOfBirth;
    }

    public void setYearDateOfBirth(MathNumeric yearDateOfBirth) {
        if (yearDateOfBirth != null)
            this.yearOfBirth = new Integer(yearDateOfBirth.intValue());
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }


    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionCode() {
        return functionCode;
    }


    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }


    public void setPrimaryContactCode(String primaryContact) {
        this.primaryContactCode = primaryContact;
    }

    public String getPrimaryContactCode() {
        return primaryContactCode;
    }


    public void setCategoryCodesContact(CategoryCodesContact categoryCodesContact) {
        if (categoryCodesContact != null)
            this.categoryCodesContact = categoryCodesContact;
    }

    public CategoryCodesContact getCategoryCodesContact() {
        return categoryCodesContact;
    }


    public void setEntity(Entity entity) {
        if (entity != null)
            this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    //Method added for SAR 8635730

    /**
     * The mapFromPublished function takes the InternalGetContactsWhereFields vo and maps
     * the GetContact vo values into the corresponding InternalGetContactsWhereFields
     * values to be passed into the E1 business function during processing.  
     * It also calls entity processor utility for all entities.
     * @param context
     * @param connection
     * @param vo
     * @return
     */
    public E1MessageList mapFromPublished(IContext context, 
                                          IConnection connection, 
                                          InternalGetContactsWhereFields vo) {
        E1MessageList messages = null;

        //Call Entity Processor for the Entities
        if (this.entity != null) {
            messages = 
                    EntityProcessor.processEntity(context, connection, this.entity);
            if (messages != null && messages.getE1Messages().length > 0) {
                messages.setMessagePrefix("Entity Processor Contact");
            }
        }

        vo.setF0111_AN8(this.entity.getEntityId());
        vo.setF0111_IDLN(this.contactID);
        vo.setF0111_DSS5(this.displaySequence);
        vo.setF0111_MLNM(this.nameMailing);
        vo.setF0111_ATTL(this.contactTitle);
        vo.setF0111_REM1(this.remark);
        vo.setF0111_SLNM(this.salutationName);
        vo.setF0111_ALPH(this.entityNameContact);
        vo.setF0111_DC(this.description1);
        vo.setF0111_GNNM(this.giveName);
        vo.setF0111_MDNM(this.middleName);
        vo.setF0111_SRNM(this.surname);
        vo.setF0111_TYC(this.typeCode);
        vo.setF0111_MLN1(this.mailingNameSecondary);
        // SAR 8681761 - ALP1 should map to entityNameSecondary
        vo.setF0111_ALP1(this.entityNameSecondary);
        vo.setF0111_NTYP(this.contactTypeCode);
        vo.setF0111_NICK(this.nickName);
        vo.setF0111_GEND(this.genderCode);
        vo.setF0111_DDATE(this.dayOfBirth);
        vo.setF0111_DMON(this.monthOfBirth);
        vo.setF0111_DYR(this.yearOfBirth);
        vo.setF0111_FUCO(this.functionCode);
        vo.setF0111_PCM(this.preferredContactMethod);
        vo.setF0111_PCF(this.primaryContactCode);

        CategoryCodesContact catCodes = this.categoryCodesContact;
        vo.setF0111_W001(catCodes.getCategoryCode001());
        vo.setF0111_W002(catCodes.getCategoryCode002());
        vo.setF0111_W003(catCodes.getCategoryCode003());
        vo.setF0111_W004(catCodes.getCategoryCode004());
        vo.setF0111_W005(catCodes.getCategoryCode005());
        vo.setF0111_W006(catCodes.getCategoryCode006());
        vo.setF0111_W007(catCodes.getCategoryCode007());
        vo.setF0111_W008(catCodes.getCategoryCode008());
        vo.setF0111_W009(catCodes.getCategoryCode009());
        vo.setF0111_W010(catCodes.getCategoryCode010());
        vo.setF0111_WN001(catCodes.getCategoryCode011());
        vo.setF0111_WN002(catCodes.getCategoryCode012());
        vo.setF0111_WN003(catCodes.getCategoryCode013());
        vo.setF0111_WN004(catCodes.getCategoryCode014());
        vo.setF0111_WN005(catCodes.getCategoryCode015());
        vo.setF0111_WN006(catCodes.getCategoryCode016());
        vo.setF0111_WN007(catCodes.getCategoryCode017());
        vo.setF0111_WN008(catCodes.getCategoryCode018());
        vo.setF0111_WN009(catCodes.getCategoryCode019());
        vo.setF0111_WN010(catCodes.getCategoryCode020());

        return messages;
    }
}
