import java.util.Scanner;

public class JavaAnagram {
    public static void main(String[] args)
    {
        String s;
        String d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two strings : ");
        s = in.next();
        d = in.next();
        

        if(s.length() != d.length())
        {
            System.out.println("Not Anagrams");
            return;
        }

        int[] arr1;
        arr1 = new int[26];
        int[] arr2;
        arr2 = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i) >= 65 && (int)s.charAt(i)<=90)
            {
                arr1[(int)s.charAt(i)-65]++;
            }

            if((int)s.charAt(i) >= 97 && (int)s.charAt(i)<=122)
            {
                arr1[(int)s.charAt(i)-97]++;
            }
        }

        for(int i=0;i<d.length();i++)
        {
            if((int)d.charAt(i) >= 65 && (int)d.charAt(i)<=90)
            {
                arr2[(int)d.charAt(i)-65]++;
            }

            if((int)d.charAt(i) >= 97 && (int)d.charAt(i)<=122)
            {
                arr2[(int)d.charAt(i)-97]++;
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
            {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagarm");
        return;
    }
}
