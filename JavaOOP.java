public class JavaOOP extends AbstractClass{
    int ch = 0;
    final int n = 20;
    String s = "OOOPS";
    public JavaOOP()
    {
        ch = 20;
    }

    public JavaOOP(String ch)
    {
        s = ch;
    }

    static void funCheck()
    {
        System.out.println("Funcheck Called");
    }

    public void funCheck2()
    {
        System.out.println("Funcheck_2 Called");
    }

    public void animalSound()
    {
        System.out.println("MEOW");
    }

    public static void main(String[] args)
    {
        JavaOOP.funCheck();
        JavaOOP obj = new JavaOOP();
        obj.animalSound();
        obj.name();
        System.out.println("Ch is "+obj.ch);

        Hello obj1 = new Hello();
        System.out.println(obj1.x);
        System.out.println("N is "+obj.n);

        obj.funCheck2();
        funCheck();

        JavaOOP obj3 = new JavaOOP("OOPS JAVA");
        System.out.println(obj3.s);

        DefaultClass obj4 = new DefaultClass();
        System.out.println(obj4.temp);

        Encap obj5 = new Encap();

        obj5.setName("Nikunj Singhania");

        System.out.println(obj5.getName());


    }
}
