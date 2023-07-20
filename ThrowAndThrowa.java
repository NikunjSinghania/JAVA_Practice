class NegativeExc extends Exception
{
    public int rad()
    {
        System.out.println("Wrong radius");
        return 0;
    }
}

public class ThrowAndThrowa {
    public static double area (int r) throws NegativeExc
    {
        if(r<0)
            throw new NegativeExc();
        
            return Math.PI*r*r;
    }
    public static int div(int a, int b) throws ArithmeticException
    {
        return a/b;
    }

    public static void main(String[] args)
    {
        try
        {
            //System.out.println(div(10, 0));
            System.out.println(area(-5));

        }
        catch(NegativeExc E)
        {
            System.out.print(E.rad());
        }
    }
}
