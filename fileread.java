import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileread {
    public static void main(String[] args)
    {
        try
        {
            File Obj = new File("FistFile.txt");
            Scanner readFile = new Scanner(Obj);
            while(readFile.hasNextLine())
            {
                String data = readFile.nextLine();
                System.out.println(data);
            }

            readFile.close();
        }
        catch(FileNotFoundException E)
        {
            System.out.println(E);
            E.printStackTrace();
        }
    }
}
