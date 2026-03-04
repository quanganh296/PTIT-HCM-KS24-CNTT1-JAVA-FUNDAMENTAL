package SS8.HCM_KS24_CNTT1_NguyenQuangAnh;


import java.util.Scanner;

public class MainSS8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int currentCount = 0;

        do {
            System.out.println("\n**************** STUDENT MANAGEMENT ****************");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên theo ID");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Xóa sinh viên theo ID");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn chọn (1-6): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        if (currentCount == 0) {
                            System.out.println("Danh sách trống!");
                        } else {
                            System.out.println("--- DANH SÁCH SINH VIÊN ---");
                            for (int i = 0; i < currentCount; i++) {
                                students[i].displayData();
                            }
                        }
                        break;

                    case 2:
                        if (currentCount >= 100) {
                            System.out.println("Mảng đã đầy!");
                        } else {
                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập tuổi: ");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.print("Nhập giới tính: ");
                            String sex = scanner.nextLine();
                            System.out.print("Nhập điểm: ");
                            double mark = Double.parseDouble(scanner.nextLine());

                            students[currentCount++] = new Student(id, name, age, sex, mark);
                            System.out.println("Thêm thành công!");
                        }
                        break;

                    case 3:
                        System.out.print("Nhập ID cần sửa: ");
                        String editId = scanner.nextLine();
                        int editIdx = findIndexById(students, currentCount, editId);
                        if (editIdx != -1) {
                            System.out.print("Tên mới: ");
                            students[editIdx].setStudentName(scanner.nextLine());
                            System.out.print("Tuổi mới: ");
                            students[editIdx].setAge(Integer.parseInt(scanner.nextLine()));
                            System.out.print("Giới tính mới: ");
                            students[editIdx].setSex(scanner.nextLine());
                            System.out.print("Điểm mới: ");
                            students[editIdx].setMark(Double.parseDouble(scanner.nextLine()));
                            System.out.println("Cập nhật thành công!");
                        } else {
                            System.out.println("Không tìm thấy ID!");
                        }
                        break;

                    case 4:
                        System.out.print("Nhập tên cần tìm: ");
                        String searchName = scanner.nextLine().toLowerCase();
                        boolean found = false;
                        for (int i = 0; i < currentCount; i++) {
                            if (students[i].getStudentName().toLowerCase().contains(searchName)) {
                                students[i].displayData();
                                found = true;
                            }
                        }
                        if (!found) System.out.println("Không tìm thấy!");
                        break;

                    case 5:
                        System.out.print("Nhập ID cần xóa: ");
                        String delId = scanner.nextLine();
                        int delIdx = findIndexById(students, currentCount, delId);
                        if (delIdx != -1) {
                            // Dồn mảng
                            for (int i = delIdx; i < currentCount - 1; i++) {
                                students[i] = students[i + 1];
                            }
                            students[--currentCount] = null;
                            System.out.println("Xóa thành công!");
                        } else {
                            System.out.println("Không tìm thấy ID!");
                        }
                        break;

                    case 6:
                        System.out.println("Thoát chương trình...");
                        return;

                    default:
                        System.out.println("Lựa chọn từ 1-6!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        } while (true);
    }

    // Hàm phụ trợ tìm kiếm Index theo ID
    private static int findIndexById(Student[] students, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(id)) return i;
        }
        return -1;
    }
}
