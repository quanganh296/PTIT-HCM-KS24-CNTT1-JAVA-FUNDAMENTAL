package Train;


import java.util.Scanner;


public class MainTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số nguyên thứ nhất: ");
        int n = sc.nextInt();
        System.out.print("\nNhập số nguyên thứ 2: ");
        int m = sc.nextInt();


       int ucMax = 1;
       int min = Math.min(n, m);

            for (int i =1; i <= min; i++) {
                if(n%i == 0 && m % i == 0){
                        ucMax = i;
                }

            }
            System.out.print("Ước chung lớn nhất là: " + ucMax);
    }
}
















