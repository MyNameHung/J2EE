package com.model.dto;
import java.util.*;

public class Category {
	private int ma_category;
	private String ten;
	private String mota;
	private Set subs;
	
	public Category(){}
	
	public Category(String _ten, String _mota){
		this.setTen(_ten);
		this.setMota(_mota);
	}

	public int getMa_category() {
		return ma_category;
	}

	public void setMa_category(int ma_category) {
		this.ma_category = ma_category;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Set getSubs() {
		return subs;
	}

	public void setSubs(Set subs) {
		this.subs = subs;
	}

	
}
