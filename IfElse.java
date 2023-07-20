public class IfElse {
    public static void main(String[] args)
    {
        if(20 == 20)
        {
            System.out.println("ITS TRUE");
        }
        else if(20 < 10)
        {
            System.out.println("YES ITS TRUE");
        }
        else
        {
            System.out.println("FINAL TRUE");
        }

        String res = (40 == 40) ? "I AM TRUE" : "I AM FALSE";
        System.out.println(res);
    }
}
