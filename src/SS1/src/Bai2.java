package Bai2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n: ");
        int n = sc.nextInt();
        System.out.println("Mời bạn nhập số m: ");
        int m = sc.nextInt();
        double Total;
        Total = n * m * 5000;
        System.out.println("Tổng tiền phạt gốc: " + Total);
        if (n > 7 && m >= 3) {
            Total += Total * 0.2;

        }
        System.out.println("Tổng tiền phạt sau chỉnh: " + Total);
        boolean Checked = (Total > 50000);
        System.out.println("Yêu cầu khóa thẻ: " + (Checked ? "True" : "False"));



    }
}
