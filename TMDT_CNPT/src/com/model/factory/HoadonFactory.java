package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
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
}
