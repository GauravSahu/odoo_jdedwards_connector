
from odoo import api, fields, models
from odoo import fields, models

from odoo import api

from zeep import Client


class SyncAddressBook(models.TransientModel):
    _name = "sync.addressbook"
    _description = "Sync Address Book"

    wsdl_url = fields.Char('BSSV Link')

    @api.multi
    def download_address_book(self):
    	AddressBook = self.env['address.book']
        wsdl_url = self.wsdl_url
    	client = Client(wsdl_url)
        addressBookResult = client.service.getAddressBook()
        for each in addressBookResult['addressBookResult']:
        	print each
        	if 'address' in each:
        		vals = {
        			'postalCode': 	each['address']['postalCode'],
		            'countryCode': 	each['address']['countryCode'],
		            'stateCode': 	each['address']['stateCode'],
		            'addressLine4': each['address']['addressLine4'],
		            'addressLine3': each['address']['addressLine3'],
		            'mailingName': 	each['address']['addressLine3'],
		            'countyCode': 	each['address']['countyCode'],
		            'addressLine2': each['address']['addressLine2'],
		            'addressLine1': each['address']['addressLine1'],
		            'mailingNameSecondary':each['address']['mailingNameSecondary'],
		            'city': each['address']['city'],
		            'entityId': each['entity']['entityId'],
		            'description1': each['description1'],
		            'entityName': each['entityName'],
                    'name' : each['entityName'],
		            'businessUnit': each['businessUnit']
        		}
        		check_address = AddressBook.search([('entityId','=',each['entity']['entityId'])])
        		if not check_address:
        			AddressBook.create(vals)
