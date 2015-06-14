package com.model.dto;

public class Phutro {
	private int ma_phutro;
	private String ungdung;
	private Nganhcn nganhcn;
	private Sanpham sanpham;
	
	public Phutro(){}
	
	public Phutro(String _ungdung, Nganhcn _nganhcn, Sanpham _sanpham){
		this.setUngdung(_ungdung);
		this.setNganhcn(_nganhcn);
		this.setSanpham(_sanpham);
	}

	public int getMa_phutro() {
		return ma_phutro;
	}

	public void setMa_phutro(int ma_phutro) {
		this.ma_phutro = ma_phutro;
	}

	public String getUngdung() {
		return ungdung;
	}

	public void setUngdung(String ungdung) {
		this.ungdung = ungdung;
	}

	public Nganhcn getNganhcn() {
		return nganhcn;
	}

	public void setNganhcn(Nganhcn nganhcn) {
		this.nganhcn = nganhcn;
	}

	public Sanpham getSanpham() {
		return sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}
	
	
}
