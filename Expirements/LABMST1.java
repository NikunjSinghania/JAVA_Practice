class Rectangle
{
    
    int length;
    int breadth;

    public Rectangle()
    {
        System.out.println("Rectangle Constructor Called");
    }
    public Rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }

    int area()
    {
        return length*breadth;
    }

    int perimeter()
    {
        return 2*(length+breadth);
    }
}

class Square extends Rectangle
{
    int side;
    public Square(int s)
    {
        this.side = s;
    }

    int area()
    {
        return side*side;
    }

    int perimeter()
    {
        return 4*side;
    }
}

public class LABMST1{
    public static void main(String[] args)
    {
        Rectangle Obj = new Rectangle(20,20);
        System.out.println("Rectangle area is : "+Obj.area()+" and Perimter is : "+Obj.perimeter());
        Square Obj1 = new Square(40);
        System.out.println("Square area is : "+Obj1.area()+" and Perimeter is : "+Obj1.perimeter());

    }
}
