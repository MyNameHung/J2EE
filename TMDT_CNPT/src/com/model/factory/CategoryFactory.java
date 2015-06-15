package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.library.ProcessArray;
import com.model.dto.*;

public class CategoryFactory {

	public static boolean Save(Category category )
	{
		return HiberHelper.Save(category);
	}
	public static boolean Remove(Category category)
	{
		return HiberHelper.Remove(category);
	}
	public static List<Category> GetAll()
	{
		return HiberHelper.ToList("from Category");
	}
	public static Category Get(int id)
	{
		return (Category)HiberHelper.ToList("from Category where ma_category="+id).get(0);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int,
	amount int
	*/
	public static List getProductNew(String[] array)
	{
		
		String query = "call category_get_product_new("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int,
	amount int
	*/
	public static List getProductfeatured(String[] array)
	{
		
		String query = "call category_get_product_featured("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int,
	page_index int ,
	amount int
	*/
	public static List getProduct(String[] array)
	{
		
		String query = "call category_get_product("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	public static List getAll()
	{
		
		String query = "call category_get_all()";
		return HiberHelper.CallProcedure(query,Category.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int ,
	amount int 
	*/
	public static List getAllPost(String[] array)
	{
		
		String query = "call category_get_all_post("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Baiviet.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int,
	_hangsx VARCHAR(255) ,
	_nganhcn varchar(255),
	_giaban1 long,
	_giaban2 long
	*/
	public static List filter(String[] array)
	{
		String query = "call category_filter("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int,
	level_sort int
	*/
	public static List sort(String[] array)
	{
		String query = "call category_sort("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_category int,
	level_sort int,
	_hangsx VARCHAR(255) ,
	_nganhcn varchar(255),
	_giaban1 long,
	_giaban2 long
	*/
	public static List sortFilter(String[] array)
	{
		String query = "call category_sort_filter("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Sanpham.class);
	}
	
	public static void main(String strg[]){
		
		String[] condition_search = null;

		List<Category> t = getAll();

		for(Category s : t)
		{
			System.out.println(s.getTen());
		}
			
	}
}
