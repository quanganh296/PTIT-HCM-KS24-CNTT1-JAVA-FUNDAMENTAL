package SS13.Bai2;


import java.util.ArrayList;

class Box<T> {
    private T value;
    public void add(T value) { this.value = value; }
    public T add() { return value; }
}

public class MainBai2SS13 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("An");
        students.add("Bình");
        students.add("Chi");

        System.out.println(students);

    }
}
