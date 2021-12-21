package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        System.out.println("--------welcome to student manage system");
        while(true) {
            System.out.println("1.add student");
            System.out.println("2.delete student");
            System.out.println("3.modify student");
            System.out.println("4.show all students");
            System.out.println("5.exit");
            System.out.println("your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent(studentList);
                    break;
                case 2:
                    deleteStudent(studentList);
                    break;
                case 3:
                    modifyStudent(studentList);
                    break;
                case 4:
                    showAllStudent(studentList);
                    break;
                case 5:
                    System.out.println("thanks");
                    return;
            }
        }
    }

    public static void addStudent(ArrayList<Student>studentList){
        Scanner sc=new Scanner(System.in);
        System.out.println("studentNumber");
        String studentNumber=sc.nextLine();
        System.out.println("name");
        String name=sc.nextLine();
        System.out.println("age");
        String age=sc.nextLine();
        System.out.println("address");
        String address=sc.nextLine();
        Student newStudent = new Student(studentNumber,name,age,address);
        studentList.add(newStudent);
        System.out.println("success");
    }

    public static void deleteStudent(ArrayList<Student>studentList){
        Scanner sc=new Scanner(System.in);
        System.out.println("student number of delete one");
        String studentNumber=sc.nextLine();
        for(Student s:studentList){
            if(s.getStudentNumber().equals(studentNumber)){
                studentList.remove(s);
                System.out.println("success delete");
                return;
            }
        }
        System.out.println("have not found");
    }

    public static void showAllStudent(ArrayList<Student>studentList){
        if(studentList.size()==0){
            System.out.println("no information");
            return;
        }
        System.out.println("sid\tname\tage\taddress");
        for(Student s:studentList){
            System.out.println(s.getStudentNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }

    public static void modifyStudent(ArrayList<Student>studentList){
        Scanner sc=new Scanner(System.in);
        System.out.println("student number of modify one");
        String Number=sc.nextLine();
        for(Student s:studentList){
            if(s.getStudentNumber().equals(Number)){
                System.out.println("new information");
                System.out.println("studentnumber");
                String studentNumber=sc.nextLine();
                System.out.println("name");
                String name=sc.nextLine();
                System.out.println("age");
                String age=sc.nextLine();
                System.out.println("address");
                String address=sc.nextLine();
                s.setAddress(address);
                s.setAge(age);
                s.setStudentNumber(studentNumber);
                s.setName(name);
                System.out.println("success modify");
                return;
            }
        }
        System.out.println("have not found");
    }
}
