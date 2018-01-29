package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.ValueObject;


public class AddressBook extends ValueObject implements Serializable {

    /**
     * Entity Type Code
     * <P>
     * A user defined code (01/ST) that specifies a kind of address book record 
     * </P>
     * Examples include:<BR>
     *      E Employees<BR>
     *      X Ex-employees<BR>
     *      V Suppliers<BR>
     *      C Customers<BR>
     * EnterpriseOne field length:  3 (Data exceeding this length will be truncated)<BR>
     */
    private String entityTypeCode;

    /**
     * Business Unit<BR>
     * An alphanumeric code that identifies a separate entity within a business for which you want to track costs. <BR>
     * For example, a business unit might be a warehouse location, job, project, work center, branch, or plant.<BR>
     * You can assign a business unit to a document, entity, or person for purposes of responsibility reporting. <BR>
     * EnterpriseOne field length:  12 (Data exceeding this length will be truncated)<BR>
     */
    private String businessUnit;

    /**
     * Name<BR>
     * The text that names or describes an address book record.    <BR>
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)<BR>
     */
    private String entityName;

    /**
     * Secondary  Name<BR>
     * An alternate name field in the Address Book system to accommodate double-byte coding.<BR>
     * EnterpriseOne field length:  40 (Data exceeding this length will be truncated)<BR>
     */
    private String entityNameSecondary;

    /**
     * Language<BR>
     * A prefered language associated with an individual address record.<BR>
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)
     */
    private String languageCode;

    /**
     * Industry Classification Code<BR>
     * A code that classifies goods and services. This code can be in the format of
     * any one of the following systems of classification:<BR>
     * o Standard Industrial Classification (SIC) or North American Industry Classification
     *   System (NAICS). A numerical system used in the United States to classify goods and services. 
     *   This code is four (SIC) or six (NAICS) digits.<BR>
     * o Harmonized System (HS). The international method of classifying goods.
     *   More than fifty countries use this code. It can be up to 10 digits.<BR>
     * o Standard Industrial Trade Classification (SITC). A numerical code 
     *   system developed by the United Nations to classify goods used in
     *   international trade. International organizations use this code. It can be up to six digits.<BR>
     * EnterpriseOne field length:  10 (Data exceeding this length will be truncated)
     */
    private String industryClassificationCode;

    /**
     * Remark<BR>
     * A generic field that you use for a remark, description, name, or address.<BR>
     * EnterpriseOne field length:  30 (Data exceeding this length will be truncated)
     */
    private String remark;

    /**
     * callSalesTeamAlignment<BR>
     * A flag that drives processing in the address book related to sales team alignement.<BR>
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     */
    private String callSalesTeamAlignment;

    /**
     * Credit Message<BR>
     * A value in the user defined code table 00/CM that indicates the credit status 
     * of a customer or supplier. <BR>
     * Examples are:<BR>
     * 1 - Over credit limit <BR>
     * 2 - Requires purchase order <BR>
     * 3 - Not on contract maintenance agreement.<BR>
     * The credit message displays on inquiry and transaction entry forms in the 
     * Accounts Payable, Sales Order Management, and Procurement systems. <BR>
     * The system displays the temporary credit message in the Accounts Receivable system.<BR>
     * EnterpriseOne field length:  2 (Data exceeding this length will be truncated)
     */
    private String creditMessageCode;

    /**
     * Person/Corporation Code<BR>
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
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     */
    private String personCorporationCode;

    /**
     * Tax ID - Additional - Individual
     * An identification number assigned by a tax authority to an individual, 
     * in addition to the primary Tax ID number.
     * EnterpriseOne field length:  20 (Data exceeding this length will be truncated)
     */
    private String entityTaxIdAdditional;

    /**
     * Certificate, Tax Exemption
     * The number that tax authorities issue to tax-exempt individuals and companies 
     * to identify their tax-exempt status.
     * EnterpriseOne field length:  20 (Data exceeding this length will be truncated)
     */
    private String taxExemptCertificate;

