public class SwitchClass
{
    public  static  void main(String args[])
    {
        int age=60;
        switch (age)
        {
            case 18:
                System.out.println("Can Vote");
                break;
            case 60:
                System.out.println("Senior Citizen");
                break;
            default:
                System.out.println("Cannot Vote");
        }
    }
}
