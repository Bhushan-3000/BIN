import java.io.*;
 class Slip8A {
    public static void main(String arg[]) throws Exception 
    {
        File f=new File(arg[0]);
        if (f.exists()) 
        {
            if (f.isDirectory()) 
            {
                String fnms[]=f.list();
                System.out.print("Files in the directory:");    
                for(int i=0;i<fnms.length;i++)
                {
                    if (fnms[i].endsWith(".txt")) 
                    {
                        System.out.print("\n"+fnms[i]);    
                    }
                }
            }
            else{System.out.print("Not a Directory");}    
        }
        else{System.out.print("File not found");}
    }
}
