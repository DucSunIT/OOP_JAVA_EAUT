package eaut.sach;

public class NhaSanXuat extends Ma {
	private String tenNXB;
	private String diaChi;

	public NhaSanXuat(int maSach, int maNhaSanXuat, int maTacGia, String tenNXB, String diaChi) {
		super(maSach, maNhaSanXuat, maTacGia);
		// TODO Auto-generated constructor stub
		this.tenNXB = tenNXB;
		this.diaChi = diaChi;
	}

	public String getTenNXB() {
		return this.tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

}
