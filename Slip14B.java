public class Slip14B 
{
    int m=1;
    int power_recur(int n,int p)
    {  
        if(p>0)
        {
            p--;
            m*=n;
            power_recur(n, p);
        }
        return m;
    }
    public static void main(String arg[]) 
    {
        Slip14B ob= new Slip14B();
        int n=Integer.parseInt(arg[0]);
        int m=Integer.parseInt(arg[1]);
        System.out.println("the "+m+"th power of "+n+" is: "+ob.power_recur(n,m));
    }
}