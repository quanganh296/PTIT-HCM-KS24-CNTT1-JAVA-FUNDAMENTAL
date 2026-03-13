package SS15.Bai1;

import java.util.Stack;


// =========================
// EditAction
// =========================
class EditAction {

    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return description + " | " + time;
    }
}


class MedicalRecordHistory {

    private Stack<EditAction> history = new Stack<>();


    // push
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("THÊM: " + action);
    }


    // pop
    public EditAction undoEdit() {

        if (!history.isEmpty()) {

            EditAction removed = history.pop();

            System.out.println("XÓA: " + removed);

            return removed;
        }

        System.out.println("Không có gì để undo");
        return null;
    }


    // peek
    public EditAction getLatestEdit() {

        if (!history.isEmpty()) {
            return history.peek();
        }

        return null;
    }


    public boolean isEmpty() {
        return history.isEmpty();
    }


    public void displayHistory() {

        System.out.println("\n===== LỊCH SỬ =====");

        if (history.isEmpty()) {
            System.out.println("Trống");
            return;
        }

        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}



public class MainBai1SS15 {

    public static void main(String[] args) {

        MedicalRecordHistory manager = new MedicalRecordHistory();

        manager.addEdit(new EditAction("Panadol", "12/03"));
        manager.addEdit(new EditAction("Decolgen", "13/03"));
        manager.addEdit(new EditAction("Jumatto", "14/03"));

        manager.displayHistory();

        System.out.println("\nGần nhất:");
        System.out.println(manager.getLatestEdit());

        manager.undoEdit();

        manager.displayHistory();
    }
}