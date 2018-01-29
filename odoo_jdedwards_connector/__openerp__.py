# -*- coding: utf-8 -*-
##############################################################################
#
#    OpenERP, Open Source Management Solution
#    Copyright (C) 2004-2010 Tiny SPRL (<http://tiny.be>).
#
#    This program is free software: you can redistribute it and/or modify
#    it under the terms of the GNU Affero General Public License as
#    published by the Free Software Foundation, either version 3 of the
#    License, or (at your option) any later version.
#
#    This program is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU Affero General Public License for more details.
#
#    You should have received a copy of the GNU Affero General Public License
#    along with this program.  If not, see <http://www.gnu.org/licenses/>.
#
##############################################################################

{
    'name': 'JD Edwards & Odoo Connector',
    'version' : '1.0',
    'summary': 'Address Book Master Download',
    'sequence': 30,
    'description': """
    Download Jd edwards Address book using BSSV.
The Address Book system is the foundation for other JD Edwards EnterpriseOne systems. The Address Book system contains name, address, and phone numbers for customers, suppliers, companies, and so on. This information is stored in several database tables to create a central repository of information. Other JD Edwards EnterpriseOne systems retrieve up-to-date name and address information from the Address Book system. For example, the Accounts Payable system uses address book information for supplier payments and the Accounts Receivable system uses address book information to generate customer invoices and statements.
    """,
    'category': 'JD EDWARDS',
    'author': 'Gaurav Sahu <gauravsahu19@gmail.com>',
    'website': 'https://github.com/gauravsahu',
    'depends': ['base'],
    'sequence': 16,
    'demo': [],
    'data': [
        'views/jde_address_book_view.xml',
        'views/jde_masters_view.xml',
        'wizard/sync_address_book_view.xml'
    ],
    'test': [
    ],
    'installable': True,
    'application': True,
    'auto_install': False,
    'qweb': [],
}