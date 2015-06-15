package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.library.ProcessArray;
import com.model.dto.*;

public class SanphamFactory {
	public static boolean Save(Sanpham sp )
	{
		return HiberHelper.Save(sp);
	}
	public static boolean Remove(Sanpham sp)
	{
		return HiberHelper.Remove(sp);
	}
	public static List<Sanpham> GetAll()
	{
		return HiberHelper.ToList("from Sanpham");
	}
	public static Sanpham Get(int id)
	{
		return (Sanpham)HiberHelper.ToList("from Sanpham where ma_sp="+id).get(0);
	}
	
	//
	public static List getProductByName(String[] array)
	{
		
		String query = "call product_get_by_name("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
}
