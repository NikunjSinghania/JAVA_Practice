import java.util.Scanner;

public class activityTemp {
    public static void main(String[] args)
    {
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE");
        temp = in.nextInt();

        if(temp >= 80)
        System.out.println("SWIMMING");
        else if(temp < 80 && temp >= 60)
        System.out.println("TENNIS");
        else if(temp >= 40 && temp < 60)
        System.out.println("GOLF");
        else if(temp < 40)
        System.out.println("SKIING");
    }
}
