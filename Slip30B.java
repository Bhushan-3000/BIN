class NumberIsZeroException extends Exception{
    NumberIsZeroException()
    {
        System.out.println("no entered is zero");
    }
}

public class Slip30B 
{
    public static void main(String[] args) {
        try {
            int n=Integer.parseInt(args[0]);          
            String s=args[0];
            StringBuffer sb=new StringBuffer(s);
            if (n==0) 
            {
                throw new NumberIsZeroException();    
            }
            else 
            {
                System.out.println("Original number is :"+s);
                sb=sb.reverse();
                String s1=new String(sb);
                if (s.equals(s1)) 
                {
                    System.out.println("number is palindrome ");    
                }
                else
                {
                    System.out.println("number is not palindrome");
                }
            }
        } catch (NumberIsZeroException e) {
            
        }
        catch(NumberFormatException ee)
        {
            System.out.println(ee+"cannot be converted to String");
        }
    }    
}
