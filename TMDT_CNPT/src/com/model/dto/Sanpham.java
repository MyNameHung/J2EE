package com.model.dto;
import java.util.*;
import org.springframework.format.datetime.DateFormatter;

public class Sanpham {
	private int ma_sp;
	private String tensp;
	private String ngayNhap;
	private long giaNhap;
	private long giaXuat;
	private int soLuongNhap;
	private boolean tinhTrang;
	private boolean noiBat;
	private float kichThuoc;
	private float trongLuong;
	private String loai;
	private String moTa;
	private String cachTinhGia;
	private String anh;
	private String thoiGianBaoHanh;

	private Set phutro;
	private Set phanhoi;
	private Set cthd;
	private Set baohanh;
	
	private Sub sub;
	private Hangsx hangsx;
	
	public Sanpham(){}
	
	public Sanpham(
			String _tensp,
			String _ngayNhap, 
			long _giaNhap, 
			long _giaXuat, 
			int _soLuongNhap, 
			boolean _tinhTrang, 
			boolean _noiBat,
			float _kichThuoc,
			float _trongLuong,
			String _loai,
			String _mota,
			String _cachTinhGia,
			String _anh,
			String _thoiGianBaoHanh,
			Sub _sub,
			Hangsx _hangsx){
		this.setTensp(_tensp);
		this.setNgayNhap(_ngayNhap);
		this.setGiaNhap(_giaNhap);
		this.setGiaXuat(_giaXuat);
		this.setSoLuongNhap(_soLuongNhap);
		this.setTinhTrang(_tinhTrang);
		this.setNoiBat(_noiBat);
		this.setKichThuoc(_kichThuoc);
		this.setTrongLuong(_trongLuong);
		this.setLoai(_loai);
		this.setMoTa(_mota);
		this.setCachTinhGia(_cachTinhGia);
		this.setAnh(_anh);
		this.setThoiGianBaoHanh(_thoiGianBaoHanh);
		this.setSub(_sub);
		this.setHangsx(_hangsx);
	}

	public int getMa_sp() {
		return ma_sp;
	}

	public void setMa_sp(int ma_sp) {
		this.ma_sp = ma_sp;
	}

	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public long getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(long giaNhap) {
		this.giaNhap = giaNhap;
	}

	public long getGiaXuat() {
		return giaXuat;
	}

	public void setGiaXuat(long giaXuat) {
		this.giaXuat = giaXuat;
	}

	public int getSoLuongNhap() {
		return soLuongNhap;
	}

	public void setSoLuongNhap(int soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public boolean isNoiBat() {
		return noiBat;
	}

	public void setNoiBat(boolean noiBat) {
		this.noiBat = noiBat;
	}

	public float getKichThuoc() {
		return kichThuoc;
	}

	public void setKichThuoc(float kichThuoc) {
		this.kichThuoc = kichThuoc;
	}

	public float getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(float trongLuong) {
		this.trongLuong = trongLuong;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getCachTinhGia() {
		return cachTinhGia;
	}

	public void setCachTinhGia(String cachTinhGia) {
		this.cachTinhGia = cachTinhGia;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public Set getPhutro() {
		return phutro;
	}

	public void setPhutro(Set phutro) {
		this.phutro = phutro;
	}

	public Set getPhanhoi() {
		return phanhoi;
	}

	public void setPhanhoi(Set phanhoi) {
		this.phanhoi = phanhoi;
	}

	public Set getCthd() {
		return cthd;
	}

	public void setCthd(Set cthd) {
		this.cthd = cthd;
	}

	public Set getBaohanh() {
		return baohanh;
	}

	public void setBaohanh(Set baohanh) {
		this.baohanh = baohanh;
	}

	public Sub getSub() {
		return sub;
	}

	public void setSub(Sub sub) {
		this.sub = sub;
	}

	public Hangsx getHangsx() {
		return hangsx;
	}

	public void setHangsx(Hangsx hangsx) {
		this.hangsx = hangsx;
	}
}
