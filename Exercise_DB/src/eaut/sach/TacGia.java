package eaut.sach;

public class TacGia extends Ma {
	private String hoTen;
	private int namSinh;
	private String queQuan;

	public TacGia(int maSach, int maNhaSanXuat, int maTacGia, String hoTen, int namSinh, String queQuan) {
		super(maSach, maNhaSanXuat, maTacGia);
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return this.namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return this.queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

}
