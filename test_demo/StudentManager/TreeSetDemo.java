package StudentManager;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> pq=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String age1 = o1.getAge();
                String age2 = o2.getAge();
                return Integer.parseInt(age1) - Integer.parseInt(age2);
            }
        });

    }
}