    /**
     * AR/AP Netting Indicator
     * An option that indicates whether you can use an address in the A/R and A/P netting process.
     * Valid values are:
     * (true) AR/AP netting can be used
     * (false) AR/AP netting cannot be used
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     * EnterpriseOne Default value: N (false)
     */
    private Boolean isEntityTypeNettingIndicator;

    /**
     * Address Type - Payables
     * A code that identifies the address as a supplier. 
     * Valid values are:
     * (true) Yes, this is a supplier. A processing option specifies whether the supplier master record appears automatically after you add an address.
     * (false) No, this is not a supplier. This code does not prevent you from entering a voucher for the address.
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     * EnterpriseOne Default value: N (false)
     */
    private Boolean isEntityTypePayables;

    /**
     * Address Type - Receivables
     * An option that identifies the address number as that of a customer. 
     * Valid settings are:
     * (true) This is a customer.
     * (false) This is not a customer.
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     * EnterpriseOne Default value: N (false)
     */
    private Boolean isEntityTypeReceivables;

    /**
     * Address Type - Code, Purchaser
     * An option that you define in the data dictionary to reference an address. 
     * You can use this option to identify information that is pertinent to your business.
     * No predefined definitions exist for this option.
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     * EnterpriseOne Default value: N (false)
     */
    private Boolean isEntityTypePurchaser;

    /**
     * Address Type - Employee
     * An option that indicates whether this address number represents an employee.
     * Valid values are:
     * (true) The address number represents an employee
     * (false) The address number does not represent an employee
     * EnterpriseOne field length:  1 (Data exceeding this length will be truncated)
     * EnterpriseOne Default value: N (false)
     */
    private Boolean isEntityTypeEmployee;


    /**
     * Employee Group Approvals
     * Employee Group only used in Approval Processing
     * EnterpriseOne field length:  5 (Data exceeding this length will be truncated)
     */
    private String employeeGroupApprovalsCode;

    /**
     * Processing
     */
    private Processing processing = new Processing();

    /**
     * Entity
     * Key Field: True
     */
    private Entity entity = new Entity();

    /**
     * Parent
     */
    private Entity parent = new Entity();

    /**
     * Related Enteity 1
     */
    private Entity relatedAddress1 = new Entity();

    /**
     * Related Enteity 2
     */
    private Entity relatedAddress2 = new Entity();

    /**
     * Related Enteity 3
     */
    private Entity relatedAddress3 = new Entity();

    /**
     * Related Enteity 4
     */
    private Entity relatedAddress4 = new Entity();

    /**
     * Related Enteity 5
     */
    private Entity relatedAddress5 = new Entity();

    /**
     * Related Enteity 6
     */
    private Entity relatedAddress6 = new Entity();

    /**
     * Category Codes
     */
    private CategoryCodesAddressBook categoryCodesAddressBook = 
        new CategoryCodesAddressBook();

    /**
     * Classifications
     */
    private Classifications classifications = new Classifications();

    /**
     * Address
     */
    private Address address = new Address();

    /**
     * Stock
     */
    private Stock stock = new Stock();

    /**
     * Statisticas
     */
    private Statistics statistics = new Statistics();

    /**
     * User Reserved
     */
    private UserReservedData userReservedData = new UserReservedData();

    /**
     * Phone Numbers
     */
    private PhoneNumber phoneNumbers[];

    /**
     * Electronic Addresses
     */
    private ElectronicAddress electronicAddresses[];

    public AddressBook() {

    }

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

    public void setCallSalesTeamAlignment(String callSalesTeamAlignment) {
        this.callSalesTeamAlignment = callSalesTeamAlignment;
    }

