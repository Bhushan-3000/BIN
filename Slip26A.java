import java.io.FileInputStream;

public class Slip26A {
    public static void main(String[] arg)throws Exception
    {
        String fnms=arg[0];    
        FileInputStream fin=new FileInputStream(fnms);
        int data=0;
        while ((data=fin.read())!=-1) 
        {
            System.out.print(data+" ");    
        }
        fin.close();
    }
}
