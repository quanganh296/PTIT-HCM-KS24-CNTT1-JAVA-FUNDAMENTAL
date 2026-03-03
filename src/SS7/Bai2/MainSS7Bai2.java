import SS7.Bai2.Bai2;
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("--- Primitive Type (int) ---");
        System.out.println("a = " + a); // Kết quả: 10
        System.out.println("b = " + b); // Kết quả: 20

        Bai2.Student s1 = new Bai2.Student("An");
        Bai2.Student s2 = s1; // Sao chép địa chỉ từ s1 sang s2
        s2.name = "Bình"; // Thay đổi thuộc tính qua s2, liệu s1 có đổi không?

        System.out.println("\n--- Reference Type (Object) ---");
        System.out.println("s1 name = " + s1.name); // Kết quả: Bình
        System.out.println("s2 name = " + s2.name); // Kết quả: Bình
    }

