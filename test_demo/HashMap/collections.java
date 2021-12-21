package HashMap;

import java.util.ArrayList;
import java.util.Collections;

public class collections {
    public static void main(String[] args) {
        Student s1 = new Student("rzx", 32);
        Student s2 = new Student("ewq", 32);
        Student s3 = new Student("ttt", 11);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);

        for(Student s:list){
            System.out.println(s);
        }
    }
}
