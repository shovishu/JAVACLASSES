interface Parent {
    public void method1();
}

interface Child{
    public void method1();
}

class Methods implements Parent,Child {
    public void method1() {
        System.out.println("This is Method1");
    }

    public void method2() {
        System.out.println("This is Method2");
    }
}
    public class MultipleInheritance
    {
        public static void main(String args[])
        {
            Methods m = new Methods();
            m.method1();
            m.method2();
        }
    }
