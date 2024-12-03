import java.util.*;
public class Slip15B
{
    public static void main(String arg[])
    {
        if(arg.length>0)
        {
            Scanner sc= new Scanner(System.in);
            String s[]=new String[arg.length];
            for(int i=0;i<arg.length;i++)
            {
                s[i]=arg[i];
            }
            System.out.println("Enter the Name to be searched in the Array");
            String temp=sc.nextLine();
            for (int i = 0; i < s.length; i++) 
            {
                if (s[i].compareTo(temp)==0) 
                {
                    System.out.println("The name is at the location "+(i+1)+"th position");
                    break; 
                }
                else if (s[i].compareTo(temp)!=0 && i==s.length-1) 
                {
                    System.out.println("The name does not exist in the array");    
                }    
            }
        }
        else
        {
            System.out.println("no input strings provided");
        }
    }
}