package SS15.Bai4;

public class EmergencyPatient {

    private String id;
    private String name;
    private int priority; // 1 = cap cuu, 2 = thuong

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        String p = (priority == 1) ? "CAP CUU" : "THUONG";
        return id + " - " + name + " - " + p;
    }
}