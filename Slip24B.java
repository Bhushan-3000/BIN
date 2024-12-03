import java.io.*;
public class Slip24B {
    public static void main(String[] args) throws Exception 
    {
        FileReader fr = new FileReader(args[0]);
        int d = 0, s = 0, c = 0, data = 0;
        char ch;
        while ((data = fr.read()) != -1) 
        {
            ch = (char) data;
            if (ch >= '0' && ch <= '9') 
            {
                d++;
            }
             else if ((ch >= 'a' && ch < 'z')||(ch >= 'A' && ch < 'Z')) 
            {
                c++;
            } 
            else if (ch == ' ') 
            {
                s++;
            }
        }
        System.out.println("The number of disgits"+d+"number of spaces"+s+"number of characters"+c);
        fr.close();
    }
}
