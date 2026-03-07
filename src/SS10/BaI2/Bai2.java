package SS10.BaI2;

abstract class Vehicle {
    protected String brand;

    // Constructor để khởi tạo hãng xe
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Phương thức trừu tượng (không có thân hàm)
    public abstract void move();
}
// Lớp Xe hơi
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " - Cách di chuyển: Di chuyển bằng động cơ");
    }
}

// Lớp Xe đạp
class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " - Cách di chuyển: Di chuyển bằng sức người");
    }
}