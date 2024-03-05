class Member {
    public String name;
    public int age;
    public int PhnNo;
    public String address;
    public double salary;
    public void printSalary() {
        System.out.println("Salary" + salary);
    }
}
class Employee extends Member {
    String department;
    String specialization;
}
class Manager extends Member {
    String department;
    String specialization;
}

public class Main
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name="Vishwajeet";
        emp.PhnNo=783778;
        emp.age=23;
        emp.address="sgckgcgcsdgg";
        emp.salary=120000;
        emp.department="Testing";
        emp.specialization="Machine Learning";

        Manager mg=new Manager();
        mg.name="Vishwajeet";
        mg.PhnNo=783778;
        mg.age=23;
        mg.address="sgckgcgcsdgg";
        mg.salary=120000;
        mg.department="Testing";
        mg.specialization="Machine Learning";

        }

}


