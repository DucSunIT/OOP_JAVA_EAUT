package eaut.sach;

public class Sach extends Ma {

	private String tenSach;
	private String theLoai;
	private int namXuatBan;
	private int soLuong;

	public Sach(int maSach, int maNhaSanXuat, int maTacGia, String tenSach, String theLoai, int namXuatBan,
			int soLuong) {
		super(maSach, maNhaSanXuat, maTacGia);
		this.tenSach = tenSach;
		this.theLoai = theLoai;
		this.namXuatBan = namXuatBan;
		this.soLuong = soLuong;
	}

	public String getTenSach() {
		return this.tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTheLoai() {
		return this.theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public int getNamXuatBan() {
		return this.namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
