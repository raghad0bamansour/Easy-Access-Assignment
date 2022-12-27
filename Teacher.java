public final class Teacher extends Person
{
      // creating an array from a class
    Course[] courseTea = new Course[3];
    
      //defualt constructor
    public Teacher()
    {
    }
    
      // parameterized constructor
    public Teacher (String name,String id)
    {
        super(name,id);
    }
    
      // implements abstract method
    public String assignHeader()
    {
        return "This assignment for " ;
    }
}