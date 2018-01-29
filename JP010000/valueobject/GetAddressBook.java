package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100002.valueobject.InternalGetAddressBook;
import oracle.e1.bssv.J0100002.valueobject.InternalGetAddressBookWhereFields;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSSVDataFormatterException;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;


//Top level Published Business Service input value object for getAddressBook
public class GetAddressBook extends ValueObject implements Serializable {
    public GetAddressBook() {

    }

    /**
     * Entity Name<br>
     * <p>
     * The text that names or describes an address book record.    <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String entityName = null;

    /**
     * Business Unit<br>
     * <p>
     * An alphanumeric code that identifies a separate entity within a business for which you want to track costs. <br>
     * For example, a business unit might be a warehouse location, job, project, work center, branch, or plant.<br>
     * You can assign a business unit to a document, entity, or person for purposes of responsibility reporting. <BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String businessUnit = null;

    /**
     * Industry Classification Code<br>
     * <p>
     * A code that classifies goods and services. This code can be in the format of<br>
     * any one of the following systems of classification: <BR>
     * o Standard Industrial Classification (SIC) or North American Industry Classification<br>
     *   System (NAICS). A numerical system used in the United States to classify goods and services. <br>
     *   This code is four (SIC) or six (NAICS) digits.<BR>
     * o Harmonized System (HS). The international method of classifying goods.<br>
     *   More than fifty countries use this code. It can be up to 10 digits.<BR>
     * o Standard Industrial Trade Classification (SITC). A numerical code <br>
     *   system developed by the United Nations to classify goods used in<br>
     *   international trade. International organizations use this code. <BR>
     *   It can be up to six digits.<br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SIC <br>
     * EnterpriseOne field length:  10 <br>
     */
    private String industryClassificationCode = null;

    /**
     * Language<br>
     * <p>
     * A prefered language associated with an individual address record.    <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNGP <br>
     * EnterpriseOne field length:  2 <br>
     */
    private String languageCode = null;

    /**
     * Entity Type Code<br>
     * <p>
     * A user defined code (01/ST) that specifies a kind of address book record <br>
     * </p>
     * Examples include: <br>
     *      E Employees<br>
     *      X Ex-employees<br>
     *      V Suppliers<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias:AT1 <br>
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)<BR>
     */
    private

    String entityTypeCode = null;

    /**
     * Entity<br>
     * Key Field: True<br>
     */
    private Entity entity = new Entity();

    /**
     * Get Address<br>
     */
    private GetAddress address = new GetAddress();

    /**
     * Address Book Category Codes<br>
     */
    private CategoryCodesAddressBook categoryCodesAddressBook = 
        new CategoryCodesAddressBook();

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setIndustryClassificationCode(String industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode;
    }

    public String getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    public void setEntity(Entity entity) {

        //just in case setter is called with null, re-initialize comppound object
        if (entity == null) {
            this.entity = new Entity();
        } else {
            this.entity = entity;

        }
    }

    public Entity getEntity() {
        return entity;
    }

    public void setAddress(GetAddress address) {

        //just in case setter is called with null, re-initialize comppound object
        if (address == null) {
            this.address = new GetAddress();
        } else {
            this.address = address;
        }

    }

    public GetAddress getAddress() {
        return address;
    }

    public void setCategoryCodesAddressBook(CategoryCodesAddressBook categoryCodesAddressBook) {

        //just in case setter is called with null, re-initialize comppound object
        if (categoryCodesAddressBook == null) {
            this.categoryCodesAddressBook = new CategoryCodesAddressBook();
        } else {
            this.categoryCodesAddressBook = categoryCodesAddressBook;

        }

    }

    public CategoryCodesAddressBook getCategoryCodesAddressBook() {
        return categoryCodesAddressBook;
    }

    //Method added for SAR 8635730

