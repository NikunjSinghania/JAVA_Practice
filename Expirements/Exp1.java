
public class Exp1
{
    int ch = 0;
    String s = "Default";
    Exp1()
    {
        ch = 10;
    }

    Exp1(String cons, int ch)
    {
        this.ch = ch;
        s = cons;
    }

    void display()
    {
        System.out.println(s+" Constructor Called");
    }
    public static void main(String[] args)
    {
        Exp1 obj1 = new Exp1();
        obj1.display();
        System.out.println("Value of variable ch is "+obj1.ch);
        

        Exp1 obj2 = new Exp1("Parametrized",50);
        obj2.display();
        System.out.println("Value of variable ch is "+obj2.ch);
        
    }

}