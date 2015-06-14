package com.model.dto;
import java.util.*;
public class Khachhang {
	private int ma_kh;
	private String taikhoan;
	private String matkhau;
	private String ten_kh;
	private String ngaysinh;
	private int gioitinh;
	private String nghenghiep;
	private String email;
	private long dienthoai;
	private boolean quantri;
	
	private Set hoadon;
	private Set baiviet;
	private Set phanhoi;
	
	public Khachhang(){}
	
	public Khachhang(String _taikhoan,
					 String _matkhau,
					 String _tenkh,
					 String _ngaysinh,
					 int _gioitinh,
					 String _nghenghiep,
					 String _email,
					 long _dienthoai,
					 boolean _quantri){
		this.setTaikhoan(_taikhoan);
		this.setMatkhau(_matkhau);
		this.setTen_kh(_tenkh);
		this.setNgaysinh(_ngaysinh);
		this.setGioitinh(_gioitinh);
		this.setNghenghiep(_nghenghiep);
		this.setEmail(_email);
		this.setDienthoai(_dienthoai);
		this.setQuantri(_quantri);
	}

	public int getMa_kh() {
		return ma_kh;
	}

	public void setMa_kh(int ma_kh) {
		this.ma_kh = ma_kh;
	}

	public String getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTen_kh() {
		return ten_kh;
	}

	public void setTen_kh(String ten_kh) {
		this.ten_kh = ten_kh;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public int getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getNghenghiep() {
		return nghenghiep;
	}

	public void setNghenghiep(String nghenghiep) {
		this.nghenghiep = nghenghiep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(long dienthoai) {
		this.dienthoai = dienthoai;
	}

	public boolean isQuantri() {
		return quantri;
	}

	public void setQuantri(boolean quantri) {
		this.quantri = quantri;
	}

	public Set getHoadon() {
		return hoadon;
	}

	public void setHoadon(Set hoadon) {
		this.hoadon = hoadon;
	}

	public Set getPhanhoi() {
		return phanhoi;
	}

	public void setPhanhoi(Set phanhoi) {
		this.phanhoi = phanhoi;
	}

	public Set getBaiviet() {
		return baiviet;
	}

	public void setBaiviet(Set baiviet) {
		this.baiviet = baiviet;
	}
	
}
