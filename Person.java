import java.util.Scanner;

public abstract class Person
{
     //instance variables 
   private String name;
   private String id;
   
     //defualt constructor
   public Person ()
   {
   }
   
     // parameterized constructor
   public Person (String name,String id)
   {
       setName(name);
       setId(id);
   }
   
     // mutator methods for the instance variables 
     
   public void setName(String name)
   {
       this.name = name;
   }
    
   public String getName()
   {
       return name;
   }
    
    public void setId(String id)
   {
       this.id = id;
   }
    
   public String getId()
   {
       return id;
   }
     // abstract method
   public abstract String assignHeader();
}