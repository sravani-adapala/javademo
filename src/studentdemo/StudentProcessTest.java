package studentdemo;

public class StudentProcessTest {
    public static void main(String[] args) {
        StudentProcessService sc=new StudentProcessService();
        StudentDetails sd=new StudentDetails();
        sd.marks=65;
        String message=sc.details(sd);
        System.out.println(message);
        System.out.println(sd.marks);
    }
}
