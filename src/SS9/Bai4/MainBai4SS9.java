package SS9.Bai4;

public class MainBai4SS9 {

        static void main(String[] args) {
            Animal animal = new Dog();
            animal.makeSound();

            if (animal instanceof Dog) {
                Dog myDog = (Dog) animal;
                myDog.guardHouse();
            }
        }
    }

