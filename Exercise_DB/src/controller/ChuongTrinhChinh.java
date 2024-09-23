package controller;

import java.util.Scanner;

public class ChuongTrinhChinh {
	MoBangSach mbs = new MoBangSach();
	NhaXuatBan nxb = new NhaXuatBan();
	Scanner sc = new Scanner(System.in);
	int choiceLarge = 0;
	int choiceSmall = 0;

	public void menuBook() {
		do {
			System.out.println("-------MENU SÁCH -----");
			System.out.println("1.Lấy dữ liệu");
			System.out.println("2.Sửa dữ liệu");
			System.out.println("3.Xóa dữ liệu");
			System.out.println("4.Quay lại MENU CHÍNH");
			System.out.println(">>> Nhập lựa chọn");
			choiceSmall = sc.nextInt();
			switch (choiceSmall) {
			case 1: {
				mbs.printInfo();
				break;
			}
			case 2: {
				mbs.updateInfo();
				break;
			}
			case 3: {
				mbs.deleteDaTa();
				break;
			}
			case 4: {
				mainProgram();
				break;
			}
			default:
				System.out.println("Invalid !");
			}
		} while (choiceSmall != 4);
	}

	public void menuPublisher() {
		do {
			System.out.println("-------MENU NHÀ XUẤT BẢN -----");
			System.out.println("1.Lấy dữ liệu");
			System.out.println("2.Sửa dữ liệu");
			System.out.println("3.Xóa dữ liệu");
			System.out.println("4.Thống kê");
			System.out.println("5.Quay lại MENU CHÍNH");
			System.out.println(">>> Nhập lựa chọn");
			choiceSmall = sc.nextInt();
			switch (choiceSmall) {
			case 1: {
				nxb.printInfo();
				break;
			}
			case 2: {
				nxb.updateInfo();
				break;
			}
			case 3: {
				nxb.deleteDaTa();
				break;
			}
			case 4: {
				nxb.statisicalData();
				break;
			}
			case 5: {
				mainProgram();
				break;
			}
			default:
				System.out.println("Invalid !");
			}
		} while (choiceSmall != 5);
	}

	public void mainProgram() {
		do {
			System.out.println("-------MENU-----");
			System.out.println("1.SÁCH");
			System.out.println("2.NHÀ XUẤT BẢN");
			System.out.println("3.THOÁT");
			System.out.println(">>> Nhập lựa chọn");
			choiceLarge = sc.nextInt();
			switch (choiceLarge) {
			case 1: {
				mbs.connectDB();
				menuBook();
				break;
			}
			case 2: {
				nxb.connectDB();
				menuPublisher();
				break;
			}
			case 3: {
				System.exit(0);
				break;
			}
			default:
				System.out.println("ERROR !");
			}
		} while (choiceLarge != 2);
	}
}
