import java.io.*;
public class Slip23B {
    public static void main(String[] args) throws Exception
    {
        File f=new File(args[0]);
        if (f.exists()) 
        {
            if (f.isHidden()) 
            {
                System.out.println("The given file is hidden");    

            }   
            else if (!f.isHidden()) 
            {
                System.out.println("The given file is not hidden");    
                System.out.println("THe path of the file : "+f.getAbsolutePath());
            } 
        }
    }
}
