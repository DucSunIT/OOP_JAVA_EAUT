package study.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example {
	static Scanner sc = new Scanner(System.in);
	static Connection conn = null;
	static PreparedStatement pstm = null;

	// method connect
	public static Connection getConnect(String server, String databaseName) {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String conURL = "jdbc:sqlserver://" + server + ":1433;databasename=" + databaseName
					+ ";user=sa;password=admin;encrypt=true;trustservercertificate=true";
			conn = DriverManager.getConnection(conURL);
		} catch (SQLException e) {
			System.out.println("SQL Exception: " + e.toString());
		} catch (ClassNotFoundException cE) {
			System.out.println("Class Not Found Exception: " + cE.toString());
		}
		return conn;
	}

	public static void excuteQuery(String sql) {
		try {
			Statement state = conn.createStatement();
			ResultSet result = state.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("MaTG") + " - " + result.getString("HoTen") + " - "
						+ result.getString("NamSinh") + " - " + result.getString("QueQuan"));
			}
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// method add data
	public static void addData() {
		try {
			System.out.println("Nhập mã tác giả: ");
			int mtg = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập họ tên:");
			String ht = sc.nextLine();
			System.out.println("Nhập năm sinh:");
			int ns = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập quê quán: ");
			String qq = sc.nextLine();
			String sql = "INSERT INTO TACGIA(MaTG,HoTen,NamSinh,QueQuan)" + "VALUES(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, mtg);
			pstm.setString(2, ht);
			pstm.setInt(3, ns);
			pstm.setString(4, qq);

			int row = pstm.executeUpdate();
			if (row != 0) {
				System.out.println("Add data suscessfull !");
			}
//			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// update
	public static void updateData() {
		try {
			String sql = "UPDATE TACGIA SET HoTen = ? WHERE QueQuan = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "Đồng Hương");
			pstm.setString(2, "Thái Bình");

			int row = pstm.executeUpdate();
			if (row != 0) {
				System.out.println("Update sucessfull");
			}
//			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// delete data
	public static void deleteData() {
		try {
			String sqlSach = "DELETE FROM SACH WHERE MaTG = ?";
			pstm = conn.prepareStatement(sqlSach);
			pstm.setInt(1, 3);
			pstm.executeUpdate();

			String sql = "DELETE FROM TACGIA WHERE MaTG = ?";
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, 3);
			int row = pstm.executeUpdate();
			if (row != 0) {
				System.out.println("Delete sucessfull");
			}
//			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection connect = getConnect("localhost", "QL_SACH");
		if (connect != null) {
			System.out.println("Connect successfull");
		} else {
			System.out.println("Connect fail");
		}

//		excuteQuery("SELECT * FROM TACGIA");
		addData();
		updateData();
		excuteQuery("SELECT * FROM TACGIA");
		System.out.println("--------------------");
		deleteData();
		excuteQuery("SELECT * FROM TACGIA");
	}
}
