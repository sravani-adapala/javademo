package studentform;

public class Student {
    String name;
    String fatherName;
    String mobileNo;
    String doB;

    public Student(String name, String fatherName, String mobileNo, String doB) {
        this.name = name;
        this.fatherName = fatherName;
        this.mobileNo = mobileNo;
        this.doB = doB;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", doB='" + doB + '\'' +
                '}';
    }
}
