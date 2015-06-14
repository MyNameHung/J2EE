package com.model.factory;

import java.util.List;

import com.helper.HiberHelper;
import com.model.dto.*;

public class CategoryFatory {

	public static boolean Save(Category category )
	{
		return HiberHelper.Save(category);
	}
	public static boolean Remove(Category category)
	{
		return HiberHelper.Remove(category);
	}
	public static List<Category> GetAll()
	{
		return HiberHelper.ToList("from Category");
	}
	public static Category Get(int id)
	{
		return (Category)HiberHelper.ToList("from Category where ma_category="+id).get(0);
	}

}
