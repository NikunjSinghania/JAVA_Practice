class Customer
{
    public int N = 123;
    private int Q = 456;
    protected int R = 789;
    int Y = 100;

    void show()
    {
        System.out.println("IN SAME CLASS PUBLIC VARIABLE : "+N);
        System.out.println("IN SAME CLASS PRIVATE VARIABLE : "+Q);
        System.out.println("IN SAME CLASS PROTECTED VARIABLE : "+R);
        System.out.println("IN SAME CLASS DEFAULT VARIABLE : "+Y);
    }
}

public class Var extends Customer
{
    public static void main(String[] args){
        Var O = new Var();
        O.show();
        System.out.println("IN DIFFERNET CLASS PUBLIC VARIABLE : "+O.N);
        System.out.println("IN DIFFERNET CLASS PRIVATE VARIABLE CANNOT BE INVOKED");
        System.out.println("IN DIFFERNET CLASS PROTECTED VARIABLE : "+O.R);
        System.out.println("IN DIFFERNET CLASS DEFAULT VARIABLE : "+O.Y);
    }
}