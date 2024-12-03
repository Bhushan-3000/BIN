class NumberZeroException extends Exception
{   
    NumberZeroException()
    {
        System.out.println("number is zero");
    }
}
public class Slip6B 
{ 
    static int n;
    public static void main(String[] arg) 
    {
        n=Integer.parseInt(arg[0]);
        String s=arg[0];
        try {
            if(n==0)
            {
                throw new NumberZeroException();
            }
            else
            {
                System.out.print("number is: "+s);
                int f=Integer.parseInt(s.charAt(0)+"");
                int l=Integer.parseInt(s.charAt(s.length()-1)+"");

                System.out.println("sum of first and last digit of the given No. :"+(f+l));
            }
        } catch (Exception e) {
            System.out.print("Enter a non zero number");
        }
    }   
}