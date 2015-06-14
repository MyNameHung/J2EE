package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
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
}
