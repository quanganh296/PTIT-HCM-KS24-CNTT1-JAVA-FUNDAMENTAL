package SS9.Bai2;


class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Bark!");
        }
    }
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meo meo!");
    }
}


