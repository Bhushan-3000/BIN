public class Slip16B {
    int sum=0;
    int sum_ofn(int n)
    {
        if (n>0) {

            sum+=n%10;
            n=n/10;
            sum_ofn(n);
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Slip16B ob=new Slip16B();
        System.out.println("The sum of given number is : "+ob.sum_ofn(64));
    }
}
