import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args)
    {
        double r;
        Scanner rad = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        r = rad.nextInt();
        double area;
        area = 3.14*r*r;
        //System.out.println("Area of circle is : " + area);
        System.out.println("\n");
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
    }
}
