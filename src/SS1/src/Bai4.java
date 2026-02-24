package Bai4;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD): ");
        double price = sc.nextDouble();
        System.out.print("Nhập tỷ giá: ");
        float exchangeRate = sc.nextFloat();
        double Total = price * exchangeRate;

        System.out.println("Giá chính xác: " + Total);

        long totalVNDLong = (long)Total;
        System.out.print("Giá làm tròn để thanh toán: " + totalVNDLong + "VNĐ");

    }
}
