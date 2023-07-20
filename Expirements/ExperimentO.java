class Over
{
    void fun1()
    {
        System.out.println("Function 1");
    }

    void fun1(int n)
    {
        System.out.println(n + " Overloaded Function");
    }
}


public class ExperimentO extends Over{
    void fun1()
    {
        System.out.println("Overrided Function");
    }
    public static void main(String[] args)
    {
        ExperimentO Obj = new ExperimentO();
        Obj.fun1(20);
        Obj.fun1();
    }
}
