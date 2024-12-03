import java.util.*;
public class Slip13B 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of numbers");
        int n=sc.nextInt();
        ArrayList <Integer> al=new ArrayList<Integer>();
        int temp;
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter number in the Array list");
            temp=sc.nextInt();
            al.add(temp);        
        }
        // al.reversed();
        System.out.println("The Elements in the Array List are: "+al.reversed());    
    }
}