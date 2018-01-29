
from odoo import api, fields, models
from odoo import fields, models

from odoo import api

from zeep import Client


class JDEdwardsMasters(models.Model):
    _name = 'jde.masters'
    _description = 'JDE Master'

    name = fields.Char('name')
    product_code = fields.Char('Product Code'),
    relaese_code = fields.Selection([('E910','E910'),('E900','E900')],'Release')
    wsdl_url = fields.Char('BSSV Link')
