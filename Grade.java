public class Grade
{
    
      // class variable
    private static String letter;
    
      // method to return the grade
      
    public static String toGrade(double grade)
    {
        if(grade <= 100 && grade >= 95) 
          letter="A+"; 
          
        else if (grade <95 && grade>=90)
          letter="A";
          
        else if (grade <90 && grade>=85)
         letter="B+";
         
        else if (grade <85 && grade>=80)
          letter= "B";
          
        else if (grade <80 && grade>=75)
          letter= "C+";
          
        else if (grade <75 && grade>=70)
         letter= "C";
         
        else if (grade <70 && grade>=65)
          letter="D+";
          
        else if (grade <65 && grade>=60)
          letter= "D";
          
        else if (grade <60 && grade>=0)
         letter= "F";
         
        return letter;
    }
}