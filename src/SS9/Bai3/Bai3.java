package SS9.Bai3;

// Lớp cha: Employee

class Employee {
    protected String name;
    protected double basicSalary;

    // Constructor của lớp cha
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + basicSalary);
    }
}

// Lớp con: Manager kế thừa từ Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, double basicSalary, String department) {
        // GỌI CONSTRUCTOR LỚP CHA (Bắt buộc ở dòng đầu tiên)
        super(name, basicSalary);
        this.department = department;
    }

    // Ghi đè phương thức để hiển thị thêm phòng ban
    @Override
    public void displayInfo() {
        super.displayInfo(); // Gọi lại phương thức của lớp cha để tránh lặp code
        System.out.println("Phòng ban: " + department);
    }
}