    /**
     * The mapFromPublished function takes the InternalGetAddressBookWhereFields vo and maps
     * the GetAddressBook vo values into the corresponding InternalGetAddressBookWhereFields values 
     * to be passed into the E1 query during processing.  It also formats the 
     * business unit field and calls entity processor utility for all entities.
     * @param context
     * @param connection
     * @param vo
     * @return
     */
    public E1MessageList mapFromPublished(IContext context, 
                                          IConnection connection, 
                                          InternalGetAddressBookWhereFields vo) {

        E1MessageList retMessages = new E1MessageList();

        // Format MCU        
        E1MessageList mcuMessages = new E1MessageList();
        String formattedMCU = null;
        if (this.getBusinessUnit() != null) {
            try {
                formattedMCU = 
                        context.getBSSVDataFormatter().format(this.getBusinessUnit(), 
                                                              "MCU");
                //Set in internal VO
                vo.setF0101_MCU(formattedMCU);
            } catch (BSSVDataFormatterException e) {
                context.getBSSVLogger().app(context, 
                                            "Error when formatting Business Unit.", 
                                            null, this, e);
                //Create new E1 Message with error from exception
                mcuMessages.addMessage(new E1Message(context, "002FIS", 
                                                     this.getBusinessUnit()));
                mcuMessages.setMessagePrefix("Format MCU from Get Address Book: ");
                retMessages.addMessages(mcuMessages);
            }
        }

        //entity
        vo.setF0101_AN8(this.entity.getEntityId());
        vo.setF0101_TAX(this.entity.getEntityTaxId());
        vo.setF0101_ALKY(this.entity.getEntityLongId());

        //mappings from published to internal
        vo.setF0101_ALPH(this.entityName);
        vo.setF0101_AT1(this.entityTypeCode);
        vo.setF0101_SIC(this.industryClassificationCode);
        vo.setF0101_LNGP(this.languageCode);

        GetAddress getAddress = this.address;
        vo.setF0116_COUN(getAddress.getCountyCode());
        vo.setF0116_ADDS(getAddress.getStateCode());
        vo.setF0116_ADDZ(getAddress.getPostalCode());
        vo.setF0116_CTR(getAddress.getCountryCode());

        CategoryCodesAddressBook ccAB = this.categoryCodesAddressBook;
        vo.setF0101_AC01(ccAB.getCategoryCode001());
        vo.setF0101_AC02(ccAB.getCategoryCode002());
        vo.setF0101_AC03(ccAB.getCategoryCode003());
        vo.setF0101_AC04(ccAB.getCategoryCode004());
        vo.setF0101_AC05(ccAB.getCategoryCode005());
        vo.setF0101_AC06(ccAB.getCategoryCode006());
        vo.setF0101_AC07(ccAB.getCategoryCode007());
        vo.setF0101_AC08(ccAB.getCategoryCode008());
        vo.setF0101_AC09(ccAB.getCategoryCode009());
        vo.setF0101_AC10(ccAB.getCategoryCode010());
        vo.setF0101_AC11(ccAB.getCategoryCode011());
        vo.setF0101_AC12(ccAB.getCategoryCode012());
        vo.setF0101_AC13(ccAB.getCategoryCode013());
        vo.setF0101_AC14(ccAB.getCategoryCode014());
        vo.setF0101_AC15(ccAB.getCategoryCode015());
        vo.setF0101_AC16(ccAB.getCategoryCode016());
        vo.setF0101_AC17(ccAB.getCategoryCode017());
        vo.setF0101_AC18(ccAB.getCategoryCode018());
        vo.setF0101_AC19(ccAB.getCategoryCode019());
        vo.setF0101_AC20(ccAB.getCategoryCode020());
        vo.setF0101_AC21(ccAB.getCategoryCode021());
        vo.setF0101_AC22(ccAB.getCategoryCode022());
        vo.setF0101_AC23(ccAB.getCategoryCode023());
        vo.setF0101_AC24(ccAB.getCategoryCode024());
        vo.setF0101_AC25(ccAB.getCategoryCode025());
        vo.setF0101_AC26(ccAB.getCategoryCode026());
        vo.setF0101_AC27(ccAB.getCategoryCode027());
        vo.setF0101_AC28(ccAB.getCategoryCode028());
        vo.setF0101_AC29(ccAB.getCategoryCode029());
        vo.setF0101_AC30(ccAB.getCategoryCode030());

        return retMessages;
    }
}
