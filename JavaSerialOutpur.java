
import java.io.*;  
class Depersist{  


public static void main(String args[]){  


 try{  


  FileInputStream fin =new FileInputStream("f.txt");  


   ObjectInputStream ois =new ObjectInputStream(fin);  


   Student s=(Student)ois.readObject(); 


  System.out.println(s.id+" "+s.name);  


   ois.close();  

   System.out.println("success");  


   }catch(Exception e){


 System.out.println(e);

}   }  }