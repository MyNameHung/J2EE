package com.model.dto;

public class Nguoinhan {
	private int ma_nguoinhan;
	private String tennguoinhan;
	private String tentinh;
	private String diachi;
	private Hoadon hoadon;
	
	public Nguoinhan(){}
	
	public Nguoinhan(String _tennguoinhan, String _tentinh, String _diachi, Hoadon _hoadon){
		this.setTennguoinhan(_tennguoinhan);
		this.setTentinh(_tentinh);
		this.setDiachi(_diachi);
		this.setHoadon(_hoadon);
	}

	public int getMa_nguoinhan() {
		return ma_nguoinhan;
	}

	public void setMa_nguoinhan(int ma_nguoinhan) {
		this.ma_nguoinhan = ma_nguoinhan;
	}

	public String getTennguoinhan() {
		return tennguoinhan;
	}

	public void setTennguoinhan(String tennguoinhan) {
		this.tennguoinhan = tennguoinhan;
	}

	public String getTentinh() {
		return tentinh;
	}

	public void setTentinh(String tentinh) {
		this.tentinh = tentinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Hoadon getHoadon() {
		return hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}
	
}
