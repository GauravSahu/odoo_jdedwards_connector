package oracle.e1.bssv.JP010000.valueobject;

import oracle.e1.bssv.J0100002.valueobject.InternalGetAddressBook;
import oracle.e1.bssv.J0100002.valueobject.InternalShowAddressBook;
import oracle.e1.bssvfoundation.base.MessageValueObject;


public class ShowAddressBook extends MessageValueObject {
    public ShowAddressBook() {
    }

    public ShowAddressBook(InternalGetAddressBook internalVO) {
        if (internalVO.getQueryResults() != null) {

            addressBookResult = 
                    new AddressBookResult[internalVO.getQueryResults().size()]; /* create a new array big enough to hold all records in the result set */

            for (int i = 0; i < internalVO.getQueryResults().size(); 
                 i++) /* loop through all records in the result set */
            {
                //Create a reference to this specific result
                InternalShowAddressBook intVOQueryResult = 
                    internalVO.getQueryResults(i);

                addressBookResult[i] = 
                        new AddressBookResult(); /* create a new object in array */
                //Entity
                addressBookResult[i].getEntity().setEntityId(intVOQueryResult.getF0101_AN8());
                addressBookResult[i].getEntity().setEntityLongId(intVOQueryResult.getF0101_ALKY());
                addressBookResult[i].getEntity().setEntityTaxId(intVOQueryResult.getF0101_TAX());

                //top level

                addressBookResult[i].setEntityTypeCode(intVOQueryResult.getF0101_AT1());
                addressBookResult[i].setIsEntityTypeNettingIndicator(intVOQueryResult.getF0101_AT2());
                addressBookResult[i].setIsEntityTypeEmployee(intVOQueryResult.getF0101_ATE());
                addressBookResult[i].setIsEntityTypePurchaser(intVOQueryResult.getF0101_ATPR());
                addressBookResult[i].setIsEntityTypeReceivables(intVOQueryResult.getF0101_ATP());
                addressBookResult[i].setIsEntityTypePayables(intVOQueryResult.getF0101_ATR());
                addressBookResult[i].setIsEntityType3(intVOQueryResult.getF0101_AT3());
                addressBookResult[i].setIsEntityType4(intVOQueryResult.getF0101_AT4());
                addressBookResult[i].setIsEntityType5(intVOQueryResult.getF0101_AT5());
                addressBookResult[i].setEntityName(intVOQueryResult.getF0101_ALPH());
                addressBookResult[i].setEntityNameSecondary(intVOQueryResult.getF0101_ALP1());
                addressBookResult[i].setEntityTaxIdAdditional(intVOQueryResult.getF0101_TX2());
                addressBookResult[i].setBusinessUnit(intVOQueryResult.getF0101_MCU());
                addressBookResult[i].setLanguageCode(intVOQueryResult.getF0101_LNGP());
                addressBookResult[i].setIndustryClassificationCode(intVOQueryResult.getF0101_SIC());
                addressBookResult[i].setRemark(intVOQueryResult.getF0101_RMK());
                addressBookResult[i].setDescription1(intVOQueryResult.getF0101_DC());
                addressBookResult[i].setCreditMessageCode(intVOQueryResult.getF0101_CM());
                addressBookResult[i].setPersonCorporationCode(intVOQueryResult.getF0101_TAXC());
                addressBookResult[i].setSubledgerInactiveCode(intVOQueryResult.getF0101_SBLI());
                addressBookResult[i].setTaxExemptCertificate(intVOQueryResult.getF0101_TXCT());
                addressBookResult[i].setEmployeeGroupApprovalsCode(intVOQueryResult.getF0101_AEMPGP());

                //Show Address
                Address address = addressBookResult[i].getAddress();
                address.setAddressLine1(intVOQueryResult.getF0116_ADD1());
                address.setAddressLine2(intVOQueryResult.getF0116_ADD2());
                address.setAddressLine3(intVOQueryResult.getF0116_ADD3());
                address.setAddressLine4(intVOQueryResult.getF0116_ADD4());
                address.setCity(intVOQueryResult.getF0116_CTY1());
                address.setCountryCode(intVOQueryResult.getF0116_CTR());
                //get mailing names from contact
                address.setMailingName(intVOQueryResult.getInternalGetContacts().getQueryResults(0).getF0111_MLNM());
                address.setMailingNameSecondary(intVOQueryResult.getInternalGetContacts().getQueryResults(0).getF0111_MLN1());
                address.setCountyCode(intVOQueryResult.getF0116_COUN());
                address.setStateCode(intVOQueryResult.getF0116_ADDS());
                address.setPostalCode(intVOQueryResult.getF0116_ADDZ());
                address.setCountryCode(intVOQueryResult.getF0116_CTR());
                address.setDateEffective(intVOQueryResult.getF0101_EFTB());

                //Show Related address
                RelatedAddress relatedAddress = 
                    addressBookResult[i].getRelatedAddress();
                relatedAddress.setEntityIdRelated1(intVOQueryResult.getF0101_AN81());
                relatedAddress.setEntityIdRelated2(intVOQueryResult.getF0101_AN82());
                relatedAddress.setEntityIdRelated3(intVOQueryResult.getF0101_AN83());
                relatedAddress.setEntityIdRelated4(intVOQueryResult.getF0101_AN84());
                relatedAddress.setEntityIdRelated5(intVOQueryResult.getF0101_AN85());
                relatedAddress.setEntityIdRelated6(intVOQueryResult.getF0101_AN86());

                //Parent Array
                if (intVOQueryResult.getInternalParents() != null) {
                    //phones loop through array
                    addressBookResult[i].setParents(new Parent[intVOQueryResult.getInternalParents().size()]);
                    for (int j = 0; 
                         j < intVOQueryResult.getInternalParents().size(); 
                         j++) {
                        //loop through parents
                        addressBookResult[i].setParent(j, 
                                                       new Parent(intVOQueryResult.getInternalParent(j)));
                    }
                }


                //category codes
                CategoryCodesAddressBook ccAB = 
                    addressBookResult[i].getCategoryCodesAddressBook();
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

                //clasifications
                Classifications classifications = 
                    addressBookResult[i].getClassifications();
                classifications.setClassificationCode001(intVOQueryResult.getF0101_CLASS01());
                classifications.setClassificationCode002(intVOQueryResult.getF0101_CLASS02());
                classifications.setClassificationCode003(intVOQueryResult.getF0101_CLASS03());
                classifications.setClassificationCode004(intVOQueryResult.getF0101_CLASS04());
                classifications.setClassificationCode005(intVOQueryResult.getF0101_CLASS05());

                //user reserved data
                UserReservedData userReservedData = 
                    addressBookResult[i].getUserReservedData();
                userReservedData.setUserReservedCode(intVOQueryResult.getF0101_URCD());
                userReservedData.setUserReservedDate(intVOQueryResult.getF0101_URDT());
                userReservedData.setUserReservedAmount(intVOQueryResult.getF0101_URAT());
                userReservedData.setUserReservedNumber(intVOQueryResult.getF0101_URAB());
                userReservedData.setUserReservedReference(intVOQueryResult.getF0101_URRF());

                //statistics
                ShowStatistics showStatistics = 
                    addressBookResult[i].getStatistics();
                showStatistics.setNumberOfEmployees(intVOQueryResult.getF0101_NOE());
                showStatistics.setRateGrowth(intVOQueryResult.getF0101_GROWTHR());
                showStatistics.setRevenueRangeCode(intVOQueryResult.getF0101_REVRNG());
                showStatistics.setGlBankAccount(intVOQueryResult.getF0101_GLBA());
                showStatistics.setYearCompanyFounded(intVOQueryResult.getF0101_YEARSTAR());
                showStatistics.setDunBradStreetId(intVOQueryResult.getF0101_DUNS());

                //stock
                addressBookResult[i].getStock().setStockTickerSymbol(intVOQueryResult.getF0101_TICKER());
                addressBookResult[i].getStock().setStockExchange(intVOQueryResult.getF0101_EXCHG());

                //Phones
                if (intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalPhones() != 
                    null) {
                    //phones loop through array
                    addressBookResult[i].setPhoneNumbers(new PhoneNumberRecord[intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalPhones().size()]);
                    for (int j = 0; 
                         j < intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalPhones().size(); 
                         j++) {
                        //loop through phones
                        addressBookResult[i].setPhoneNumbers(j, 
                                                             new PhoneNumberRecord(intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalPhones(j)));
                    }
                }
                //Electronic Addresses
                if (intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalElectronicAddresses() != 
                    null) {

                    // loop through array
                    addressBookResult[i].setElectronicAddresses(new ElectronicAddressRecord[intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalElectronicAddresses().size()]);
                    for (int j = 0; 
                         j < intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalElectronicAddresses().size(); 
                         j++) {
                        //loop through addresses
                        addressBookResult[i].setElectronicAddresses(j, 
                                                                    new ElectronicAddressRecord(intVOQueryResult.getInternalGetContacts().getQueryResults(0).getInternalElectronicAddresses(j)));
                    }
                }


            }
        }
    }
    AddressBookResult[] addressBookResult;

    public void setAddressBookResult(AddressBookResult[] addressBookResult) {
        this.addressBookResult = addressBookResult;
    }

    public AddressBookResult[] getAddressBookResult(int i) {
        if (i >= 0 && i < addressBookResult.length)
            return addressBookResult;
        return null;
    }

    public AddressBookResult[] getAddressBookResult() {
        return addressBookResult;
    }


}

