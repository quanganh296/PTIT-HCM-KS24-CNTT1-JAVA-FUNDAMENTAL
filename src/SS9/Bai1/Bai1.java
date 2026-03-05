package SS9.Bai1;

public class Bai1 {
    public static class Person {
        private final String name;
        private final String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }
        public class Student extends Person {
            public final int StudentId;
            public final double StudentGPA;

            public Student(String name, String age, int StudentId, double StudentGPA) {
                super(name, age);
                this.StudentId = StudentId;
                this.StudentGPA = StudentGPA;
            }


            public void displayInfo() {
                System.out.println("Họ và tên: " + name);
                System.out.println("Tuổi: " + age);
                System.out.println("MSSV: " + StudentId);
                System.out.println("GPA: " + StudentGPA);

            }

        }
    }
}
