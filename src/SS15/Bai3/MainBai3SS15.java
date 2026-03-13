package SS15.Bai3;

public class MainBai3SS15 {

    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();


        String[] case1 = {
                "PUSH",
                "PUSH",
                "POP",
                "POP"
        };


        String[] case2 = {
                "PUSH",
                "POP",
                "POP"
        };


        String[] case3 = {
                "PUSH",
                "PUSH"
        };


        System.out.println("Case 1:");
        checker.checkProcess(case1);

        System.out.println("\nCase 2:");
        checker.checkProcess(case2);

        System.out.println("\nCase 3:");
        checker.checkProcess(case3);
    }
}