package SS5;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiThucHanh {


        // Khai báo hằng số và biến toàn cục trong class
        private static final int MAX_SIZE = 100;
        private static String[] danhSachMSSV = new String[MAX_SIZE];
        private static int currentSize = 0;
        private static Scanner sc = new Scanner(System.in);

        // Regex: Bắt đầu bằng B (hoặc b), theo sau là đúng 7 chữ số
        private static final String MSSV_REGEX = "^[Bb]\\d{7}$";

        public static void main(String[] args) {
            int luaChon;
            do {
                hienThiMenu();
                System.out.print("Nhập lựa chọn của bạn: ");
                // Xử lý chống trôi lệnh khi nhập số
                while (!sc.hasNextInt()) {
                    System.out.println("Vui lòng nhập một con số!");
                    sc.next();
                }
                luaChon = sc.nextInt();
                sc.nextLine(); // Clear bộ nhớ đệm

                switch (luaChon) {
                    case 1: hienThiDanhSach(); break;
                    case 2: themSinhVien(); break;
                    case 3: capNhatSinhVien(); break;
                    case 4: xoaSinhVien(); break;
                    case 5: timKiemSinhVien(); break;
                    case 0: System.out.println("Đang thoát chương trình..."); break;
                    default: System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (luaChon != 0);
        }

        private static void hienThiMenu() {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ MSSV ---");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới MSSV (Regex)");
            System.out.println("3. Cập nhật MSSV theo vị trí");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("0. Thoát");
            System.out.println("-----------------------------");
        }

        // Kiểm tra định dạng MSSV bằng Regex
        private static boolean isValidMSSV(String mssv) {
            return mssv.matches(MSSV_REGEX);
        }

        private static void hienThiDanhSach() {
            if (currentSize == 0) {
                System.out.println("Danh sách trống!");
                return;
            }
            System.out.println("\nDANH SÁCH SINH VIÊN:");
            for (int i = 0; i < currentSize; i++) {
                System.out.printf("%d. %s\n", (i + 1), danhSachMSSV[i]);
            }
        }

        private static void themSinhVien() {
            if (currentSize >= MAX_SIZE) {
                System.out.println("Mảng đã đầy, không thể thêm mới!");
                return;
            }

            String mssvMoi;
            while (true) {
                System.out.print("Nhập MSSV mới (Ví dụ B2101234): ");
                mssvMoi = sc.nextLine();
                if (isValidMSSV(mssvMoi)) {
                    danhSachMSSV[currentSize] = mssvMoi.toUpperCase();
                    currentSize++;
                    System.out.println("Thêm thành công!");
                    break;
                } else {
                    System.out.println("Sai định dạng! MSSV phải có chữ B đầu và 7 chữ số sau.");
                }
            }
        }

        private static void capNhatSinhVien() {
            hienThiDanhSach();
            if (currentSize == 0) return;

            System.out.print("Nhập STT cần sửa: ");
            int index = sc.nextInt() - 1;
            sc.nextLine();

            if (index < 0 || index >= currentSize) {
                System.out.println("Vị trí không hợp lệ!");
            } else {
                String mssvMoi;
                while (true) {
                    System.out.print("Nhập MSSV mới cho vị trí này: ");
                    mssvMoi = sc.nextLine();
                    if (isValidMSSV(mssvMoi)) {
                        danhSachMSSV[index] = mssvMoi.toUpperCase();
                        System.out.println("Cập nhật thành công!");
                        break;
                    } else {
                        System.out.println("Sai định dạng! Vui lòng nhập lại.");
                    }
                }
            }
        }

        private static void xoaSinhVien() {
            System.out.print("Nhập MSSV cần xóa: ");
            String mssvCanXoa = sc.nextLine();
            int viTri = -1;

            // Tìm vị trí của MSSV
            for (int i = 0; i < currentSize; i++) {
                if (danhSachMSSV[i].equalsIgnoreCase(mssvCanXoa)) {
                    viTri = i;
                    break;
                }
            }

            if (viTri == -1) {
                System.out.println("Không tìm thấy MSSV này trong danh sách!");
            } else {
                // Thuật toán dồn mảng để xóa phần tử
                for (int i = viTri; i < currentSize - 1; i++) {
                    danhSachMSSV[i] = danhSachMSSV[i + 1];
                }
                danhSachMSSV[currentSize - 1] = null; // Xóa tham chiếu cũ
                currentSize--;
                System.out.println("Đã xóa MSSV thành công!");
            }
        }

        private static void timKiemSinhVien() {
            System.out.print("Nhập chuỗi ký tự cần tìm: ");
            String patternStr = sc.nextLine().toLowerCase();
            boolean found = false;

            System.out.println("\nKẾT QUẢ TÌM KIẾM:");
            for (int i = 0; i < currentSize; i++) {
                // Kiểm tra chứa chuỗi (không phân biệt hoa thường)
                if (danhSachMSSV[i].toLowerCase().contains(patternStr)) {
                    System.out.println("- " + danhSachMSSV[i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy kết quả nào.");
            }
        }
    }

