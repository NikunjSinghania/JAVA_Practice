import java.io.FileWriter;
import java.io.IOException;

public class Exp22Read {
    public static void main(String[] args)
    {
        try
        {
            FileWriter file = new FileWriter("ExpFile.txt");
            file.write("EXPERIMENT 2 FILE READ WRITE");
            file.close();
            System.out.println("File Updated");
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}
