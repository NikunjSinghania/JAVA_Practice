
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;

public class Exp2
{
    String s;
    public static void fun1()
    {
        System.out.println("A Static Function");
    }

    public void setPar(String n)
    {
        this.s = n;
    }

    public String getPar()
    {
        return s;
    }
        public static void main(String[] args)
    {
        Exp2.fun1();
        Exp2 obj = new Exp2();
        obj.setPar("Instance Function");
        System.out.println(obj.getPar());

        NumberFormat ch = NumberFormat.getNumberInstance();
        System.out.println(ch);
        ch.setCurrency(
            Currency.getInstance(
                Locale.US
            )
        );

        String values = ch.getCurrency().getDisplayName();

        System.out.println(values);
    }

}