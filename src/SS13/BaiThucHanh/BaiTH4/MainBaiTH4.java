package SS13.BaiThucHanh.BaiTH4;
import java.util.ArrayList;
import java.util.Iterator;

public class MainBaiTH4 {
    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Database");
        subjects.add("Web");

        for(int i = 0; i < subjects.size(); i++){
            System.out.println(subjects.get(i));
        }

        for(String subject : subjects){
            System.out.println(subject);
        }

        Iterator<String> iterator = subjects.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
