package Bai3;

public class Bai3 {
    public static void main(String[] args){
        // Giai đoạn 1: Khởi tạo
        // Stack: book1 chứa địa chỉ @101, book2 chứa địa chỉ @202
        // Heap: @101 là "Java Basic", @202 là "Python Intro"
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        String temp;
        System.out.println("Trước khi hoán đổi: Book 1 =" + book1 + ", Book2 = " + book2);
        // Giai đoạn 2: Tạo biến tạm temp
        // Stack: temp được tạo ra và copy địa chỉ từ book1 (@101)
        // Lúc này cả temp và book1 đều trỏ cùng vào đối tượng "Java Basic" trên Heap
        temp = book1;
        // Giai đoạn 3: Gán book2 cho book1
        // Stack: book1 thay đổi giá trị từ @101 thành @202 (địa chỉ của "Python Intro")
        // Lưu ý: Nội dung trên Heap KHÔNG thay đổi, chỉ có mũi tên trỏ đi là thay đổi
        book1 = book2;
        // Giai đoạn 4: Gán temp cho book2
        // Stack: book2 thay đổi giá trị từ @202 thành @101 (lấy từ temp)
        book2 = temp;
        System.out.println("Sau khi hoán đổi: Book 1 =" + book1 + ", Book2 = " + book2);
    }
}
