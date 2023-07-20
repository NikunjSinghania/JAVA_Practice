public class Encap {
    private String name = "JAVA";

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        System.out.println("Encap");
        DefaultClass obj = new DefaultClass();
        System.out.println(obj.temp);
    }

}
