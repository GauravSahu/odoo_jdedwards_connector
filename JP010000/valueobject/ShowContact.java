package oracle.e1.bssv.JP010000.valueobject;

import java.io.Serializable;

import oracle.e1.bssv.J0100004.valueobject.InternalGetContacts;
import oracle.e1.bssv.J0100004.valueobject.InternalShowContacts;
import oracle.e1.bssvfoundation.base.MessageValueObject;


/**
 * ShowContact Output VO 
 */
public class ShowContact extends MessageValueObject implements Serializable {

    private ContactRecord contactRecord[];

    /**
     * Default public constructor for instantiating: PhoneNumberRecord<br>
     */
    public ShowContact() {
    }

    /**
     * Overridden public constructor for instantiating: ShowContact<br>
     */
    public ShowContact(InternalGetContacts internalVO, GetContact pubVO) {

        if (internalVO.getQueryResults() != null) {

            this.contactRecord = 
                    new ContactRecord[internalVO.getQueryResults().size()]; /* create a new array big enough to hold all records in the result set */

            for (int i = 0; i < internalVO.getQueryResults().size(); 
                 i++) /* loop through all records in the result set */
            {
                this.getContactRecord()[i] = 
                        new ContactRecord(); /* create a new object in array */

                this.getContactRecord()[i].getEntity().setEntityId(internalVO.getQueryResults(i).getF0111_AN8());
                this.getContactRecord()[i].getEntity().setEntityLongId(pubVO.getEntity().getEntityLongId());
                this.getContactRecord()[i].getEntity().setEntityTaxId(pubVO.getEntity().getEntityTaxId());

                InternalShowContacts qryResults = 
                    internalVO.getQueryResults(i);

                this.getContactRecord()[i].setContactID(qryResults.getF0111_IDLN());
                this.getContactRecord()[i].setDisplaySequence(qryResults.getF0111_DSS5());
                this.getContactRecord()[i].setNameMailing(qryResults.getF0111_MLNM());
                this.getContactRecord()[i].setContactTitle(qryResults.getF0111_ATTL());
                this.getContactRecord()[i].setRemark(qryResults.getF0111_REM1());
                this.getContactRecord()[i].setSalutationName(qryResults.getF0111_SLNM());
                this.getContactRecord()[i].setEntityNameContact(qryResults.getF0111_ALPH());
                this.getContactRecord()[i].setDescription1(qryResults.getF0111_DC());
                this.getContactRecord()[i].setGiveName(qryResults.getF0111_GNNM());
                this.getContactRecord()[i].setMiddleName(qryResults.getF0111_MDNM());
                this.getContactRecord()[i].setSurname(qryResults.getF0111_SRNM());
                this.getContactRecord()[i].setTypeCode(qryResults.getF0111_TYC());
                this.getContactRecord()[i].setMailingNameSecondary(qryResults.getF0111_MLN1());
                this.getContactRecord()[i].setEntityNameSecondary(qryResults.getF0111_ALP1());
                this.getContactRecord()[i].setContacTypeCode(qryResults.getF0111_NTYP());
                this.getContactRecord()[i].setNickName(qryResults.getF0111_NICK());
                this.getContactRecord()[i].setGenderCode(qryResults.getF0111_GEND());
                this.getContactRecord()[i].setDayDateOfBirth(qryResults.getF0111_DDATE());
                this.getContactRecord()[i].setMonthDateOfBirth(qryResults.getF0111_DMON());
                this.getContactRecord()[i].setYearDateOfBirth(qryResults.getF0111_DYR());
                this.getContactRecord()[i].setFunctionCode(qryResults.getF0111_FUCO());
                this.getContactRecord()[i].setPreferredContactMethod(qryResults.getF0111_PCM());
                this.getContactRecord()[i].setPrimaryContactCode(qryResults.getF0111_PCF());


                CategoryCodesContact catCode = 
                    this.getContactRecord()[i].getCategoryCodesContact();

                catCode.setCategoryCode001(qryResults.getF0111_W001());
                catCode.setCategoryCode002(qryResults.getF0111_W002());
                catCode.setCategoryCode003(qryResults.getF0111_W003());
                catCode.setCategoryCode004(qryResults.getF0111_W004());
                catCode.setCategoryCode005(qryResults.getF0111_W005());
                catCode.setCategoryCode006(qryResults.getF0111_W006());
                catCode.setCategoryCode007(qryResults.getF0111_W007());
                catCode.setCategoryCode008(qryResults.getF0111_W008());
                catCode.setCategoryCode009(qryResults.getF0111_W009());
                catCode.setCategoryCode010(qryResults.getF0111_W010());
                catCode.setCategoryCode011(qryResults.getF0111_WN001());
                catCode.setCategoryCode012(qryResults.getF0111_WN002());
                catCode.setCategoryCode013(qryResults.getF0111_WN003());
                catCode.setCategoryCode014(qryResults.getF0111_WN004());
                catCode.setCategoryCode015(qryResults.getF0111_WN005());
                catCode.setCategoryCode016(qryResults.getF0111_WN006());
                catCode.setCategoryCode017(qryResults.getF0111_WN007());
                catCode.setCategoryCode018(qryResults.getF0111_WN008());
                catCode.setCategoryCode019(qryResults.getF0111_WN009());
                catCode.setCategoryCode020(qryResults.getF0111_WN010());

                int j = 0;
                if (internalVO.getQueryResults(i).getInternalAlternateAddress() != 
                    null) {
                    this.contactRecord[i].setAlternateAddress(new AlternateAddressRecord[internalVO.getQueryResults(i).getInternalAlternateAddress().size()]);

                    for (j = 0; 
                         j < internalVO.getQueryResults(i).getInternalAlternateAddress().size(); 
                         j++) {
                        this.contactRecord[i].setAlternateAddress(j, 
                                                                  new AlternateAddressRecord(qryResults.getInternalAlternateAddress(j)));
                    }
                }

                if (internalVO.getQueryResults(i).getInternalPhones() != 
                    null) {
                    this.contactRecord[i].setPhone(new PhoneNumberRecord[internalVO.getQueryResults(i).getInternalPhones().size()]);

                    for (j = 0; 
                         j < internalVO.getQueryResults(i).getInternalPhones().size(); 
                         j++) {
                        this.contactRecord[i].setPhone(j, 
                                                       new PhoneNumberRecord(internalVO.getQueryResults(i).getInternalPhones(j)));
                    }
                }


                if (internalVO.getQueryResults(i).getInternalElectronicAddresses() != 
                    null) {
                    this.contactRecord[i].setElectronicAddress(new ElectronicAddressRecord[internalVO.getQueryResults(i).getInternalElectronicAddresses().size()]);

                    for (j = 0; 
                         j < internalVO.getQueryResults(i).getInternalElectronicAddresses().size(); 
                         j++) {
                        this.contactRecord[i].setElectronicAddress(j, 
                                                                   new ElectronicAddressRecord(internalVO.getQueryResults(i).getInternalElectronicAddresses(j)));

                    }
                }


            }
        }
    }


    public void setContactRecord(ContactRecord[] contactRecord) {
        this.contactRecord = contactRecord;
    }

    public ContactRecord[] getContactRecord(int i) {
        if (i >= 0 && i < contactRecord.length)
            return contactRecord;
        return null;
    }

    public ContactRecord[] getContactRecord() {
        return contactRecord;
    }
}

