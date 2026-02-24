package SS2.src;

import java.util.Scanner;
public class Bai2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A, B, C, D): ");
        char choice = sc.next().toUpperCase().charAt(0);
        switch (choice) {
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách Văn học ");
                break;
            case 'B':
                System.out.println("Vị trí: Tầng 2 - Sách Khoa học ");
                break;
            case 'C':
                System.out.println("Vị trí: Tầng 3 - Sách Ngoại Ngữ ");
                break;
            case 'D':
                System.out.println("Vị trí: Tầng 4 - Sách Tin học ");
                break;
            default:
                System.out.println("Lỗi: Mã khu vực không hợp lệ. Vui lòng nhập A, B, C hoặc D.");
        }

    }
}
