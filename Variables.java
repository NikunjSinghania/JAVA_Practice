public class Variables implements Interfaces {
    public void checkMethod()
    {
        System.out.println("Interface Method");
    }
    public static void main(String[] args)
    {
        String s = "CHECKING";
        int n = 10;
        float num = 34.88f;
        char c = 'C';
        boolean b = true;

        System.out.println(s+"  "+n+"   "+num+"  "+c+"  "+b);
        System.out.println(Long.MAX_VALUE);

        Variables obj = new Variables();

        System.out.print("Interface is : ");
        obj.checkMethod();
    }
}
