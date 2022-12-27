import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EsayAccessAssignment
{
     // class variables
     static Scanner in = new Scanner(System.in);
       //creating a new student and teacher
     static Teacher t1 = new Teacher ();
     static Student s1 = new Student ();
       // file track
     static String fileName = "C:\\myFile\\input.txt";
       // array list
     static  List<String> res = new ArrayList<>();
     public static void main ()
     {
          // calling the to set courses
        setCourse(); 
          // create array of object
        s1.courseStu[0] = new Course ();
        
          //program start here
        for ( int k=1;k<3;k++ )
        {
        System.out.println("\t\t       𝓐𝓼𝓼𝓲𝓰𝓷𝓶𝓮𝓷𝓽 𝓢𝓾𝓫𝓶𝓲𝓼𝓼𝓲𝓸𝓷");
        System.out.println("**********************************************************************");
        System.out.printf("Choose a number :> \n(1) for Student, (2) for Teacher:>  ");
        int choose = in.nextInt();in.nextLine();
        
           //if the user enter an invalid number
        while ( choose != 1 && choose != 2 )  {
            System.out.printf("\nSorry, choose (1) for Student, (2) for Teacher:> ");
            choose = in.nextInt();in.nextLine(); }
            
            //for student 
            
        if ( choose == 1 )
        {  System.out.printf("\nPlease Enter your full name: > ");
           s1.setName(in.nextLine());
        
           System.out.print("Enter your ID:> ");
           s1.setId(in.nextLine());

           System.out.printf("\nChoose the number of your course:> \n");
           
             //printing the course name
           for ( int i=0; i<3 ; i++ )  {
              System.out.printf("%d-%2s%s\t\t",i+1, t1.courseTea[i].getCourseTitle(),t1.courseTea[i].getCourseCode());}
             
           System.out.println();
           int courseNo = in.nextInt();
           
             //invalid choosing for course
           while ( courseNo != 1 && courseNo != 2 && courseNo != 3 )  {
              System.out.println("Sorry, you have to choose from these 3 courses");
              courseNo = in.nextInt(); }

              //assigning the choosen course to the student
           switch (courseNo)    {
                case 1: s1.courseStu[0].setCourseTitle(t1.courseTea[0].getCourseTitle());
                        s1.courseStu[0].setCourseCode(t1.courseTea[0].getCourseCode());
                        break;
                case 2: s1.courseStu[0].setCourseTitle(t1.courseTea[1].getCourseTitle());
                        s1.courseStu[0].setCourseCode(t1.courseTea[1].getCourseCode());
                        break;
                case 3: s1.courseStu[0].setCourseTitle(t1.courseTea[2].getCourseTitle());
                        s1.courseStu[0].setCourseCode(t1.courseTea[2].getCourseCode());    
                        break;    }
                    
           in.nextLine(); // Flush
           System.out.printf("\nPaste your assignment in the space provided\n");
           
            // setting assignment
           s1.setAssignment(in.nextLine());
            // calling method to write the assignment to the file
           splitString(s1.getAssignment(),40);
           
           System.out.printf("\nEnter (1) to SUBMIT OR (2) to SEE your assignment \n");
           int submit = in.nextInt();
              
               //if the user did not enter 1 or 2
           while ( submit != 1 && submit != 2)    {
              System.out.println("invalid, Please enter (1) to SUBMIT OR (2) to SEE your assignment");
                submit=in.nextInt();  }
                
               //if user enter 1 or 2
           if(submit == 1) {
              System.out.printf("\n𝕊𝕌ℂℂ𝔼𝕊𝕊𝔽𝕌𝕃 … 𝔾𝕠𝕠𝕕 𝕝𝕦𝕔𝕜\n ");}
              
           else if(submit == 2) {
              System.out.println("------------------------------------------");
              //calling the method to see the code
              System.out.println(s1.assignHeader());readFile(); 
              System.out.println("------------------------------------------");
              
              System.out.printf("\nEnter (1) to SUBMIT\n");
              submit = in.nextInt();
              
                //if user did not enter 1
              while ( submit != 1)    {
                System.out.println("Unsuccessful, Please enter (1)");
                submit=in.nextInt();  } 
              System.out.printf("\n𝕊𝕌ℂℂ𝔼𝕊𝕊𝔽𝕌𝕃 … 𝔾𝕠𝕠𝕕 𝕝𝕦𝕔𝕜\n\n"); 
            }

             //to clean the screen for the next choice
           System.out.print('\u000C');
        }
        
             //for teacher
             
        else if ( choose == 2 )  
        {  System.out.printf("\nPlease Enter your full name: > ");
           t1.setName(in.nextLine());
        
           System.out.print("Enter your ID:> ");
           t1.setId(in.nextLine());
           
           System.out.printf("\nChoose a student from the list:> \n");
             //printing students list
           System.out.printf("Student(1): %s\t    ID: %s\t  Course: %s%s\n",s1.getName(),s1.getId()
                             ,s1.courseStu[0].getCourseTitle(),s1.courseStu[0].getCourseCode());
           int studentNo=in.nextInt();
           
             // invalid choice
           while ( studentNo != 1 )    {
              System.out.println("Sorry, this student does not exist. Choose another student");
              studentNo=in.nextInt();  }
                
             //for now it is only student number1
           if ( studentNo==1 )   {
                System.out.println("------------------------------------------");
                System.out.println( t1.assignHeader() + s1.getName() ); 
                 // calling the method to see the assingment
                readFile();
                System.out.println("------------------------------------------");
                System.out.println();
                System.out.printf("Enter the marks for %s ",s1.getName());
                double  mark = in.nextDouble();
                s1.setMark(mark);
                System.out.println(s1.getName()+"'grade is: "+Grade.toGrade(mark));
                System.out.println();   }
               // cleaning the screen
           System.out.print('\u000C');
        }
     }
     System.out.printf("\n\n𝕋ℍ𝔸ℕ𝕂 𝕐𝕆𝕌 𝔽𝕆ℝ 𝕌𝕊𝕀ℕ𝔾 𝔸𝕊𝕊𝕀𝔾ℕ𝕄𝔼ℕ𝕋 𝕊𝕌𝔹𝕄𝕀𝕊𝕊𝕀𝕆ℕ ...");
     }
    
        // method to set courses
     public static void setCourse()
     {
          //array of object
        for (int i=0;i<t1.courseTea.length;i++)
          t1.courseTea[i] = new Course ();
          
          //setting courses
        t1.courseTea[0].setCourseTitle("ENGL");
        t1.courseTea[0].setCourseCode("101");
        t1.courseTea[1].setCourseTitle("ENGL");
        t1.courseTea[1].setCourseCode("102");
        t1.courseTea[2].setCourseTitle("ENGL");
        t1.courseTea[2].setCourseCode("331");
     } 
     
     // this method to cut the string and write them to a file
     public static List<String> splitString(String msg, int lineSize)
     {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         
            Pattern p = Pattern.compile("\\b.{1," + (lineSize-1) + "}\\b\\W?");
            Matcher m = p.matcher(msg);
            bufferedWriter.newLine();
	    while(m.find()) {
                //System.out.println(m.group().trim()); 
                bufferedWriter.write(m.group().trim());
                bufferedWriter.newLine(); // Debug
                res.add(m.group());
            }
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ fileName + "'");
        }
        return res;
     }
    
      // method for reading the String form a file
     public static void readFile()
     {
         String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");  
                }
     }
}