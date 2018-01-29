package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssv.J0100002.valueobject.InternalShowAddressBook;
import oracle.e1.bssv.J0100009.valueobject.InternalLookupAddressBook;
import oracle.e1.bssv.J0100009.valueobject.InternalShowLookupAddressBook;
import oracle.e1.bssvfoundation.base.MessageValueObject;

public class ShowLookupAddressBook extends MessageValueObject {

    LookupAddressBookResult[] lookupAddressBookResult;


    public ShowLookupAddressBook() {
    }

    public ShowLookupAddressBook(InternalLookupAddressBook internalVO) {
        if (internalVO.getQueryResults() != null) {

            lookupAddressBookResult =
                    new LookupAddressBookResult[internalVO.getQueryResults().size()]; /* create a new array big enough to hold all records in the result set */


            for (int i = 0; i < internalVO.getQueryResults().size();
                 i++) /* loop through all records in the result set */
            {

                //Create a reference to this specific result
                InternalShowLookupAddressBook intVOQueryResult =
                    internalVO.getQueryResults(i);

                lookupAddressBookResult[i] =
                        new LookupAddressBookResult(); /* create a new object in array */
                //Entity
                lookupAddressBookResult[i].getEntity().setEntityId(intVOQueryResult.getF0101_AN8());
                lookupAddressBookResult[i].getEntity().setEntityLongId(intVOQueryResult.getF0101_ALKY());
                lookupAddressBookResult[i].getEntity().setEntityTaxId(intVOQueryResult.getF0101_TAX());

                lookupAddressBookResult[i].setEntityName(intVOQueryResult.getF0101_ALPH().trim());
                lookupAddressBookResult[i].setEntityTypeCode(intVOQueryResult.getF0101_AT1());

                //category codes
                CategoryCodesAddressBook ccAB =
                    lookupAddressBookResult[i].getCategoryCodesAddressBook();
                ccAB.setCategoryCode001(intVOQueryResult.getF0101_AC01());
                ccAB.setCategoryCode002(intVOQueryResult.getF0101_AC02());
                ccAB.setCategoryCode003(intVOQueryResult.getF0101_AC03());
                ccAB.setCategoryCode004(intVOQueryResult.getF0101_AC04());
                ccAB.setCategoryCode005(intVOQueryResult.getF0101_AC05());
                ccAB.setCategoryCode006(intVOQueryResult.getF0101_AC06());
                ccAB.setCategoryCode007(intVOQueryResult.getF0101_AC07());
                ccAB.setCategoryCode008(intVOQueryResult.getF0101_AC08());
                ccAB.setCategoryCode009(intVOQueryResult.getF0101_AC09());
                ccAB.setCategoryCode010(intVOQueryResult.getF0101_AC10());
                ccAB.setCategoryCode011(intVOQueryResult.getF0101_AC11());
                ccAB.setCategoryCode012(intVOQueryResult.getF0101_AC12());
                ccAB.setCategoryCode013(intVOQueryResult.getF0101_AC13());
                ccAB.setCategoryCode014(intVOQueryResult.getF0101_AC14());
                ccAB.setCategoryCode015(intVOQueryResult.getF0101_AC15());
                ccAB.setCategoryCode016(intVOQueryResult.getF0101_AC16());
                ccAB.setCategoryCode017(intVOQueryResult.getF0101_AC17());
                ccAB.setCategoryCode018(intVOQueryResult.getF0101_AC18());
                ccAB.setCategoryCode019(intVOQueryResult.getF0101_AC19());
                ccAB.setCategoryCode020(intVOQueryResult.getF0101_AC20());
                ccAB.setCategoryCode021(intVOQueryResult.getF0101_AC21());
                ccAB.setCategoryCode022(intVOQueryResult.getF0101_AC22());
                ccAB.setCategoryCode023(intVOQueryResult.getF0101_AC23());
                ccAB.setCategoryCode024(intVOQueryResult.getF0101_AC24());
                ccAB.setCategoryCode025(intVOQueryResult.getF0101_AC25());
                ccAB.setCategoryCode026(intVOQueryResult.getF0101_AC26());
                ccAB.setCategoryCode027(intVOQueryResult.getF0101_AC27());
                ccAB.setCategoryCode028(intVOQueryResult.getF0101_AC28());
                ccAB.setCategoryCode029(intVOQueryResult.getF0101_AC29());
                ccAB.setCategoryCode030(intVOQueryResult.getF0101_AC30());
            }


        }
    }


    public void setLookupAddressBookResult(LookupAddressBookResult[] lookupAddressBookResult) {
        this.lookupAddressBookResult = lookupAddressBookResult;
    }

    public LookupAddressBookResult[] getLookupAddressBookResult() {
        return lookupAddressBookResult;
    }
}
