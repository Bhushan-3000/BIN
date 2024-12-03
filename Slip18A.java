import java.io.*;

public class Slip18A {
    public static void main(String[] arg)  throws Exception
    {   
        FileWriter fw=new FileWriter("yyy.txt");
        FileReader fr= new FileReader(arg[0]);
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
                if (ch>='A'&&ch<='Z') 
                {
                    data+=32;
                    fw.write(""+(char)data);
                }
                else if (ch>='a'&&ch<='z') 
                {
                    data-=32;
                    fw.write(""+(char)data);
                }
                else if(ch>='0'&&ch<='9')
                {
                    ch='*';
                    fw.write(""+ch);
                }
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
