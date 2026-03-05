package SS9.Bai1;

public class MainBai1SS9 {
    // 'args' is unused but required for the main method signature
    static void main(String[] args) {
        Bai1.Person ps = new Bai1.Person("Nguyen Van A", "20");
        Bai1.Person.Student student = ps.new Student("Nguyen Van A", "20", 1, 4.0);
        student.displayInfo();
    }
}
