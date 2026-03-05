package SS9.Bai4;

class Animal {
    void makeSound() {
        System.out.println("Động vật đang phát ra tiếng kêu...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Gâu gâu!");
    }

    // Phương thức riêng của lớp Dog
    void guardHouse() {
        System.out.println("Chó đang trông nhà.");
    }
}

