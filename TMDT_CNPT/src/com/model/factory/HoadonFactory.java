package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.library.ProcessArray;
import com.model.dto.*;

public class HoadonFactory {
	public static boolean Save(Hoadon hoadon )
	{
		return HiberHelper.Save(hoadon);
	}
	public static boolean Remove(Hoadon hoadon)
	{
		return HiberHelper.Remove(hoadon);
	}
	public static List<Hoadon> GetAll()
	{
		return HiberHelper.ToList("from Hoadon");
	}
	public static Hoadon Get(int id)
	{
		return (Hoadon)HiberHelper.ToList("from Hoadon where ma_hoadon="+id).get(0);
	}
	
	/**
	Array nay gom cac doi so : 
	id_bill int
	*/
	public static List getBillById(String[] array)
	{
		
		String query = "call bill_get_by_id("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Hoadon.class);
	}
}
