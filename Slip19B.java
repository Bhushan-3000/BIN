public class Slip19B 
{
    void fibno(int n)
    {
        int s1=0;
        int s2=1;
        int s3=0;
        while (n>0) 
        {    
            s3=s1+s2;
            System.out.print(s1+" ");
            s1=s2;
            s2=s3; 
            n--;
        }
    }
    public static void main(String[] args) 
    {
        Slip19B ob =new Slip19B();
        System.out.println("The fibonacci series till given number is: ");
        ob.fibno(7);
    }
}
