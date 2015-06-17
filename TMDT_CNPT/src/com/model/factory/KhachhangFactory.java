package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.library.ProcessArray;
import com.model.dto.*;

public class KhachhangFactory {
	public static boolean Save(Khachhang kh )
	{
		return HiberHelper.Save(kh);
	}
	public static boolean Remove(Khachhang kh)
	{
		return HiberHelper.Remove(kh);
	}
	public static List<Khachhang> GetAll()
	{
		return HiberHelper.ToList("from Khachhang");
	}
	public static Khachhang Get(int id)
	{
		return (Khachhang)HiberHelper.ToList("from Khachhang where ma_kh="+id).get(0);
	}
	
	/**
	Array nay gom cac doi so : 
	username varchar(30),
	password varchar(30)
	*/
	public static List checkLogin(String[] array)
	{
		
		String query = "call user_check_login("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Khachhang.class);
	}
	
	/**
	Array nay gom cac doi so : 
	id_user int
	*/
	public static List getById(String[] array)
	{
		
		String query = "call user_get_by_id("+ProcessArray.ArrayToString(array)+")";
		return HiberHelper.CallProcedure(query,Khachhang.class);
	}
}
