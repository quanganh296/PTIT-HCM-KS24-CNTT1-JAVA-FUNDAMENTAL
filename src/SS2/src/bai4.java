package SS2.src;

import java.util.Scanner;
public class bai4 {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập ID sách mới (Phải > 0): ");
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("Xác nhận mã sách " + n + " đã được ghi nhận.");
            }
            else {
                System.out.println("Lỗi: ID phải là số dương. Mời nhập lại!");
            }
        }while (n <= 0);
    }
}
