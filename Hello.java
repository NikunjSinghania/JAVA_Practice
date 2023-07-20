import java.util.Scanner;

public class Hello {
    String x = "Java is RUNNING!";
    public static void main(String[] args) {
        float n;
        Scanner in = new Scanner(System.in);
        n = in.nextFloat();
        System.out.printf("%.3f",n/1.609);
        String x = "Java is RUNNING!";
        System.out.println(x);
    }
}