    public String getCallSalesTeamAlignment() {
        return callSalesTeamAlignment;
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

    public Boolean isIsEntityTypeNettingIndicator() {
        return isEntityTypeNettingIndicator;
    }

    public Boolean getIsEntityTypeNettingIndicator() {
        return isEntityTypeNettingIndicator;
    }

    public void setIsEntityTypePayables(Boolean isEntityTypePayables) {

        this.isEntityTypePayables = isEntityTypePayables;

    }

    public Boolean isIsEntityTypePayables() {

        return isEntityTypePayables;

    }

    public Boolean getIsEntityTypePayables() {

        return isEntityTypePayables;

    }

    public void setIsEntityTypeReceivables(Boolean isEntityTypeReceivables) {

        this.isEntityTypeReceivables = isEntityTypeReceivables;

    }

    public Boolean isIsEntityTypeReceivables() {

        return isEntityTypeReceivables;
    }

    public Boolean getIsEntityTypeReceivables() {

        return isEntityTypeReceivables;
    }

    public void setIsEntityTypePurchaser(Boolean isEntityTypePurchaser) {

        this.isEntityTypePurchaser = isEntityTypePurchaser;

    }

    public Boolean isIsEntityTypePurchaser() {

        return isEntityTypePurchaser;
    }

    public Boolean getIsEntityTypePurchaser() {

        return isEntityTypePurchaser;
    }

    public void setIsEntityTypeEmployee(Boolean isEntityTypeEmployee) {

        this.isEntityTypeEmployee = isEntityTypeEmployee;

    }

    public Boolean isIsEntityTypeEmployee() {

        return isEntityTypeEmployee;
    }

    public Boolean getIsEntityTypeEmployee() {

        return isEntityTypeEmployee;
    }

    public void setEmployeeGroupApprovalsCode(String employeeGroupApprovalsCode) {
        this.employeeGroupApprovalsCode = employeeGroupApprovalsCode;
    }

    public String getEmployeeGroupApprovalsCode() {
        return employeeGroupApprovalsCode;
    }

    public void setProcessing(Processing processing) {
        //just in case setter is called with null, re-initialize comppound object
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

    public void setParent(Entity parent) {
        //just in case setter is called with null, re-initialize comppound object
        if (parent == null) {
            this.parent = new Entity();
        } else {
            this.parent = parent;

        }
    }

    public Entity getParent() {
        return parent;
    }

    public void setRelatedAddress1(Entity relatedAddress1) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress1 == null) {
            this.relatedAddress1 = new Entity();
        } else {
            this.relatedAddress1 = relatedAddress1;

        }
    }

    public Entity getRelatedAddress1() {
        return relatedAddress1;
    }

    public void setRelatedAddress2(Entity relatedAddress2) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress2 == null) {
            this.relatedAddress2 = new Entity();
        } else {
            this.relatedAddress2 = relatedAddress2;
        }
    }

    public Entity getRelatedAddress2() {
        return relatedAddress2;
    }

    public void setRelatedAddress3(Entity relatedAddress3) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress3 == null) {
            this.relatedAddress3 = new Entity();
        } else {
            this.relatedAddress3 = relatedAddress3;

        }
    }

    public Entity getRelatedAddress3() {
        return relatedAddress3;
    }

    public void setRelatedAddress4(Entity relatedAddress4) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress4 == null) {
            this.relatedAddress4 = new Entity();
        } else {
            this.relatedAddress4 = relatedAddress4;

        }
    }

    public Entity getRelatedAddress4() {
        return relatedAddress4;
    }

    public void setRelatedAddress5(Entity relatedAddress5) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress5 == null) {
            this.relatedAddress5 = new Entity();
        } else {
            this.relatedAddress5 = relatedAddress5;

        }
    }

    public Entity getRelatedAddress5() {
        return relatedAddress5;
    }

    public void setRelatedAddress6(Entity relatedAddress6) {
        //just in case setter is called with null, re-initialize comppound object
        if (relatedAddress6 == null) {
            this.relatedAddress6 = new Entity();
        } else {
            this.relatedAddress6 = relatedAddress6;
        }
    }

    public Entity getRelatedAddress6() {
        return relatedAddress6;
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

    public void setStatistics(Statistics statistics) {
        //just in case setter is called with null, re-initialize comppound object
        if (statistics == null) {
            this.statistics = new Statistics();
        } else {
            this.statistics = statistics;
        }
    }

    public Statistics getStatistics() {
        return statistics;
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

    public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setPhoneNumbers(int i, PhoneNumber phone) {
        this.phoneNumbers[i] = phone;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
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

    public void setEntityNameSecondary(String entityNameSecondary) {
        this.entityNameSecondary = entityNameSecondary;
    }

    public String getEntityNameSecondary() {
        return entityNameSecondary;
    }
}
