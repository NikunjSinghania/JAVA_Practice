import java.io.File;
import java.io.IOException;

public class Experiment22 {
    public static void main(String[] args)
    {
        try
        {
            File newFile = new File("ExpFile.txt");
            if(newFile.createNewFile())
            System.out.println("File Created Successfully");
            else
            {
                System.out.println("File already there");
            }
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}
