package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.ValueObject;


public class AddressBookResult extends ValueObject {
    public AddressBookResult() {
    }

    /**
     * Entity Type Code<br>
     * <P>
     * A user defined code (01/ST) that specifies a kind of address book record <br>
     * </P>
     * Examples include:<BR>
     *      E Employees<BR>
     *      X Ex-employees<BR>
     *      V Suppliers<BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: AT1 <br>
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)<BR>
     */
    private String entityTypeCode;

    /**
     * Business Unit<BR>
     * <p>
     * An alphanumeric code that identifies a separate entity within a business for which you want to track costs. <BR>
     * For example, a business unit might be a warehouse location, job, project, work center, branch, or plant.<BR>
     * You can assign a business unit to a document, entity, or person for purposes of responsibility reporting. <BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 (Data exceeding this length will be truncated)<BR>
     */
    private String businessUnit;

    /**
     * Name<BR>
     * <p>
     * The text that names or describes an address book record.    <BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: ALPH <br>
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)<BR>
     */
    private String entityName;

    /**
     * Secondary  Name<BR>
     * <p>
     * An alternate name field in the Address Book system to accommodate double-byte coding.<BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: ALP1 <br>
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)<BR>
     */
    private String entityNameSecondary;

    /**
     * Language<BR>
     * <p>
     * A prefered language associated with an individual address record.<BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: LNGP <br>
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)<br>
     */
    private String languageCode;

    /**
     * Industry Classification Code<BR>
     * <p>
     * A code that classifies goods and services. This code can be in the format of<br>
     * any one of the following systems of classification:<BR>
     * o Standard Industrial Classification (SIC) or North American Industry Classification<br>
     *   System (NAICS). A numerical system used in the United States to classify goods and services. <br>
     *   This code is four (SIC) or six (NAICS) digits.<BR>
     * o Harmonized System (HS). The international method of classifying goods.<br>
     *   More than fifty countries use this code. It can be up to 10 digits.<BR>
     * o Standard Industrial Trade Classification (SITC). A numerical code <br>
     *   system developed by the United Nations to classify goods used in<br>
     *   international trade. International organizations use this code. It can be up to six digits.<BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: SIC <br>
     * EnterpriseOne field length:  10 (Data exceeding this length will be truncated)<br>
     */
    private String industryClassificationCode;

