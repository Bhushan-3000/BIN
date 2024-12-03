public class Slip22B {
    int sum=1;
    int  fact(int n)
    {
        if (n>0) 
        {
            sum*=n;
            n--;
            fact(n);    
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Slip22B ob=new Slip22B();
        System.out.print("The factorial of the given number is :"+ob.fact(5));    
    }
}
