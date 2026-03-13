package SS15.Bai3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack = new Stack<>();


    public boolean checkProcess(String[] actions) {

        reset();

        for (String action : actions) {

            if (action.equals("PUSH")) {

                stack.push("MED");
                System.out.println("Phát thuốc");

            }

            else if (action.equals("POP")) {

                if (stack.isEmpty()) {

                    System.out.println("Sai: POP khi stack rỗng");
                    return false;
                }

                stack.pop();
                System.out.println("Hoàn tất phát thuốc");
            }

            else {

                System.out.println("Sai: thao tác không hợp lệ -> " + action);
                return false;
            }
        }


        if (!stack.isEmpty()) {

            System.out.println("Sai: Kết thúc nhưng chưa hoàn tất hết thuốc");
            return false;
        }


        System.out.println("Quy trình hợp lệ");
        return true;
    }


    public void reset() {
        stack.clear();
    }
}