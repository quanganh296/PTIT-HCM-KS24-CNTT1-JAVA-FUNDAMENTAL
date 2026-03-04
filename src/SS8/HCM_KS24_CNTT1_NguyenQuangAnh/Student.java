package SS8.HCM_KS24_CNTT1_NguyenQuangAnh;


    public class Student {
        // 1. Thuộc tính (Fields) - Private theo đúng tính đóng gói
        private String studentId;
        private String studentName;
        private int age;
        private String sex;
        private double mark;

        // 2. Constructors
        public Student() {
        }

        public Student(String studentId, String studentName, int age, String sex, double mark) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.age = age;
            this.sex = sex;
            this.mark = mark;
        }

        // 3. Getters và Setters
        public String getStudentId() { return studentId; }
        public void setStudentId(String studentId) { this.studentId = studentId; }

        public String getStudentName() { return studentName; }
        public void setStudentName(String studentName) { this.studentName = studentName; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public String getSex() { return sex; }
        public void setSex(String sex) { this.sex = sex; }

        public double getMark() { return mark; }
        public void setMark(double mark) { this.mark = mark; }

        // Phương thức hiển thị
        public void displayData() {
            System.out.printf("ID: %-10s | Tên: %-20s | Tuổi: %-5d | Giới tính: %-10s | Điểm: %.2f\n",
                    studentId, studentName, age, sex, mark);
        }
    }


