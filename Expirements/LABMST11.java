import java.util.Scanner;


public class LABMST11 {

    public static void main(String[] args)
    {
        int n=0, index;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the index of the array element you want to access");
        index = in.nextInt();
        try{
            System.out.print("The array element at index "+index+" = "+arr[index]+"\n");
            System.out.println("The array element successfully accessed");
        }
        catch(Exception E)
        {
            System.out.println(E);
        }

    }
}
