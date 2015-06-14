package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class PhutroFactory {
	public static boolean Save(Phutro phutro )
	{
		return HiberHelper.Save(phutro);
	}
	public static boolean Remove(Phutro phutro)
	{
		return HiberHelper.Remove(phutro);
	}
	public static List<Phutro> GetAll()
	{
		return HiberHelper.ToList("from Phutro");
	}
	public static Phutro Get(int id)
	{
		return (Phutro)HiberHelper.ToList("from Phutro where ma_phutro="+id).get(0);
	}
}
