public class Work3 {
    public static int fun(int a, int b) throws ArithmeticException
    {
        if(b == -1)
        throw new ArithmeticException("B is NEGATIVE");
        return a/b;
    }
    public static void main(String[] args)
    {
        try{
            fun(1, 0);
        }
        catch(ArithmeticException A)
        {
            System.out.println(A);
        }
    }
}
