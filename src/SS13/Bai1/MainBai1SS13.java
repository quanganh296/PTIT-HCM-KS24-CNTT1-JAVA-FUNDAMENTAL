package SS13.Bai1;


class Box<T> {
    private T value;
    public void setValue(T value) { this.value = value; }
    public T getValue() { return value; }
}

public class MainBai1SS13 {

        public static void main(String[] args) {
            Box<Integer> numberBox = new Box<>();
            numberBox.setValue(10);
            System.out.println(numberBox.getValue());

            Box<String> stringBox = new Box<>();
            stringBox.setValue("Java");
            System.out.println(stringBox.getValue());
        }

}
