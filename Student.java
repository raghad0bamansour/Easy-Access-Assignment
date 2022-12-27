public class Student extends Person
{ 
    private double mark;
    private String assignment;
     // creating an array from Course class
      // for now, student has one course
    Course[] courseStu = new Course[1];
    
      // defualt constructor
    public Student ()
    {
    }
    
      // parameterized constructor
    public Student (String name,String id)
    {
        super(name,id);
    }
    
      // mutator methods for the attributes
      
    public void setAssignment(String ass)
    {
        assignment = ass;
    }
    
    public String getAssignment()
    {
        return assignment;
    }
    
    public void setMark(double mark)
    {
        this.mark = mark;
    }
    
    public double getMark()
    {
        return mark;
    }
    
      // implements abstract method
    public String assignHeader()
    {
        return "Your assignment: ";
    }
}