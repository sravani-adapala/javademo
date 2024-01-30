package studentdemo;

public class StudentProcessService {
    public String details(StudentDetails studentDetails) {
        StudentDetails details=new StudentDetails();
        String name = "sravs";
        int rollNum = 502;
        int marks = 35;
        if (studentDetails.marks >= marks) {
            System.out.println(details.marks);
            return "studentpassed";
        }
        else
        {
            return "studentfailed";


            }


        }

    }
