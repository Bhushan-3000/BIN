import java.util.*;
public class Slip28A {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<Object>();
        int count = 0;
        for(int i=0;i<args.length;i++)
        {
            try {
                myList.add(Integer.parseInt(args[i]));
            } catch (NumberFormatException e) {
                myList.add(args[i]);
            }
        }
        
        System.out.println("Displaying the list");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        for (int i = 0; i < myList.size(); i++) {

            if (myList.get(i) instanceof Integer) {
                count++;
            }
            System.out.println(myList.get(i));
        }

        // Print the number of integers
        System.out.println("\nNumber of integers in the list: " + count);
    
    }
}
