package SS9.Bai2;

public class MainBai2SS9 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        System.out.print("Tiếng chó: ");
        myDog.sound(); // Kết quả: Gâu gâu!

        System.out.print("Tiếng mèo: ");
        myCat.sound();
    }
}
