package P1;
abstract class Bank
{
    abstract int getBalance();
}
class BankA extends Bank
{
    private int balance;
    void deposit(int amount)
    {
        balance+=amount;
    }
    int getBalance()
    {
        return balance;
    }
}
class BankB extends Bank
{
    private int balance;
    void deposit(int amount)
    {
        balance+=amount;
    }
    int getBalance()
    {
        return balance;
    }
}
class BankC extends Bank
{
    private int balance;
    void deposit(int amount)
    {
        balance+=amount;
    }
    int getBalance()
    {
        return balance;
    }
}
public class AbstractClassPrgm2
{
    public static void main(String args[]) {
        BankA BA = new BankA();
        BankB BB = new BankB();
        BankC BC = new BankC();

        BA.deposit(100);
        BB.deposit(150);
        BC.deposit(200);

        System.out.println("Amount in Bank A = $" + BA.getBalance());
        System.out.println("Amount in Bank B = $" + BB.getBalance());
        System.out.println("Amount in Bank C = $" + BC.getBalance());
    }
}
