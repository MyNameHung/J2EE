package com.model.dto;

public class Ct_hoadon {
	private int ma_cthd;
	private int soluong;
	private long gia;
	
	private Hoadon hoadon;
	private Sanpham sanpham;
	
	public Ct_hoadon(){}
	
	public Ct_hoadon(int _soluong, long _gia, Hoadon _hoadon, Sanpham _sanpham){
		this.setSoluong(_soluong);
		this.setGia(_gia);
		this.setHoadon(_hoadon);
		this.setSanpham(_sanpham);
	}

	public int getMa_cthd() {
		return ma_cthd;
	}

	public void setMa_cthd(int ma_cthd) {
		this.ma_cthd = ma_cthd;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public Hoadon getHoadon() {
		return hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	public Sanpham getSanpham() {
		return sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}
}
