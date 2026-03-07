package SS10.Bai3;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck extends Animal implements Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi trên mặt hồ.");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang cất cánh bay.");
    }
}

class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang quẫy đuôi bơi dưới nước.");
    }
}