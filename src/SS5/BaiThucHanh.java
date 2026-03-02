package SS5;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentManager {

    String[] studentIds = new String[100];
    int currentSize = 0;

    final String MSSV_REGEX = "^B\\d{7}$";

    public void showMenu() {
        System.out.println("\n========= STUDENT ID MANAGER =========");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.println("=======================================");
    }

    public static void displayStudentIds() {
        if (currentSize == 0) {
            System.out.println("Danh sách đang trống!");
            return;
        }

        System.out.println("\n----- DANH SÁCH MSSV -----");
        for (int i = 0; i < currentSize; i++) {
            System.out.printf("%d. %s\n", i, studentIds[i]);
        }
    }

    public static void addStudent(Scanner scanner) {

        if (currentSize >= 100) {
            System.out.println("Mảng đã đầy! Không thể thêm.");
            return;
        }

        String newId;

        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newId = scanner.nextLine();

            if (Pattern.matches(MSSV_REGEX, newId)) {
                break;
            } else {
                System.out.println("Sai định dạng! MSSV phải dạng B + 7 chữ số (Ví dụ: B2101234)");
            }
        }

        studentIds[currentSize] = newId;
        currentSize++;
        System.out.println("Thêm thành công!");
    }

    public static void updateStudent(Scanner scanner) {

        if (currentSize == 0) {
            System.out.println("Danh sách đang trống!");
            return;
        }

        System.out.print("Nhập vị trí (index) cần sửa: ");

        int index;
        while (!scanner.hasNextInt()) {
            System.out.println("Vui lòng nhập số!");
            scanner.next();
            System.out.print("Nhập lại index: ");
        }

        index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= currentSize) {
            System.out.println("Index không hợp lệ!");
            return;
        }

        String newId;

        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newId = scanner.nextLine();

            if (Pattern.matches(MSSV_REGEX, newId)) {
                break;
            } else {
                System.out.println("Sai định dạng! MSSV phải dạng B + 7 chữ số.");
            }
        }

        studentIds[index] = newId;
        System.out.println("Cập nhật thành công!");
    }

    public static void deleteStudent(Scanner scanner) {

        if (currentSize == 0) {
            System.out.println("Danh sách đang trống!");
            return;
        }

        System.out.print("Nhập MSSV cần xóa: ");
        String idToDelete = scanner.nextLine();

        int foundIndex = -1;

        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].equals(idToDelete)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Không tìm thấy MSSV!");
            return;
        }

        // Dồn mảng
        for (int i = foundIndex; i < currentSize - 1; i++) {
            studentIds[i] = studentIds[i + 1];
        }

        studentIds[currentSize - 1] = null;
        currentSize--;

        System.out.println("Xóa thành công!");
    }

    public static void searchStudent(Scanner scanner) {

        if (currentSize == 0) {
            System.out.println("Danh sách đang trống!");
            return;
        }

        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;

        System.out.println("Kết quả tìm kiếm:");

        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].toLowerCase().contains(keyword)) {
                System.out.println(studentIds[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có kết quả phù hợp!");
        }
    }
}