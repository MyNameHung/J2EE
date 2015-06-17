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
	
	/**
	Array nay gom cac doi so : 
	product_name varchar(30)
	*/
	public static List getProductByName(String[] array)
	{
		
		String query = "call product_get_by_name("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_product int
	*/
	public static List getProductById(String[] array)
	{
		
		String query = "call product_get_by_id("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	amount int
	*/
	public static List getProductFeatured(String[] array)
	{
		
		String query = "call product_get_featured("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	amount int
	*/
	public static List getProductNew(String[] array)
	{
		
		String query = "call product_get_new("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	amount int
	*/
	public static List getProductSelling(String[] array)
	{
		
		String query = "call product_selling("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	public static void main(String[] args){
		List<Sanpham> l =  getProductSelling(new String[]{"3"});
		for(Sanpham s : l){
			System.out.println(s.getMa_sp());
		}
	}
}
