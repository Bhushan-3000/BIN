import java.util.*;
public class Slip11B {
    public static void main(String arg[]) 
    {
        if (arg.length <= 0) {
            System.out.println("NO INPUT PROVIDED");
        } 
        else 
        {
            int a = Integer.parseInt(arg[0]);
            int b = Integer.parseInt(arg[1]);
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
            System.out.print("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            float r = 0.0f;
            switch (ch) {
                case 1:
                    r = a + b;
                    break;
                case 2:
                    r = a - b;
                    break;
                case 3:
                    r = a * b;
                    break;
                case 4:
                    r = a / b;
                    break;
            }
            System.out.print("Result of selected operation is: " + r);
        }
    }
}
