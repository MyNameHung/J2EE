package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class NguoinhanFactory {
	public static boolean Save(Nguoinhan nguoinhan )
	{
		return HiberHelper.Save(nguoinhan);
	}
	public static boolean Remove(Nguoinhan nguoinhan)
	{
		return HiberHelper.Remove(nguoinhan);
	}
	public static List<Nguoinhan> GetAll()
	{
		return HiberHelper.ToList("from Nguoinhan");
	}
	public static Nguoinhan Get(int id)
	{
		return (Nguoinhan)HiberHelper.ToList("from Nguoinhan where ma_nguoinhan="+id).get(0);
	}
}
