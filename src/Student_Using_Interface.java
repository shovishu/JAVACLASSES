import java.util.Scanner;
interface student
{
    int studentID = 1816882;
    String studentName = "Vishwajeet";
    String Class = "CSE" ;

    void getValue();
}

class Department implements student
{
    int attendance;
    public void getAttendance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Attendance: ");
        attendance = sc.nextInt();
    }

    public void getValue()
    {
        System.out.println("ID :" + studentID + "\tName :" + studentName + "\tClass : " + Class);
    }
}

class Exam extends Department
{
    public void calculateAttendance()
    {
        attendance = attendance;
    }
    public boolean eligible()
    {
        if(attendance < 60)
            return false;
        else
            return true;
    }
}

public class Student_Using_Interface
{
    public static void main(String[] args)
    {
        Exam e = new Exam();
        e.getValue();
        e.getAttendance();
        e.calculateAttendance();
        System.out.println("Eligibility :" + e.eligible());
    }
}