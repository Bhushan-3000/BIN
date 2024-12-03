import java.io.*;
public class Slip5A 
{
    public static void main(String arg[]) throws Exception   
    {
        File ob;
        if (arg.length>=0) 
        {
            String fnms[]=new String[arg.length];
            for(int i=0;i<arg.length;i++)
            {
                fnms[i]=arg[i];
                System.out.println("the file name given is: "+fnms[i]);
            }
            for(int i=0;i<fnms.length;i++)
            {
                ob=new File(fnms[i]);
                if (fnms[i].endsWith(".txt")) 
                {
                    // System.out.println("Deleted file is "+ob.getName());    
                    ob.delete();
                }
                else
                {
                    System.out.println("location and size of the remaining files are :"+ob.getName()+"\t"+ob.getAbsolutePath()+"\t"+ob.length());
                }
            }
        }
        else
        {
            System.out.print("NO files given");    
        }
    }
}
