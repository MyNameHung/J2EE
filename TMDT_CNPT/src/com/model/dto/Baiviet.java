package com.model.dto;

public class Baiviet {
	private int ma_baiviet;
	private String tieude;
	private String noidung;
	private String mota_baiviet;
	private String hinhanh;
	
	private Sub sub;
	private Khachhang khachhang;
	
	public Baiviet(){}
	
	public Baiviet(String _tieude, String _noiudung, String _hinhanh, Sub _sub, Khachhang _khachhang){
		this.setTieude(_tieude);
		this.setNoidung(_noiudung);
		this.setHinhanh(_hinhanh);
		this.setSub(_sub);
		this.setKhachhang(_khachhang);
	}

	public int getMa_baiviet() {
		return ma_baiviet;
	}

	public void setMa_baiviet(int ma_baiviet) {
		this.ma_baiviet = ma_baiviet;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getMota_baiviet() {
		return mota_baiviet;
	}

	public void setMota_baiviet(String mota_baiviet) {
		this.mota_baiviet = mota_baiviet;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public Sub getSub() {
		return sub;
	}

	public void setSub(Sub sub) {
		this.sub = sub;
	}

	public Khachhang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}
}
