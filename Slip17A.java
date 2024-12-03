import java.util.*;
class Product
{
    private int pid;
    private String pname;
    private int price;
    private int qty;
    public void accept()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the product id");
        pid=sc.nextInt();
        System.out.print("Enter the product name");
        sc=new Scanner(System.in);
        pname=sc.nextLine();
        System.out.print("Enter the product price");
        price=sc.nextInt();
        System.out.print("Enter the product quantity");
        qty=sc.nextInt();
    }
    public void display()
    {
        System.out.println("Product Id : "+pid);
        System.out.println("Product Name : "+pname);
        System.out.println("Product Price : "+price);
        System.out.println("Product Quantity : "+qty);
    }
    public void calculate()
    {
        System.out.println("The total Amount is: "+price*qty+"\n");
    }
}
public class Slip17A 
{
    public static void main(String[] args) 
    {
        
        Product p[]=new Product[10];
        System.out.println("Enter the amount of products");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            p[i]=new Product();
            p[i].accept();
        }
        for(int i=0;i<2;i++)
        {
            p[i].display();
            p[i].calculate();
        }
    }
}
