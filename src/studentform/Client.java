package studentform;

public class Client {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        Student s = ss.studentdetails("sravs", "ASR", "1234567890", 2 / 04 / 2002);
        System.out.println(s);
    }

    
}
