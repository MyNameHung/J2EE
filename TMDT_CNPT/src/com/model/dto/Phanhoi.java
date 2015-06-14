package com.model.dto;

public class Phanhoi {
	private int ma_phanhoi;
	private String noidung;
	
	private Sanpham sanpham;
	private Khachhang khachhang;
	
	public Phanhoi(){}
	
	public Phanhoi(String _noidung, Sanpham _sanpham, Khachhang _khachhang){
		this.setNoidung(_noidung);
		this.setSanpham(_sanpham);
		this.setKhachhang(_khachhang);
	}

	public int getMa_phanhoi() {
		return ma_phanhoi;
	}

	public void setMa_phanhoi(int ma_phanhoi) {
		this.ma_phanhoi = ma_phanhoi;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public Sanpham getSanpham() {
		return sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public Khachhang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}
	
	
}
