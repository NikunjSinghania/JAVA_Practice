import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args)
    {
        try
        {
            FileWriter writeFile = new FileWriter("FirstFile.txt");
            writeFile.write("Is JAVA file writing working ?");
            writeFile.close();
            System.out.println("Successfully written");
        }
        catch(IOException E)
        {
            System.out.println(E);
            E.printStackTrace();
        }
    }
}
