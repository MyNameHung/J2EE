package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class NganhcnFactory {
	public static boolean Save(Nganhcn nganhcn )
	{
		return HiberHelper.Save(nganhcn);
	}
	public static boolean Remove(Nganhcn nganhcn)
	{
		return HiberHelper.Remove(nganhcn);
	}
	public static List<Nganhcn> GetAll()
	{
		return HiberHelper.ToList("from Nganhcn");
	}
	public static Nganhcn Get(int id)
	{
		return (Nganhcn)HiberHelper.ToList("from Nganhcn where ma_nganh="+id).get(0);
	}
}
