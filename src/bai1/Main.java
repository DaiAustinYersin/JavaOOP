package bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLCB ql = new QLCB();
        ql.init();
        Scanner sc = new Scanner(System.in);
        String chon;

        while (true) {
            menu();
            System.out.print("Chọn chức năng: ");
            chon = sc.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("1. Thêm mới cán bộ.");
                    System.out.print("Chọn loại cán bộ cần thêm (1. Công nhân | 2. Kỹ sư | 3. Nhân viên): ");
                    String loaiCB = sc.nextLine();
                    switch (loaiCB) {
                        case "1": {
                            System.out.print("Nhập tên công nhân: ");
                            String name = sc.nextLine();

                            int age;
                            while (true) {
                                try {
                                    System.out.print("Nhập tuổi: ");
                                    age = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Tuổi không hợp lệ");
                                }
                            }

                            char sex;
                            while (true) {
                                System.out.print("Nhập giới tính (M-Nam, F-Nữ, O-Khác): ");
                                sex = sc.nextLine().charAt(0);
                                if ("MFO".contains(sex + "")) {
                                    break;
                                }
                            }

                            System.out.print("Nhập địa chỉ: ");
                            String address = sc.nextLine();

                            int rank;
                            while (true) {
                                System.out.print("Nhập bậc (từ 1-10): ");
                                rank = sc.nextInt();
                                sc.nextLine();
                                try {
                                    if (rank >= 1 && rank <= 10) {
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                            ql.themMoi(new CongNhan(name, age, sex, address, rank));
                            break;
                        }
                        case "2": {
                            System.out.print("Nhập tên kỹ sư: ");
                            String name = sc.nextLine();

                            int age;
                            while (true) {
                                try {
                                    System.out.print("Nhập tuổi: ");
                                    age = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Tuổi không hợp lệ");
                                }
                            }

                            char sex;
                            while (true) {
                                System.out.print("Nhập giới tính (M-Nam, F-Nữ, O-Khác): ");
                                sex = sc.nextLine().charAt(0);
                                if ("MFO".contains(sex + "")) {
                                    break;
                                }
                            }

                            System.out.print("Nhập địa chỉ: ");
                            String address = sc.nextLine();
                            
                            System.out.print("Nhập ngành đào tạo: ");
                            String major = sc.nextLine();
                            ql.themMoi(new KySu(name, age, sex, address, major));
                            break;
                        }
                        case "3": {
                            System.out.print("Nhập tên công nhân: ");
                            String name = sc.nextLine();

                            int age;
                            while (true) {
                                try {
                                    System.out.print("Nhập tuổi: ");
                                    age = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Tuổi không hợp lệ");
                                }
                            }

                            char sex;
                            while (true) {
                                System.out.print("Nhập giới tính (M-Nam, F-Nữ, O-Khác): ");
                                sex = sc.nextLine().charAt(0);
                                if ("MFO".contains(sex + "")) {
                                    break;
                                }
                            }

                            System.out.print("Nhập địa chỉ: ");
                            String address = sc.nextLine();
                            
                            System.out.print("Nhập công việc: ");
                            String task = sc.nextLine();
                            ql.themMoi(new NhanVien(name, age, sex, address, task));
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("2. Tìm kiếm theo họ tên.");
                    String name = sc.nextLine();
                    ql.timKiemHoTen(name).stream().forEach(System.out::println);
                    break;
                case "3":
                    ql.thongTinDS();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại từ 1-4");
            }
        }

    }

    public static void menu() {
        System.out.println("==================================================");
        System.out.println("\t1. Thêm mới cán bộ.");
        System.out.println("\t2. Tìm kiếm theo họ tên.");
        System.out.println("\t3. Hiện thị thông tin về danh sách các cán bộ.");
        System.out.println("\t4. Thoát khỏi chương trình.");
        System.out.println("==================================================");
    }

}
