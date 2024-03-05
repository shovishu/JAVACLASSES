public class Calculator
{
        public void Addition(int a,int b)
        {
            int add=a+b;
            System.out.println(add);
        }
        public void Subtraction(int a,int b)
        {
            int sub=a-b;
            System.out.println(sub);
        }
        public void Multiply(int a,int b)
        {
            int mul=a*b;
            System.out.println(mul);
        }
        public void Divide(int a,int b)
        {
            int div=a/b;
            System.out.println(div);
        }

        public static void main(String args[])
        {
            Calculator cal=new Calculator();
            cal.Addition(10,20);
            cal.Subtraction(20,5);
            cal.Multiply(10,5);
            cal.Divide(100,4);
        }

}
