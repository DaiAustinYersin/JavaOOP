/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai2.objects.Bao;
import bai2.objects.Sach;
import bai2.objects.TapChi;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        QuanLyTaiLieu ql = new QuanLyTaiLieu();
        ql.init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Chọn chức năng: ");
            String chon = sc.nextLine();

            String maTL, nhaXB;
            int soBanPhatHanh;

            switch (chon) {
                case "1":
                    System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo.");
                    System.out.print("Chọn loại tài liệu cần thêm (1. Sách | 2. Tạp chí | 3. Báo): ");
                    String loaiTL = sc.nextLine();

                    switch (loaiTL) {
                        case "1": {
                            while (true) {
                                System.out.print("Mã tài liệu: ");
                                maTL = sc.nextLine();
                                if (ql.checkID(maTL)) {
                                    break;
                                } else {
                                    System.out.println("Mã tài liệu đã tồn tại");
                                }
                            }
                            System.out.print("Nhà xuất bản: ");
                            nhaXB = sc.nextLine();
                            while (true) {
                                try {
                                    System.out.print("Số bản phát hành: ");
                                    soBanPhatHanh = Integer.parseInt(sc.nextLine());
                                    if (soBanPhatHanh < 0) {
                                        System.out.println("Phải nhập số nguyên dương");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số nguyên dương");
                                    return;
                                }
                            }
                            System.out.print("Tác giả: ");
                            String tacGia = sc.nextLine();
                            int soTrang;
                            while (true) {
                                try {
                                    System.out.print("Số trang: ");
                                    soTrang = Integer.parseInt(sc.nextLine());
                                    if (soTrang < 0) {
                                        System.out.println("Phải nhập số nguyên dương");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số nguyên dương");
                                    return;
                                }
                            }
                            ql.themMoi(new Sach(tacGia, soTrang, maTL, nhaXB, soBanPhatHanh));
                            break;
                        }
                        case "2": {
                            while (true) {
                                System.out.print("Mã tài liệu: ");
                                maTL = sc.nextLine();
                                if (ql.checkID(maTL)) {
                                    break;
                                } else {
                                    System.out.println("Mã tài liệu đã tồn tại");
                                }
                            }
                            System.out.print("Nhà xuất bản: ");
                            nhaXB = sc.nextLine();
                            while (true) {
                                try {
                                    System.out.print("Số bản phát hành: ");
                                    soBanPhatHanh = Integer.parseInt(sc.nextLine());
                                    if (soBanPhatHanh < 0) {
                                        System.out.println("Phải nhập số nguyên dương");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số nguyên dương");
                                    return;
                                }
                            }
                            int soPhatHanh;
                            while (true) {
                                try {
                                    System.out.print("Số phát hành: ");
                                    soPhatHanh = Integer.parseInt(sc.nextLine());
                                    if (soPhatHanh < 0) {
                                        System.out.println("Phải nhập số nguyên dương");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số nguyên dương");
                                    return;
                                }
                            }
                            int thangPhatHanh;
                            while (true) {
                                try {
                                    System.out.print("Tháng phát hành: ");
                                    thangPhatHanh = Integer.parseInt(sc.nextLine());
                                    if (thangPhatHanh < 1 || thangPhatHanh > 12) {
                                        System.out.println("Tháng không hợp lệ");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Tháng không hợp lệ");
                                    return;
                                }
                            }
                            ql.themMoi(new TapChi(soPhatHanh, thangPhatHanh, maTL, nhaXB, soBanPhatHanh));
                            break;
                        }
                        case "3": {
                            while (true) {
                                System.out.print("Mã tài liệu: ");
                                maTL = sc.nextLine();
                                if (ql.checkID(maTL)) {
                                    break;
                                } else {
                                    System.out.println("Mã tài liệu đã tồn tại");
                                }
                            }
                            System.out.print("Nhà xuất bản: ");
                            nhaXB = sc.nextLine();
                            while (true) {
                                try {
                                    System.out.print("Số bản phát hành: ");
                                    soBanPhatHanh = Integer.parseInt(sc.nextLine());
                                    if (soBanPhatHanh < 0) {
                                        System.out.println("Phải nhập số nguyên dương");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số nguyên dương");
                                    return;
                                }
                            }
                            int ngayPhatHanh;
                            while (true) {
                                try {
                                    System.out.print("Ngày phát hành: ");
                                    ngayPhatHanh = Integer.parseInt(sc.nextLine());
                                    if (ngayPhatHanh < 1 || ngayPhatHanh > 31) {
                                        System.out.println("Ngày không hợp lệ");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Ngày không hợp lệ");
                                    return;
                                }
                            }
                            ql.themMoi(new Bao(ngayPhatHanh, maTL, nhaXB, soBanPhatHanh));
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("2. Xoá tài liệu theo mã tài liệu.");
                    System.out.print("Nhập mã tài liệu muốn xóa: ");
                    String id = sc.nextLine();
                    if (ql.xoa(id)) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Mã tài liệu không tồn tại");
                    }
                    break;
                case "3":
                    System.out.println("3. Hiện thị thông tin về tài liệu.");
                    ql.hienThi();
                    break;
                case "4":
                    System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
                    System.out.print("Chọn loại tài liệu cần tìm (1. Sách | 2. Tạp chí | 3. Báo): ");
                    loaiTL = sc.nextLine();
                    ql.timKiem(Integer.parseInt(loaiTL));
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Nhập lại chức năng từ 1-5");
            }
        }
    }

    public static void menu() {
        System.out.println("===========================================");
        System.out.println("\t1. Thêm mới tài liêu: Sách, tạp chí, báo.\n"
                + "\t2. Xoá tài liệu theo mã tài liệu.\n"
                + "\t3. Hiện thị thông tin về tài liệu.\n"
                + "\t4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.\n"
                + "\t5. Thoát khỏi chương trình.");
        System.out.println("===========================================");
    }
}
