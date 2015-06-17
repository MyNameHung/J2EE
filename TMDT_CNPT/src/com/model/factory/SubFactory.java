package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.library.ProcessArray;
import com.model.dto.*;

public class SubFactory {
	public static boolean Save(Sub sub )
	{
		return HiberHelper.Save(sub);
	}
	public static boolean Remove(Sub sub)
	{
		return HiberHelper.Remove(sub);
	}
	public static List<Sub> GetAll()
	{
		return HiberHelper.ToList("from Sub");
	}
	public static Sub Get(int id)
	{
		return (Sub)HiberHelper.ToList("from Sub where ma_sub="+id).get(0);
	}
	
	/**
	Array nay gom cac doi so : 
	id_sub int,
	_hangsx VARCHAR(255) ,
	_nganhcn varchar(255),
	_giaban1 long,
	_giaban2 long
	*/
	public static List subFilter(String[] array)
	{
		String query = "call sub_filter("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 

	*/
	public static List getAll()
	{
		String query = "call sub_get_all()";
		return HiberHelper.CallProcedure(query,Sub.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_sub int,
	page_index int,
	amount int
	*/
	public static List subGetProduct(String[] array)
	{
		String query = "call sub_get_product("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_sub int ,
	amount int
	*/
	public static List subGetProductFeatured(String[] array)
	{
		String query = "call sub_get_product_featured("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_sub int ,
	amount int
	*/
	public static List subGetProductNew(String[] array)
	{
		String query = "call sub_get_product_new("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_sub int,
	level_sort int
	*/
	public static List subSort(String[] array)
	{
		String query = "call sub_sort("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_sub int,
	level_sort int,
	_hangsx VARCHAR(255) ,
	_nganhcn varchar(255),
	_giaban1 long,
	_giaban2 long
	*/
	public static List subSortFilter(String[] array)
	{
		String query = "call sub_sort_filter("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
}
