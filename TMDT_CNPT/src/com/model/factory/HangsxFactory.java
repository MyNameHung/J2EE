package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class HangsxFactory {
	public static boolean Save(Hangsx hangsx )
	{
		return HiberHelper.Save(hangsx);
	}
	public static boolean Remove(Hangsx hangsx)
	{
		return HiberHelper.Remove(hangsx);
	}
	public static List<Hangsx> GetAll()
	{
		return HiberHelper.ToList("from Hangsx");
	}
	public static Hangsx Get(int id)
	{
		return (Hangsx)HiberHelper.ToList("from Hangsx where ma_hangsx="+id).get(0);
	}
}
