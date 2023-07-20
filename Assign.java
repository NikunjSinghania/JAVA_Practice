

abstract class Fun
{
    String title,author;
    int price;

    Fun(String T, String A, int N)
    {
        this.title = T;
        this.author = A;
        this.price = N;
    }

    abstract void display();
}

public class Assign extends Fun
{
    Assign(String T, String A, int N) {
        
    }

    void display()
    {
        System.out.println(this.title);
    }

    public static void main(String[] args)
    {
        Assign A = (Assign) new Fun("casc","cecwe",9);
        
    }
}