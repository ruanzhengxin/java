package ScoreSort;

public class Student {
    private String name;
    private int languageScore;
    private int mathScore;

    public Student() {
    }

    public Student(String name, int languageScore, int mathScore) {
        this.name = name;
        this.languageScore = languageScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguageScore() {
        return languageScore;
    }

    public void setLanguageScore(int languageScore) {
        this.languageScore = languageScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", languageScore=" + languageScore +
                ", mathScore=" + mathScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (languageScore != student.languageScore) return false;
        if (mathScore != student.mathScore) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + languageScore;
        result = 31 * result + mathScore;
        return result;
    }
}
