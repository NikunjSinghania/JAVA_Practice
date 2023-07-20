import java.io.*;



class Scooby extends Thread

{

    Scooby(String name)
    {
        super(name);
    }
@Override public void run()

{

System.out.println("Thread Scobby is running");

}

}

class Shaggy extends Thread

{

    Shaggy(String name)
    {
        super(name);
    }
@Override public void run()

{

System.out.println("Thread Shaggy is running");

}

}

class ThreadJava
{
    
public static void main(String[] args)

{

    Scooby Thread1 = new Scooby("Scooby");

    Shaggy Thread2 = new Shaggy("Shaggy");

    Thread1.run();
    Thread2.run();
    System.out.println("Thread1 name is : "+Thread1.getName());
    System.out.println("Thread2 name is : "+Thread2.getName());
}
}
