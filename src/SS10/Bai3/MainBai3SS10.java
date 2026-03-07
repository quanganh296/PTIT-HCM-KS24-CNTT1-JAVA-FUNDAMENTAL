package SS10.Bai3;

public class MainBai3SS10 {

        public static void main(String[] args) {
            Duck donald = new Duck("Vịt Donald");
            Fish nemo = new Fish("Cá Nemo");

            System.out.println("--- Khả năng của Vịt ---");
            donald.swim();
            donald.fly();

            System.out.println("\n--- Khả năng của Cá ---");
            nemo.swim();
            // nemo.fly(); // Dòng này sẽ báo lỗi biên dịch vì Cá không có khả năng bay
        }

}
