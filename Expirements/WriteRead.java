import java.io.Serializable;
import java.io.*;

class FUN implements Serializable
{
    int ID;
    String NAME;

    public FUN(int i, String n)
    {
        this.ID = i;
        this.NAME = n;
    }
}

public class WriteRead
{
    public static void main(String[] args)
    {
        try
        {
            FUN F1 = new FUN(101, "ABC");
            FileOutputStream fount = new FileOutputStream("RW.txt");
            ObjectOutputStream Out = new ObjectOutputStream(fount);

            Out.writeObject(F1);

            Out.close();

            System.out.println("DONE");
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
    
}
