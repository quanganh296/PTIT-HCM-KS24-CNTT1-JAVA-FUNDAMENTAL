package SS2.src;

import java.util.Scanner;
public class Bai3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();
        int totalFine = 0;
        for (int i =0; i < n; i ++) {
            System.out.print("Nhập số ngày trễ của cuốn thứ" + " " + (i + 1) + " : ");
            int daysLate = sc.nextInt();
            int fine = 0;
            if (daysLate > 0) {
                fine = 5000 * daysLate;
            }
            totalFine += fine;
        }
        System.out.print("===> Tổng tiền phạt: " + totalFine + " VND");


    }
}
