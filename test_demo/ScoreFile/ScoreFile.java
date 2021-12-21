package ScoreFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ScoreFile {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> list=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int sum1=o1.getLanguageScore()+o1.getEnglishScore()+o1.getMathScore();
                int sum2= o2.getEnglishScore()+ o2.getMathScore()+o2.getLanguageScore();
                int num =sum2-sum1;
                int num1=num==0? o2.getLanguageScore()-o1.getLanguageScore():num;
                int num2= num1==0? o2.getMathScore()-o1.getMathScore():num1;
                int num3=num2==0? o2.getEnglishScore()- o1.getEnglishScore():num2;
                return num3;
            }
        });
        Student s1=new Student("rzx",66,77,77);
        Student s2=new Student("ewq",88,77,66);
        Student s3=new Student("gds",88,66,77);
        list.add(s2);
        list.add(s1);
        list.add(s3);
        BufferedWriter bw=new BufferedWriter(new FileWriter("score.txt"));
        for(Student s:list){
            String student=s.getName()+","+s.getLanguageScore()+","+s.getMathScore()+","+s.getEnglishScore();
            bw.write(student,0,student.length());
            bw.newLine();
            bw.flush();

        }
        bw.close();
    }
}
