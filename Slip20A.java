import java.util.*;
public class Slip20A 
{
    public static void main(String[] args) 
    {
        LinkedList lst= new LinkedList();
        lst.add("CPP");
        lst.add("JAVA");
        lst.add("PYTHON");
        lst.add("PHP");

        System.out.print("Orginal list is: ");
        Iterator it=lst.iterator();
        while (it.hasNext()) 
        {
            System.out.print(it.next()+" ");    
        }
        ListIterator lit= lst.listIterator();
        System.out.print("\nthe list is reverse is: ");
        while (lit.hasNext()) 
        {
            lit.next();    
        }
        while (lit.hasPrevious()) 
        {
            System.out.print(lit.previous()+" ");    
        }
    }
}
