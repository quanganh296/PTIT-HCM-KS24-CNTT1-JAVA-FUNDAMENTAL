package SS1.src;

import java.util.Scanner;
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        String BookID = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        String BookName = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.println("Nhập giá bìa: ");
        double price = sc.nextDouble();
        System.out.println("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("\n--- THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + BookName);
        System.out.println("Mã số: " + BookID + " | " + "Tuổi thọ sách: " + (2026 - publishYear));
        System.out.printf("Giá bán: %.2f VND%n ", price);
        System.out.println("Tình trạng: " + status);
    }
}
