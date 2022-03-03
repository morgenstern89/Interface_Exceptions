package exception;

public class StudentAgain {
    private String name;
    private int grade;
    public StudentAgain(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) throws GradeNotValid{
        if(grade<5 || grade>10){
            throw new GradeNotValid("Grade not valid");
        }
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
