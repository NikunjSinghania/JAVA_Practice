import java.io.*;

public class ReadWrite {
    public static void main(String[] args)
    {
        try
        {
            FileInputStream F1 = new FileInputStream("RW.txt");
            ObjectInputStream O = new ObjectInputStream(F1);

            FUN S = (FUN)O.readObject();
            
            System.out.println(S.ID+"  "+S.NAME);
            O.close();
            System.out.println("PRINTED");
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
    
}
