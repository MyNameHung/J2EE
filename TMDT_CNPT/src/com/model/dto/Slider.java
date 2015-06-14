package com.model.dto;

public class Slider {
	private int ma_slider;
	private String anh;
	private String mota;
	
	public Slider(){}
	
	public Slider(String _anh, String _mota){
		this.setAnh(_anh);
		this.setMota(_mota);
	}

	public int getMa_slider() {
		return ma_slider;
	}

	public void setMa_slider(int ma_slider) {
		this.ma_slider = ma_slider;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}
}
