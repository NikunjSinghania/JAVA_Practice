import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        int n, fact = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = in.nextInt();
        if(n == 0)
        {
            System.out.println("Factorial of "+n+" is 1");
        }
        for(int i=1;i<=n;i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }
}