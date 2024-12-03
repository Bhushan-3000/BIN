class NumberGt1000Exception extends Exception
{
    NumberGt1000Exception()
    {
        System.out.println("no is greater than 1000");
    }
}
public class Slip27A {
    static int n;
    public static void main(String[] args) {
        n=Integer.parseInt(args[0]);
        try {
            if (n>=1000) 
            {
                throw new NumberGt1000Exception();    
            }
            else
            {
                System.out.println("factors of numbers \n");
                for (int i = 1; i < n; i++) {
                    if(n%i==0)
                    {
                        System.out.print(" "+i);
                    }
                }
            }
        } 
        catch (NumberGt1000Exception e) {
         System.out.println("Exception caught");  
        }
    }
}
