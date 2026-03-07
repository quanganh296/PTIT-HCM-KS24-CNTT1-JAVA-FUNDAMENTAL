package SS10.BaI2;

public class MainBai2SS10 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Car
        Vehicle myCar = new Car("Toyota");

        // Khởi tạo đối tượng Bicycle
        Vehicle myBicycle = new Bicycle("Thống Nhất");

        // Gọi phương thức move() của từng loại
        myCar.move();
        myBicycle.move();
    }
}