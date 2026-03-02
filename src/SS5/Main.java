import SS5.StudentManager;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

     void main() {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            studentManager.showMenu();
            System.out.print("Nhập lựa chọn: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập số!");
                scanner.next();
                System.out.print("Nhập lại lựa chọn: ");
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    StudentManager.displayStudentIds();
                    break;
                case 2:
                    StudentManager.addStudent(scanner);
                    break;
                case 3:
                    StudentManager.updateStudent(scanner);
                    break;
                case 4:
                    StudentManager.deleteStudent(scanner);
                    break;
                case 5:
                    StudentManager.searchStudent(scanner);
                    break;
                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        scanner.close();
    }



