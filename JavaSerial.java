

import java.io.Serializable;  

import java.io.*;  



class Student implements Serializable{  

int id;  

String name;  

public Student(int id, String name) {  

this.id = id;  

 this.name = name;  

 }  

}  


class Persist{  


public static void main(String args[]){  


try{  


  Student s1 =new Student(101,"ABC");  


  FileOutputStream fout=new FileOutputStream("Check.txt");  


  ObjectOutputStream out=new ObjectOutputStream(fout);  


 out.writeObject(s1);  


   out.close();  

  System.out.println("success");  


   }catch(Exception e){


 System.out.println(e);
 }   }  }