// import java.sql.Array;

public class Slip17B {
    boolean armstrong(int n,int len)
    {
        int temp=n;// to check at the end if the result and temp are equal
        int sum=0;// stores the result
        while (n>0) 
        {
            int m=n%10;
            n=n/10;
            sum+=Math.pow(m, len);
        }
        if (sum==temp) 
        {
            return true;  
        }
        return false;
    }
    public static void main(String arg[]) 
    {
        Slip17B ob= new Slip17B();
        int length=arg.length;
        int [] arr = new int[length];
        for (int i = 0; i < arg.length; i++) 
        {
            int temp;
            temp=Integer.parseInt(arg[i]);

            if (ob.armstrong(temp, arg[i].length())==true) 
            {
                arr[i]=temp;
                // System.out.println("The array of armstrong number is: "+arr[i]);                
            }
        }
        System.out.println("The array of armstrong number is:");
        for(int i=0;i<length;i++)
        {
            if (arr[i]!=0) 
            {
                System.out.print(" "+arr[i]);
            }
        }        
    }
}
