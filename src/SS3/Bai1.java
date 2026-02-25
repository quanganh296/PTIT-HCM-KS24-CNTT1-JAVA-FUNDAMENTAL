package SS3;

import java.util.Scanner;
public class Bai1 {
    public static void addBookToLibraries( int n, int[] arr ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số cho " + n + " cuốn sách: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập ID sách thứ " + (i + 1) + " : ");
             arr[i] = sc.nextInt();

        }

    }
    public static void displayLibraries(int n, int[] arr) {
        System.out.println("===== KẾT QUẢ =====");
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        addBookToLibraries(n, arr);
        displayLibraries(n, arr);

    }
}
