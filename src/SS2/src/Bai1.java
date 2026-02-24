package SS2.src;
import java.util.Scanner;

public class Bai1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách đang mượn: ");
        int borrowedBooks = sc.nextInt();
        boolean checked = age >= 18 && borrowedBooks < 3;
        String status = checked ? "Đủ điều kiện mượn sách quy hiem" : "Không đủ điều kiện";
        String ageChecked = age >= 18 ? " " : "Bạn phải từ 18 tuổi trở lên";
        String bookChecked = borrowedBooks < 3 ? " " : "Bạn đã mượn tối da 3 cuốn";
        if (age >= 18 && borrowedBooks < 3) {
            System.out.println("Kêt quả: " + status);
        } else if (age < 18 && borrowedBooks < 3) {
            System.out.println("Kêt quả: " + status);
            System.out.println(" - Lý do: " + ageChecked);
        }
        else if (age >= 18 && borrowedBooks > 3) {
            System.out.println("Kêt quả: " + status);
            System.out.println(" - Lý do: " + bookChecked);
        }
        else if (age < 18 && borrowedBooks > 3) {
            System.out.println("Kêt quả: " + status);
            System.out.println(" - Lý do: " + ageChecked + " và " + bookChecked);
        }
        else{
            System.out.println("Kêt quả: " + status);
        }
    }
}
