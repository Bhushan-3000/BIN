public class Slip9B {
    void fibno(int n)
    {
        int s1=0;
        int s2=1;
        System.out.print("The sequence of fibonacci till "+n+"th element :"+s1+" "+s2);

        while (n>2) 
        {
            int s3=s1+s2;
            System.out.print(" "+s3);
            n--;
            s1=s2;
            s2=s3;
        }
    }
    public static void main(String[] args) 
    {
        Slip9B ob=new Slip9B();

        ob.fibno(5);    
    }
}
