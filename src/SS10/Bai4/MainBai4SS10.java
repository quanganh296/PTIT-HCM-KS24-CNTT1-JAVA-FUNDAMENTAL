package SS10.Bai4;

public class MainBai4SS10 {
    public static void main(String[] args) {

        // Sử dụng Anonymous Class để tạo đối tượng smartLight
        Bai4.RemoteControl smartLight = new Bai4.RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        // Gọi phương thức từ Anonymous Class
        smartLight.powerOn();

        // Gọi phương thức default từ interface
        smartLight.checkBattery();
    }
}
