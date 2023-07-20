public class RepeatEl {
    public static void main(String[] args)
    {
        int arr[] = {1,3,6,8,2,3,5,6};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] == arr[j] && j != i)
                {
                    System.out.println(i+1);
                    return;
                }
            }
            }
        }
    }

