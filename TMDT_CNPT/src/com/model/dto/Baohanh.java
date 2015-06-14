package com.model.dto;

public class Baohanh {
	private int ma_baohanh;
	private String ngaybaohanh;
	private long phibaohanh;
	
	private Sanpham sanpham;
	
	public Baohanh(){}
	
	public Baohanh(String _ngaybaohanh, long _phibaohanh, Sanpham _sanpham){
		this.setNgaybaohanh(_ngaybaohanh);
		this.setPhibaohanh(_phibaohanh);
		this.setSanpham(_sanpham);
	}

	public int getMa_baohanh() {
		return ma_baohanh;
	}

	public void setMa_baohanh(int ma_baohanh) {
		this.ma_baohanh = ma_baohanh;
	}

	public String getNgaybaohanh() {
		return ngaybaohanh;
	}

	public void setNgaybaohanh(String ngaybaohanh) {
		this.ngaybaohanh = ngaybaohanh;
	}

	public long getPhibaohanh() {
		return phibaohanh;
	}

	public void setPhibaohanh(long phibaohanh) {
		this.phibaohanh = phibaohanh;
	}

	public Sanpham getSanpham() {
		return sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}
}
