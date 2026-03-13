package SS15.Bai2;

import java.util.LinkedList;
import java.util.Queue;
public class Patient {


    private String id;
    private String name;
    private int age;

    public  Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return id + " - " + name + " - " + age;
    }
}
