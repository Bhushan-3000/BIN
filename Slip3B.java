public class Slip3B {
    static boolean Armstrng(int n)
    {
        int len=0;
        int sum=0;
        int m=0;
        int temp=n;
        while (temp>0) 
        {
            temp/=10;
            len++;    
        }
        temp=n;
        while (temp>0) 
        {
            // m=temp%10;
            sum+=Math.pow((temp%10), len);
            temp/=10;
        }
        if (sum==n) 
        {
            return true;    
        }
        else return false;
    }
    public static void main(String[] args) {
        int n=1635;
        if (Armstrng(n)) 
        {
            System.out.println("The number is armstrong"); 
        }   
        else if (!Armstrng(n)) 
        {
            System.out.println("The number not an armstrong");    
        }
    }
}
