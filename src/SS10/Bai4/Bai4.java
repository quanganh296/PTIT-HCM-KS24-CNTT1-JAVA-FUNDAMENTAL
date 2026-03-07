package SS10.Bai4;

public class Bai4 {
    interface RemoteControl {
        // Phương thức trừu tượng bắt buộc phải triển khai
        void powerOn();

        // Phương thức mặc định (Java 8+) - không bắt buộc ghi đè
        default void checkBattery() {
            System.out.println("Pin ổn định");
        }
    }
}
