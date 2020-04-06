/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.ingeint.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ING_ModelGenerator
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_ING_ModelGenerator extends PO implements I_ING_ModelGenerator, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20180703L;

    /** Standard Constructor */
    public X_ING_ModelGenerator (Properties ctx, int ING_ModelGenerator_ID, String trxName)
    {
      super (ctx, ING_ModelGenerator_ID, trxName);
      /** if (ING_ModelGenerator_ID == 0)
        {
			setING_ModelGenerator_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ING_ModelGenerator (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_ING_ModelGenerator[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType 
		Dictionary Entity Type; Determines ownership and synchronization
	  */
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType () 
	{
		return (String)get_Value(COLUMNNAME_EntityType);
	}

	/** Set Folder.
		@param Folder 
		A folder on a local or remote system to store data into
	  */
	public void setFolder (String Folder)
	{
		set_Value (COLUMNNAME_Folder, Folder);
	}

	/** Get Folder.
		@return A folder on a local or remote system to store data into
	  */
	public String getFolder () 
	{
		return (String)get_Value(COLUMNNAME_Folder);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Model Generator.
		@param ING_ModelGenerator_ID Model Generator	  */
	public void setING_ModelGenerator_ID (int ING_ModelGenerator_ID)
	{
		if (ING_ModelGenerator_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ING_ModelGenerator_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ING_ModelGenerator_ID, Integer.valueOf(ING_ModelGenerator_ID));
	}

	/** Get Model Generator.
		@return Model Generator	  */
	public int getING_ModelGenerator_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ING_ModelGenerator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ING_ModelGenerator_UU.
		@param ING_ModelGenerator_UU ING_ModelGenerator_UU	  */
	public void setING_ModelGenerator_UU (String ING_ModelGenerator_UU)
	{
		set_Value (COLUMNNAME_ING_ModelGenerator_UU, ING_ModelGenerator_UU);
	}

	/** Get ING_ModelGenerator_UU.
		@return ING_ModelGenerator_UU	  */
	public String getING_ModelGenerator_UU () 
	{
		return (String)get_Value(COLUMNNAME_ING_ModelGenerator_UU);
	}

	public org.compiere.model.I_AD_Table getING_Table() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Table)MTable.get(getCtx(), org.compiere.model.I_AD_Table.Table_Name)
			.getPO(getING_Table_ID(), get_TrxName());	}

	/** Set ING_Table_ID.
		@param ING_Table_ID ING_Table_ID	  */
	public void setING_Table_ID (int ING_Table_ID)
	{
		if (ING_Table_ID < 1) 
			set_Value (COLUMNNAME_ING_Table_ID, null);
		else 
			set_Value (COLUMNNAME_ING_Table_ID, Integer.valueOf(ING_Table_ID));
	}

	/** Get ING_Table_ID.
		@return ING_Table_ID	  */
	public int getING_Table_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ING_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ModelGeneratorProcess.
		@param ModelGeneratorProcess ModelGeneratorProcess	  */
	public void setModelGeneratorProcess (String ModelGeneratorProcess)
	{
		set_Value (COLUMNNAME_ModelGeneratorProcess, ModelGeneratorProcess);
	}

	/** Get ModelGeneratorProcess.
		@return ModelGeneratorProcess	  */
	public String getModelGeneratorProcess () 
	{
		return (String)get_Value(COLUMNNAME_ModelGeneratorProcess);
	}

	/** Set Package Name.
		@param PackageName Package Name	  */
	public void setPackageName (String PackageName)
	{
		set_Value (COLUMNNAME_PackageName, PackageName);
	}

	/** Get Package Name.
		@return Package Name	  */
	public String getPackageName () 
	{
		return (String)get_Value(COLUMNNAME_PackageName);
	}

	/** Set DB Table Name.
		@param TableName 
		Name of the table in the database
	  */
	public void setTableName (String TableName)
	{
		set_Value (COLUMNNAME_TableName, TableName);
	}

	/** Get DB Table Name.
		@return Name of the table in the database
	  */
	public String getTableName () 
	{
		return (String)get_Value(COLUMNNAME_TableName);
	}
}