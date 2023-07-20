public class Method {
    static void fun()
    {
        System.out.println("METHOD CALLED 👍");
    }

    static void funArg(String s, int n)
    {
        System.out.println(s+" "+n);
    }

    static int funOver(int n)
    {   
        return n;
    }

    static String funOver(String s, int m)
    {
        return s;
    }
    public static void main(String[] args) {
        fun();
        funArg("NIKUNJ", 11092);
        System.out.println(funOver(200));
        System.out.println(funOver("Overloading",2000));
    }
}

