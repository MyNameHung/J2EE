package com.model.dto;
import java.util.*;

public class Sub {
	private int ma_sub;
	private String ten;
	private String mota;
	private Category category;
	
	private Set sanpham;
	private Set baiviet;
	
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

	public Set getSanpham() {
		return sanpham;
	}

	public void setSanpham(Set sanpham) {
		this.sanpham = sanpham;
	}

	public Set getBaiviet() {
		return baiviet;
	}

	public void setBaiviet(Set baiviet) {
		this.baiviet = baiviet;
	}

	
}
