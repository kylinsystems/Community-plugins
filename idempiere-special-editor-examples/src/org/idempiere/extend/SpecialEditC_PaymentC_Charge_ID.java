/******************************************************************************
 * Copyright (C) 2015 Luis Amesty                                             *
 * Copyright (C) 2015 AMERP Consulting                                        *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 ******************************************************************************/
package org.idempiere.extend;

import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MPayment;
import org.compiere.model.PO;
import org.compiere.model.X_C_Payment;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.base.ISpecialEditCallout;
import org.idempiere.base.SpecialEditorUtils;

public class SpecialEditC_PaymentC_Charge_ID implements ISpecialEditCallout {

	String Message = "";

	@Override
	public boolean canEdit(GridTab mTab, GridField mField, PO po) {
		System.out.println("canEdit " + mTab + " - " + mField + " - "+ po);
		
		if (mTab.getValue("C_Charge_ID") == null) {

			return false;
		}
		return true;
	}

	@Override
	public String validateEdit(GridTab mTab, GridField mField, PO po, Object newValue) {
		System.out.println("validateEdit " + mTab + " - " + mField + " - "+ po);
		// The Allocation line must have a charge
		if (mTab.getValue("C_Charge_ID") == null) {
			Message = "*** "+Msg.translate(Env.getCtx(),"invalid")+" **** \r\n";
			Message= Message+Msg.translate(Env.getCtx(),"ChargeNotCreated"+" \r\n");
			return "Error !!!"+"  "+Message;
		}
		// User must select another charge (as an example, we forbid blank value)
		if (newValue == null)
			return "you must select an charge !";

		return null;
	}

	@Override
	public boolean preEdit(GridTab mTab, GridField mField, PO po) {
		System.out.println("preEdit " + mTab + " - " + mField + " - "+ po);
		//  Delete Posting
		SpecialEditorUtils.deletePosting(new MPayment(Env.getCtx(), (Integer) mTab.getValue("C_Payment_ID"), null));
		return true;
	}

	@Override
	public boolean updateEdit(GridTab mTab, GridField mField, PO po, Object newValue) {
		//		po.set_ValueOfColumn("C_Charge_ID", newValue);
		//		po.saveEx(); it can't be done using PO as you can't save a MInvoiceLine when its parent is processed
		X_C_Payment pay = new X_C_Payment(Env.getCtx(), mTab.getRecord_ID(), null);
		pay.setC_Charge_ID((Integer) newValue);
		pay.saveEx();

		return true;
	}

	@Override
	public boolean postEdit(GridTab mTab, GridField mField, PO po) {
		// Repost invoice
		SpecialEditorUtils.post(mTab, new MPayment(Env.getCtx(), (Integer) mTab.getValue("C_Payment_ID"), null));
		//Refresh
		SpecialEditorUtils.refresh(mTab);
		return true;
	}

}
