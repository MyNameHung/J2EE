package com.model.dto;
import java.util.*;
public class Hangsx {
	private int ma_hangsx;
	private String tenhangsx;
	private Set sanpham;
	
	public Hangsx(){}
	
	public Hangsx(String _tenhangsx){
		this.setTenhangsx(_tenhangsx);
	}

	public int getMa_hangsx() {
		return ma_hangsx;
	}

	public void setMa_hangsx(int ma_hangsx) {
		this.ma_hangsx = ma_hangsx;
	}

	public String getTenhangsx() {
		return tenhangsx;
	}

	public void setTenhangsx(String tenhangsx) {
		this.tenhangsx = tenhangsx;
	}

	public Set getSanpham() {
		return sanpham;
	}

	public void setSanpham(Set sanpham) {
		this.sanpham = sanpham;
	}
	
	
}
