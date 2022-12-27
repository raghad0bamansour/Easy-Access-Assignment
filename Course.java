public class Course 
{
      // instance variables
    public String courseTitle;
    public String courseCode;
    
      // defualt constructor
    public Course ()
    {
    }
    
      // mutator methods for the attributes
    
    public void setCourseTitle(String c)
    {
       courseTitle = c;
    }
    
    public String getCourseTitle()
    {
        return courseTitle;
    }
    
    public void setCourseCode(String d)
    {
       courseCode = d;
    }
    
    public String getCourseCode()
    {
        return courseCode;
    }
}