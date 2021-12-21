package ScoreFile;

public class Student {
    private String name;
    private int languageScore;
    private int mathScore;
    private int englishScore;

    public Student(String name, int languageScore, int mathScore, int englishScore) {
        this.name = name;
        this.languageScore = languageScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public Student() {
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

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", languageScore=" + languageScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }
}
