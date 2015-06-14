package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class Ct_hoadonFactory {
	public static boolean Save(Ct_hoadon cthd )
	{
		return HiberHelper.Save(cthd);
	}
	public static boolean Remove(Ct_hoadon cthd)
	{
		return HiberHelper.Remove(cthd);
	}
	public static List<Ct_hoadon> GetAll()
	{
		return HiberHelper.ToList("from Ct_hoadon");
	}
	public static Ct_hoadon Get(int id)
	{
		return (Ct_hoadon)HiberHelper.ToList("from Ct_hoadon where ma_cthd="+id).get(0);
	}
}