    /**
     * Remark<BR>
     * <p>
     * A generic field that you use for a remark, description, name, or address.<BR>
     * &NOTE: Data for Company and Business Unit fields may be entered without concern<br>
     * for special E1 formatting and necessary formatting will take place during processing.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: RMK <br>
     * EnterpriseOne field length:  30 (Data exceeding this length will be truncated)<br>
     */
    private String remark;

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
     * Credit Message<BR>
     * <p>
     * A value in the user defined code table 00/CM that indicates the credit status <br>
     * of a customer or supplier. <BR>
     * Examples are:<BR>
     * 1 - Over credit limit <BR>
     * 2 - Requires purchase order <BR>
     * 3 - Not on contract maintenance agreement.<BR>
     * The credit message displays on inquiry and transaction entry forms in the <br>
     * Accounts Payable, Sales Order Management, and Procurement systems. <BR>
     * The system displays the temporary credit message in the Accounts Receivable system.<BR>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: CM <br>
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)<br>
     */
    private String creditMessageCode;

    /**
     * Person/Corporation Code<BR>
     * <p>
     * A code that designates the type of taxpayer. <BR>
     * For 1099 reporting for U.S. suppliers and foreign suppliers, the system chooses only records with a code of P or N.<BR><BR>
     * Valid values for U.S. entities are:<BR>
     * Blank or C - Corporate entity (the Tax ID prints as 12-3456789)<BR>
     * P - Individual (the Tax ID prints as 123-45-6789)<BR>
     * N - Noncorporate entity (the Tax ID prints as 12-3456789)<BR><BR>
     * Valid values for non-U.S. entities are:<BR>
     * 1 - Individual<BR>
     * 2 - Corporate entity<BR>
     * 3 - Both an individual and a corporate entity<BR>
     * 4 - Noncorporate entity<BR>
     * 5 - Customs authority<BR>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: TAXC <br>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)<br>
     */
    private String personCorporationCode;

    /**
     * Subledger Inactive Code<br>
     * <p>
     * An option that indicates whether a specific subledger is inactive.<br>
     * Examples of inactive subledgers are jobs that are closed, employees who<br>
     * have been terminated, or assets that have been disposed. Turn on this<br>
     * option to indicate that a subledger is inactive. If a subledger becomes<br>
     * active again, turn off this option. If you want to use subledger<br>
     * information in the tables for reports, but you want to prevent<br>
     * transactions from posting to the record in the Account Balances table<br>
     * (F0902), turn on this option. Valid values are:<br>
     * <br>
     * Off<br>
     * Subledger active<br>
     * <br>
     * On<br>
     * Subledger inactive<br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SBLI <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String subledgerInactiveCode = null;

    /**
     * Tax ID - Additional - Individual<br>
     * <p>
     * An identification number assigned by a tax authority to an individual, <br>
     * in addition to the primary Tax ID number.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: TX2 <br>
     * EnterpriseOne field length:  20 (Data exceeding this length will be truncated)<br>
     */
    private String entityTaxIdAdditional;

    /**
     * Certificate, Tax Exemption<br>
     * <p>
     * The number that tax authorities issue to tax-exempt individuals and companies <br>
     * to identify their tax-exempt status.<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: TXCT <br>
     * EnterpriseOne field length:  20 (Data exceeding this length will be truncated)<br>
     */
    private String taxExemptCertificate;

    /**
     * AR/AP Netting Indicator<br>
     * <p>
     * An option that indicates whether you can use an address in the A/R and A/P netting process.<br>
     * Valid values are:<br>
     * (true) AR/AP netting can be used<br>
     * (false) AR/AP netting cannot be used<br>
     * EnterpriseOne Default value: N (false)<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: AT2 <br>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)<br>
     */
    private Boolean isEntityTypeNettingIndicator;

    /**
     * Entity Type 3 - HRM Records Exist<br>
     * <p>
     * A value that indicates whether the record has a corresponding record in<br>
     * the tables of the Workforce Management system. The Address Book Master<br>
     * Business Function synchronizes values in the Name and Tax ID fields in<br>
     * both the Address Book and Workforce Management systems when the value is<br>
     * Y.<br>
     * <br>
     * Valid values are:<br>
     * <br>
     * Y<br>
     * The record has a corresponding record in the Workforce Management tables<br>
     * <br>
     * N<br>
     * The record does not have a corresponding record in the Workforce<br>
     * Management tables<br>
     * <br>
     * <br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AT3 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String isEntityType3 = null;

    /**
     * Address Type - 4<br>
     * <p>
     * Reserved by J.D. Edwards.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AT4 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String isEntityType4 = null;

    /**
     * Address Type - 5<br>
     * <p>
     * Reserved by J.D. Edwards.<br>
     * <br>
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AT5 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String isEntityType5 = null;


    /**
     * Address Type - Payables<br>
     * <p>
     * A code that identifies the address as a supplier. <br>
     * Valid values are:<br>
     * (true) Yes, this is a supplier. A processing option specifies whether the supplier master record appears automatically after you add an address.<br>
     * (false) No, this is not a supplier. This code does not prevent you from entering a voucher for the address.<br>
     * EnterpriseOne Default value: N (false)<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: ATP <br>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)<br>
     */
    private Boolean isEntityTypePayables;

    /**
     * Address Type - Receivables<br>
     * <p>
     * An option that identifies the address number as that of a customer. <br>
     * Valid settings are:<br>
     * (true) This is a customer.<br>
     * (false) This is not a customer.<br>
     * EnterpriseOne Default value: N (false)<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: ATR <br>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)<br>
     */
    private Boolean isEntityTypeReceivables;

    /**
     * Address Type - Code, Purchaser<br>
     * <p>
     * An option that you define in the data dictionary to reference an address. <br>
     * You can use this option to identify information that is pertinent to your business.<br>
     * No predefined definitions exist for this option.<br>
     * EnterpriseOne Default value: N (false)<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: ATPR <br>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)<br>
     */
    private Boolean isEntityTypePurchaser;

    /**
     * Address Type - Employee<br>
     * <p>
     * An option that indicates whether this address number represents an employee.<br>
     * Valid values are:<br>
     * (true) The address number represents an employee<br>
     * (false) The address number does not represent an employee<br>
     * EnterpriseOne Default value: N (false)<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: ATE <br>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)<br>
     */
    private Boolean isEntityTypeEmployee;


    /**
     * Employee Group Approvals<br>
     * <p>
     * Employee Group only used in Approval Processing<br>
     * </p>
     * EnterpriseOne Key Field: NO <br>
     * EnterpriseOne Alias: AEMPGP <br>
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)<br>
     */
    private String employeeGroupApprovalsCode;


    Entity entity = new Entity();
    RelatedAddress relatedAddress = new RelatedAddress();
    Address address = new Address();
    CategoryCodesAddressBook categoryCodesAddressBook = 
        new CategoryCodesAddressBook();
    Classifications classifications = new Classifications();
    UserReservedData userReservedData = new UserReservedData();
    ShowStatistics statistics = new ShowStatistics();
    Stock stock = new Stock();
    Parent[] parents;
    PhoneNumberRecord[] phoneNumbers;
    ElectronicAddressRecord[] electronicAddresses;

    public void setEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityNameSecondary(String entityNameSecondary) {
        this.entityNameSecondary = entityNameSecondary;
    }

    public String getEntityNameSecondary() {
        return entityNameSecondary;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setIndustryClassificationCode(String industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode;
    }

    public String getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setDescription1(String descripCompressed) {
        this.description1 = descripCompressed;
    }

    public String getDescription1() {
        return description1;
    }


    public void setCreditMessageCode(String creditMessageCode) {
        this.creditMessageCode = creditMessageCode;
    }

    public String getCreditMessageCode() {
        return creditMessageCode;
    }

    public void setPersonCorporationCode(String personCorporationCode) {
        this.personCorporationCode = personCorporationCode;
    }

    public String getPersonCorporationCode() {
        return personCorporationCode;
    }

    public void setSubledgerInactiveCode(String subledgerInactiveCode) {
        this.subledgerInactiveCode = subledgerInactiveCode;
    }

    public String getSubledgerInactiveCode() {
        return subledgerInactiveCode;
    }

    public void setEntityTaxIdAdditional(String entityTaxIdAdditional) {
        this.entityTaxIdAdditional = entityTaxIdAdditional;
    }

    public String getEntityTaxIdAdditional() {
        return entityTaxIdAdditional;
    }

    public void setTaxExemptCertificate(String taxExemptCertificate) {
        this.taxExemptCertificate = taxExemptCertificate;
    }

    public String getTaxExemptCertificate() {
        return taxExemptCertificate;
    }

    public void setIsEntityTypeNettingIndicator(Boolean isEntityTypeNettingIndicator) {
        this.isEntityTypeNettingIndicator = isEntityTypeNettingIndicator;
    }

    public void setIsEntityTypeNettingIndicator(String isEntityTypeNettingIndicator) {
        this.isEntityTypeNettingIndicator = 
                this.transformToBoolean(isEntityTypeNettingIndicator);
    }

    public Boolean getIsEntityTypeNettingIndicator() {
        return isEntityTypeNettingIndicator;
    }

    public Boolean isIsEntityTypeNettingIndicator() {
        return isEntityTypeNettingIndicator;
    }

    public void setIsEntityType3(String isEntityType3) {
        this.isEntityType3 = isEntityType3;
    }

    public String getIsEntityType3() {
        return isEntityType3;
    }

    public void setIsEntityType4(String isEntityType4) {
        this.isEntityType4 = isEntityType4;
    }

    public String getIsEntityType4() {
        return isEntityType4;
    }

    public void setIsEntityType5(String isEntityType5) {
        this.isEntityType5 = isEntityType5;
    }

    public String getIsEntityType5() {
        return isEntityType5;
    }

    public void setIsEntityTypePayables(Boolean isEntityTypePayables) {
        this.isEntityTypePayables = isEntityTypePayables;
    }

    public void setIsEntityTypePayables(String isEntityTypePayables) {
        this.isEntityTypePayables = 
                this.transformToBoolean(isEntityTypePayables);
    }

    public Boolean getIsEntityTypePayables() {
        return isEntityTypePayables;
    }

    public Boolean isIsEntityTypePayables() {
        return isEntityTypePayables;
    }

    public void setIsEntityTypeReceivables(Boolean isEntityTypeReceivables) {
        this.isEntityTypeReceivables = isEntityTypeReceivables;
    }

    public void setIsEntityTypeReceivables(String isEntityTypeReceivables) {
        this.isEntityTypeReceivables = 
                this.transformToBoolean(isEntityTypeReceivables);
    }

    public Boolean getIsEntityTypeReceivables() {
        return isEntityTypeReceivables;
    }

    public Boolean isIsEntityTypeReceivables() {
        return isEntityTypeReceivables;
    }

    public void setIsEntityTypePurchaser(Boolean isEntityTypePurchaser) {
        this.isEntityTypePurchaser = isEntityTypePurchaser;
    }

    public void setIsEntityTypePurchaser(String isEntityTypePurchaser) {
        this.isEntityTypePurchaser = 
                this.transformToBoolean(isEntityTypePurchaser);
    }

    public Boolean getIsEntityTypePurchaser() {
        return isEntityTypePurchaser;
    }

    public Boolean isIsEntityTypePurchaser() {
        return isEntityTypePurchaser;
    }

    public void setIsEntityTypeEmployee(Boolean isEntityTypeEmployee) {
        this.isEntityTypeEmployee = isEntityTypeEmployee;
    }

    public void setIsEntityTypeEmployee(String isEntityTypeEmployee) {
        this.isEntityTypeEmployee = 
                this.transformToBoolean(isEntityTypeEmployee);
    }

    public Boolean getIsEntityTypeEmployee() {
        return isEntityTypeEmployee;
    }

    public Boolean isIsEntityTypeEmployee() {
        return isEntityTypeEmployee;
    }

    public void setEmployeeGroupApprovalsCode(String employeeGroupApprovalsCode) {
        this.employeeGroupApprovalsCode = employeeGroupApprovalsCode;
    }

    public String getEmployeeGroupApprovalsCode() {
        return employeeGroupApprovalsCode;
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

    public void setRelatedAddress(RelatedAddress relatedAddress) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress == null) {
            this.relatedAddress = new RelatedAddress();
        } else {
            this.relatedAddress = relatedAddress;
        }
    }

    public RelatedAddress getRelatedAddress() {
        return relatedAddress;
    }

    public void setAddress(Address address) {
        //just in case setter is called with null, re-initialize comppound object
        if (address == null) {
            this.address = new Address();
        } else {
            this.address = address;
        }
    }

    public Address getAddress() {
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

    public void setClassifications(Classifications classifications) {
        //just in case setter is called with null, re-initialize comppound object
        if (classifications == null) {
            this.classifications = new Classifications();
        } else {
            this.classifications = classifications;
        }
    }

    public Classifications getClassifications() {
        return classifications;
    }

    public void setUserReservedData(UserReservedData userReservedData) {
        //just in case setter is called with null, re-initialize comppound object
        if (userReservedData == null) {
            this.userReservedData = new UserReservedData();
        } else {
            this.userReservedData = userReservedData;
        }
    }

    public UserReservedData getUserReservedData() {
        return userReservedData;
    }

    public void setStatistics(ShowStatistics statistics) {
        //just in case setter is called with null, re-initialize comppound object
        if (statistics == null) {
            this.statistics = new ShowStatistics();
        } else {
            this.statistics = statistics;
        }
    }

    public ShowStatistics getStatistics() {
        return statistics;
    }

    public void setStock(Stock stock) {
        //just in case setter is called with null, re-initialize comppound object
        if (stock == null) {
            this.stock = new Stock();
        } else {
            this.stock = stock;
        }
    }

    public Stock getStock() {
        return stock;
    }

    public void setPhoneNumbers(PhoneNumberRecord[] phones) {
        this.phoneNumbers = phones;
    }

    public PhoneNumberRecord[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setElectronicAddresses(ElectronicAddressRecord[] electronicAddresses) {
        this.electronicAddresses = electronicAddresses;
    }

    public ElectronicAddressRecord[] getElectronicAddresses() {
        return electronicAddresses;
    }

    public void setElectronicAddresses(int i, 
                                       ElectronicAddressRecord electronicAddresses) {
        this.electronicAddresses[i] = electronicAddresses;
    }

    public void setPhoneNumbers(int i, PhoneNumberRecord phoneNumber) {
        this.phoneNumbers[i] = phoneNumber;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParent(int i, Parent parent) {
        this.parents[i] = parent;
    }
}
