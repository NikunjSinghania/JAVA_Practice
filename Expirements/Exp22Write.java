import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exp22Write {
    public static void main(String[] args)
    {
        try
        {
            File fileRead = new File("ExpFile.txt");
            Scanner readFile = new Scanner(fileRead);
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
        }
        
    }
}
