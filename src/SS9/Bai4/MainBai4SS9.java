package SS9.Bai4;

public class MainBai4SS9 {

        public static void main(String[] args) {
            // 1. Khai báo kiểu cha, khởi tạo kiểu con
            Animal animal = new Dog();

            // 2. Gọi phương thức chung (Tính đa hình)
            // Kết quả sẽ là "Gâu gâu!" vì Java gọi theo Actual Type tại Runtime
            animal.makeSound();

            // 3. Thử gọi phương thức riêng (Sẽ bị lỗi Compile-time)
            // animal.guardHouse(); // Lỗi! Vì Declared Type (Animal) không có phương thức này.

            // 4. Sử dụng instanceof và Downcasting (Ép kiểu) an toàn
            if (animal instanceof Dog) {
                Dog myDog = (Dog) animal; // Ép kiểu từ Animal về Dog
                myDog.guardHouse();        // Bây giờ đã gọi được phương thức riêng
            }
        }
    }

