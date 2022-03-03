package exception;

public class ExceptionDemo {
    public static void main(String[] args)throws GradeNotValid {
    StudentAgain student = new StudentAgain ("Julia");

    try{
        student.setGrade(8);

    }catch (Exception exception){
        exception.printStackTrace();
    }finally{
        System.out.println("finally block");
    }
    System.out.println(student.getGrade());
    }
}
