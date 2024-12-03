import java.util.*;
class Name1
{
    private String s;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the employee :");
        s=sc.nextLine();
        // sc.close();
    }
    public void display()
    {
        System.out.println("\n The Name of the employee :"+s);
    }
    public void sort(Name1 arr[],int n)
    {
        String temp;
        System.out.println("The array before sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].s);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                if (arr[i].s.compareTo(arr[j+1].s)>0) 
                {
                    temp=arr[i].s;
                    arr[i].s=arr[j+1].s;
                    arr[j+1].s=temp;
                }
            }
        }
        System.out.println("The array after sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].s);
        }
    }
}
public class Slip16A 
{
    public static void main(String arg[])
    {
        Name1 n[]=new Name1[10];
        Name1 n1=new Name1();

        Scanner sc= new Scanner(System.in);
        int no;
        System.out.println("How many names : ");
        no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
            n[i]= new Name1();
            n[i].accept();
        }
        for(int i=0;i<no;i++)
        {
            n[i].display();;
        }
        n1.sort(n, no);
        // n.sort(n,no);
    }
}
