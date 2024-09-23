package controller;

import java.util.Scanner;

import eaut.database.HandleDatabase;

public class NhaXuatBan {
	Scanner sc = new Scanner(System.in);
	HandleDatabase hddb = new HandleDatabase();

	// method connect database
	public void connectDB() {
		hddb.connectDB();
	}

	// method print info table NXB
	public void printInfo() {
		String sql = "SELECT * FROM NXB";
		System.out.println("MaNXB" + " - " + "TenNXB" + " - " + "DiaChi");
		System.out.println("-----------------");
		hddb.excuteQuery(sql);
	}

	// method update info
	public void updateInfo() {
		String sql = "UPDATE NXB SET TenNXB = ? WHERE MaNXB = ? ";
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		hddb.updateData(sql, name, id);
	}

	// method delete by id
	public void deleteDaTa() {
		String sql = "DELETE FROM NXB WHERE MaNXB = ?";
		System.out.println("Enter id to delete: ");
		int id = sc.nextInt();
		hddb.deleteData(sql, id);
	}

	// method statisical
	public void statisicalData() {
		System.out.println("MaNXB" + " - " + "TenNXB" + " - " + "SoLuong");
		System.out.println("-----------------");
		String sql = "SELECT NXB.MaNXB, NXB.TenNXB, COUNT(SACH.MaSach) AS SoLuongSach FROM NXB LEFT JOIN SACH ON NXB.MaNXB = SACH.MaNXB GROUP BY NXB.MaNXB, NXB.TenNXB";
		hddb.excuteQuery(sql);
	}
}
