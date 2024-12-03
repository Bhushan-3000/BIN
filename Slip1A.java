import java.io.*;

public class Slip1A {
    public static void main(String[] arg)  throws Exception
    {   
        FileWriter fw=new FileWriter("yyy.txt");
        FileReader fr= new FileReader(arg[0]);// accept a file name from user via command line 
        int data=0;
        char ch;
        while(data!=-1)
        {
            data=fr.read();
            if(data==-1)
            {
                break;
            }
            else
            {
                ch=(char)data;
                if(ch>='0'&&ch<='9'){continue;}
                else
                {
                        fw.write(""+ch);
                }
            }
        }
        fw.flush();
        fw.close();
        fr.close();
    }
}

