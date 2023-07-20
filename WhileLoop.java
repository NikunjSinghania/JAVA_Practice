public class WhileLoop {
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        do
        {
            System.out.println("DO "+i);
            i--;
        }while(i>0);
        
    }
}
