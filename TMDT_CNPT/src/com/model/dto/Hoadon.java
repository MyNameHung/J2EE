package com.model.dto;
import java.util.*;
public class Hoadon {
	private int ma_hoadon;
	private String ngaydathang;
	private String ngaygiaohang;
	private boolean tinhtrang;
	private long tonggiatri;
	private Khachhang khachhang;
	
	private Set cthd;
	
	public Hoadon(){}
	
	public Hoadon(String _ngaydathang, String _ngaygiaohang, boolean _tinhtrang, long _tonggiatri, Khachhang _khachhang){
		this.setNgaydathang(_ngaydathang);
		this.setNgaygiaohang(_ngaygiaohang);
		this.setTinhtrang(_tinhtrang);
		this.setTonggiatri(_tonggiatri);
		this.setKhachhang(_khachhang);
	}

	public int getMa_hoadon() {
		return ma_hoadon;
	}

	public void setMa_hoadon(int ma_hoadon) {
		this.ma_hoadon = ma_hoadon;
	}

	public String getNgaydathang() {
		return ngaydathang;
	}

	public void setNgaydathang(String ngaydathang) {
		this.ngaydathang = ngaydathang;
	}

	public String getNgaygiaohang() {
		return ngaygiaohang;
	}

	public void setNgaygiaohang(String ngaygiaohang) {
		this.ngaygiaohang = ngaygiaohang;
	}

	public boolean isTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public long getTonggiatri() {
		return tonggiatri;
	}

	public void setTonggiatri(long tonggiatri) {
		this.tonggiatri = tonggiatri;
	}

	public Khachhang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	public Set getCthd() {
		return cthd;
	}

	public void setCthd(Set cthd) {
		this.cthd = cthd;
	}
}
