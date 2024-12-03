import java.io.*;
public class Slip21B {
    public static void main(String arg[]) throws Exception
    {
        FileReader fr=new FileReader("yyy.txt");
        int data=0;
        StringBuffer sb= new StringBuffer();
        char ch;
    
        while (data!=-1) 
        {   
            data=fr.read();
            if (data==-1) 
            {
                break;    
            }
            else
            {
                ch=(char)data;
                if (ch==' ') 
                {
                    // sb.append(ch);
                    System.out.print(" "+sb.reverse());
                    sb.delete(0, sb.length());
                }
                else if (ch!=' ')
                {
                    sb.append(ch);
                }
            }
        }
        System.out.print(" "+sb.reverse());
        fr.close();
    }
}
 