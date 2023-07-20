public class Child1 extends Child {
    public void showChild1()
    {
        System.out.println("Child1 class method");
    }

    public static void main(String[] args)
    {
        Child1 obj = new Child1();
        obj.showChild1();
    }
}
