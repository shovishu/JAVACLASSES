public class Student
{
    String name;
    public Student(String a)
    {
        name=a;
    }
    public Student()
    {
        name="Unknown";
    }
    public static void main(String args[])
    {
        Student a=new Student("Vishwajeet");
        Student b=new Student();

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

