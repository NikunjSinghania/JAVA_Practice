public class Child extends Base
{
    public void showChild()
    {
        System.out.println("Child class method");
    }

    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.showBase();
    }

    
}