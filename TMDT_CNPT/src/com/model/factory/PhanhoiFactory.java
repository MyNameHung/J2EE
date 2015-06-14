package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class PhanhoiFactory {
	public static boolean Save(Phanhoi phanhoi )
	{
		return HiberHelper.Save(phanhoi);
	}
	public static boolean Remove(Phanhoi phanhoi)
	{
		return HiberHelper.Remove(phanhoi);
	}
	public static List<Phanhoi> GetAll()
	{
		return HiberHelper.ToList("from Phanhoi");
	}
	public static Phanhoi Get(int id)
	{
		return (Phanhoi)HiberHelper.ToList("from Phanhoi where ma_phanhoi="+id).get(0);
	}
}
