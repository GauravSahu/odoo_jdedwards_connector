package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.MessageValueObject;

public class LookupAddressBookResult extends MessageValueObject {
    
  /**
   * Search Type
   * <p>
   * A user defined code (01/ST) that specifies the kind of address book record to search for. Examples include:
   * E Employees
   * X Ex-employees
   * V Suppliers
   * C Customers
   * P Prospects
   * M Mail distribution lists
   * TAX Tax authorities
   * </p>
   * EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AT1 <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String entityTypeCode = null;

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
   * Entity<br>
   * Key Field: True<br>
   */
  private Entity entity = new Entity();

  /**
   * Category Codes<br>
   * Key Field: false<br>
   */
  private CategoryCodesAddressBook categoryCodesAddressBook =
      new CategoryCodesAddressBook();

  /**
   * Default public constructor for instantiating: V0101C
   */
  public LookupAddressBookResult() {
  }

  public void setEntity(Entity entity) {

      //just in case setter is called with null, re-initialize comppound object
      if (entity == null) {
          this.entity = new Entity();
      } else {
          this.entity = entity;

      }
  }

  public void setCategoryCodesAddressBook(CategoryCodesAddressBook categoryCodesAddressBook) {

      //just in case setter is called with null, re-initialize comppound object
      if (categoryCodesAddressBook == null) {
          this.categoryCodesAddressBook = new CategoryCodesAddressBook();
      } else {
          this.categoryCodesAddressBook = categoryCodesAddressBook;

      }

  }

  public void setEntityTypeCode(String searchType) {
      this.entityTypeCode = searchType;
  }

  public String getEntityTypeCode() {
      return entityTypeCode;
  }

  public void setEntityName(String entityName) {
      this.entityName = entityName;
  }

  public String getEntityName() {
      return entityName;
  }

  public Entity getEntity() {
      return entity;
  }

  public CategoryCodesAddressBook getCategoryCodesAddressBook() {
      return categoryCodesAddressBook;
  }
    

    public void setEntity1(Entity entity) {
        this.entity = entity;
    }

    public void setCategoryCodesAddressBook1(CategoryCodesAddressBook categoryCodesAddressBook) {
        this.categoryCodesAddressBook = categoryCodesAddressBook;
    }
}
