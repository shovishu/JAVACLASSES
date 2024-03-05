public class Pclass
{
    public void PMethod()
    {
        System.out.println("This is parent class");
    }
}

class Cclass extends Pclass
{
    public void CMethod()
    {
        System.out.println("This is child class");
    }
}

class Ans {
    public static void main(String[] args) {
        Pclass PC = new Pclass();
        Cclass CC = new Cclass();
        PC.PMethod();
        CC.CMethod();
        CC.PMethod();
    }
}