public class Slip2B 
{    public static void main(String arg[])
    {
        String s=arg[0];
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
            {
                System.out.print(" "+ch+" ");    
            }
        }
    }
}
