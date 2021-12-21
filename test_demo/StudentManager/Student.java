package StudentManager;

import javax.swing.text.html.parser.TagElement;

public class Student {
    private String studentNumber;
    private String name;
    private String age;
    private String address;

    public Student (){}
    public Student (String studentNumber,String name,String age,String address){
        this.address=address;
        this.age= age;
        this.name=name;
        this.studentNumber=studentNumber;
    }
    public String getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber=studentNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
