package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class BaohanhFactory {
	public static boolean Save(Baohanh baohanh )
	{
		return HiberHelper.Save(baohanh);
	}
	public static boolean Remove(Baohanh baohanh)
	{
		return HiberHelper.Remove(baohanh);
	}
	public static List<Baohanh> GetAll()
	{
		return HiberHelper.ToList("from Baohanh");
	}
	public static Baohanh Get(int id)
	{
		return (Baohanh)HiberHelper.ToList("from Baohanh where ma_baohanh="+id).get(0);
	}
}
