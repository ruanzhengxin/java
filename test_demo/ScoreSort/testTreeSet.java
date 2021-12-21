package ScoreSort;

import java.util.Comparator;
import java.util.TreeSet;

public class testTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getLanguageScore()!=o2.getLanguageScore())return o1.getLanguageScore()- o2.getLanguageScore();
                else if(o1.getMathScore()!=o2.getMathScore())return o1.getMathScore()-o2.getMathScore();
                return o1.getName().compareTo(o2.getName());
            }
        });
        Student qwe = new Student("qwe", 44, 55);
        Student rzx = new Student("rzx", 99, 55);
        Student tfd = new Student("tfd", 44, 66);
        Student rer = new Student("rer", 44, 55);
        ts.add(qwe);
        ts.add(rer);
        ts.add(rzx);
        ts.add(tfd);
        System.out.println(ts.size());
        System.out.println(ts);

    }
}
