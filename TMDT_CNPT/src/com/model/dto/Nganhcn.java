package com.model.dto;
import java.util.*;
public class Nganhcn {
	private int ma_nganh;
	private String tenNganh;
	private String moTa;
	private Set phuTro;
	
	public Nganhcn(){}
	
	public Nganhcn(String _tenNganh, String _mota){
		this.setTenNganh(_tenNganh);
		this.setMoTa(_mota);
	}

	public int getMa_nganh() {
		return ma_nganh;
	}

	public void setMa_nganh(int ma_nganh) {
		this.ma_nganh = ma_nganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Set getPhuTro() {
		return phuTro;
	}

	public void setPhuTro(Set phuTro) {
		this.phuTro = phuTro;
	}
	
	
}
