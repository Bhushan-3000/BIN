import java.util.*;
public class Slip25A 
{   
    public static void main(String arg[])
    {
        if (arg.length>0) 
        {   
            String s1=arg[0];
            StringBuffer sb= new StringBuffer(s1);
            sb=sb.reverse();
            String s2=new String(sb);            
            if (s1.equals(s2)) 
            {
                System.out.println("The given string is palindrome");    
            }
            else 
            {
                System.out.println("The String is not palindrome");
            }
        }
    }
}