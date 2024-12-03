import java.util.*;
class InvalidAgeException extends Exception
{
    InvalidAgeException()
    {
        System.out.print("Invalid age");
    }
}
public class Slip29B {
    public static void main(String[] args) {
        try {
            int age=Integer.parseInt(args[0]);
            if(age<18)
            {
                throw new InvalidAgeException();
            }
            else {
                System.out.println("User is eligible to vote");
            }
        } catch (InvalidAgeException e) {
            System.out.println("User is not valid for voting");
        }
        catch(ArrayIndexOutOfBoundsException ee)
        {
            System.out.println(" age of the user NOT entered");
        }
        finally
        {
            System.out.println("function executed");
        }
    }
}
