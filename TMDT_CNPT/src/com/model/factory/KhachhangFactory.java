package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
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
}
