import java.io.File;
import java.io.IOException;

public class fileCreate {
    public static void main(String[] args)
    {
        try
        {
            File Obj = new File("FirstFile.txt");
            if(Obj.createNewFile())
            {
                System.out.println("file created");
            }
            else
            {
                System.out.println("file already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
