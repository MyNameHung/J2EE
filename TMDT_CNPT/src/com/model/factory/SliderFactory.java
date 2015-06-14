package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class SliderFactory {
	public static boolean Save(Slider slider )
	{
		return HiberHelper.Save(slider);
	}
	public static boolean Remove(Slider slider)
	{
		return HiberHelper.Remove(slider);
	}
	public static List<Slider> GetAll()
	{
		return HiberHelper.ToList("from Slider");
	}
	public static Slider Get(int id)
	{
		return (Slider)HiberHelper.ToList("from Slider where ma_slider="+id).get(0);
	}
}
