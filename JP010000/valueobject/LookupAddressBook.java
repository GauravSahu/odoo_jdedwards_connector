package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100009.valueobject.InternalLookupAddressBook;
import oracle.e1.bssv.util.J0100010.valueobject.Entity;
import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * LookupAddressBook input VO for lookupAddressBook method of AddressBookManger
 */
public class LookupAddressBook extends ValueObject implements Serializable {
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
    private String enityTypeCode = null;

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
    public LookupAddressBook() {
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

    public void setEnityTypeCode(String searchType) {
        this.enityTypeCode = searchType;
    }

    public String getEnityTypeCode() {
        return enityTypeCode;
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

    public void mapFromPublished(InternalLookupAddressBook internalVO) {
        internalVO.getQueryWhereFields().setF0101_AN8(entity.getEntityId());
        internalVO.getQueryWhereFields().setF0101_TAX(entity.getEntityTaxId());
        internalVO.getQueryWhereFields().setF0101_ALKY(entity.getEntityLongId());
        internalVO.getQueryWhereFields().setF0101_AT1(enityTypeCode);
        internalVO.getQueryWhereFields().setF0101_DC(entityName);


        internalVO.getQueryWhereFields().setF0101_AC01(categoryCodesAddressBook.getCategoryCode001());
        internalVO.getQueryWhereFields().setF0101_AC02(categoryCodesAddressBook.getCategoryCode002());
        internalVO.getQueryWhereFields().setF0101_AC03(categoryCodesAddressBook.getCategoryCode003());
        internalVO.getQueryWhereFields().setF0101_AC04(categoryCodesAddressBook.getCategoryCode004());
        internalVO.getQueryWhereFields().setF0101_AC05(categoryCodesAddressBook.getCategoryCode005());
        internalVO.getQueryWhereFields().setF0101_AC06(categoryCodesAddressBook.getCategoryCode006());
        internalVO.getQueryWhereFields().setF0101_AC07(categoryCodesAddressBook.getCategoryCode007());
        internalVO.getQueryWhereFields().setF0101_AC08(categoryCodesAddressBook.getCategoryCode008());
        internalVO.getQueryWhereFields().setF0101_AC09(categoryCodesAddressBook.getCategoryCode009());
        internalVO.getQueryWhereFields().setF0101_AC10(categoryCodesAddressBook.getCategoryCode010());
        internalVO.getQueryWhereFields().setF0101_AC11(categoryCodesAddressBook.getCategoryCode011());
        internalVO.getQueryWhereFields().setF0101_AC12(categoryCodesAddressBook.getCategoryCode012());
        internalVO.getQueryWhereFields().setF0101_AC13(categoryCodesAddressBook.getCategoryCode013());
        internalVO.getQueryWhereFields().setF0101_AC14(categoryCodesAddressBook.getCategoryCode014());
        internalVO.getQueryWhereFields().setF0101_AC15(categoryCodesAddressBook.getCategoryCode015());
        internalVO.getQueryWhereFields().setF0101_AC16(categoryCodesAddressBook.getCategoryCode016());
        internalVO.getQueryWhereFields().setF0101_AC17(categoryCodesAddressBook.getCategoryCode017());
        internalVO.getQueryWhereFields().setF0101_AC18(categoryCodesAddressBook.getCategoryCode018());
        internalVO.getQueryWhereFields().setF0101_AC19(categoryCodesAddressBook.getCategoryCode019());
        internalVO.getQueryWhereFields().setF0101_AC20(categoryCodesAddressBook.getCategoryCode020());
        internalVO.getQueryWhereFields().setF0101_AC21(categoryCodesAddressBook.getCategoryCode021());
        internalVO.getQueryWhereFields().setF0101_AC22(categoryCodesAddressBook.getCategoryCode022());
        internalVO.getQueryWhereFields().setF0101_AC23(categoryCodesAddressBook.getCategoryCode023());
        internalVO.getQueryWhereFields().setF0101_AC24(categoryCodesAddressBook.getCategoryCode024());
        internalVO.getQueryWhereFields().setF0101_AC25(categoryCodesAddressBook.getCategoryCode025());
        internalVO.getQueryWhereFields().setF0101_AC26(categoryCodesAddressBook.getCategoryCode026());
        internalVO.getQueryWhereFields().setF0101_AC27(categoryCodesAddressBook.getCategoryCode027());
        internalVO.getQueryWhereFields().setF0101_AC28(categoryCodesAddressBook.getCategoryCode028());
        internalVO.getQueryWhereFields().setF0101_AC29(categoryCodesAddressBook.getCategoryCode029());
        internalVO.getQueryWhereFields().setF0101_AC30(categoryCodesAddressBook.getCategoryCode030());

    }
}
