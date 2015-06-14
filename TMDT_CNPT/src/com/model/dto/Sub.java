package com.model.dto;

public class Sub {
	private int ma_sub;
	private String ten;
	private String mota;
	private Category category;
	
	public Sub(){}
	
	public Sub(String _ten, String _mota, Category _category){
		this.setTen(_ten);
		this.setMota(_mota);
		this.category = _category;
	}

	public int getMa_sub() {
		return ma_sub;
	}

	public void setMa_sub(int ma_sub) {
		this.ma_sub = ma_sub;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
}
