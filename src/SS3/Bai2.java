package SS3;

import java.util.Scanner;
public class Bai2 {

    public static int searchBooks(String[] arr, String search) {

        for (int i = 0; i <arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Attack on Titan",
                "Naruto",
                "Dragon Ball",
                "Fairy Tail"
        };
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách cần tìm: ");
        String query = sc.nextLine();
        int result = searchBooks(books, query);
        if (result > -1) {
            System.out.println("Sách '" + query + "' được tìm thấy tại vị trí : " + result);
        }
        else {
            System.out.print("Sách '" + query + "' không tồn tại trong thư viện.");
        }
    }
}
