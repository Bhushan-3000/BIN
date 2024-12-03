import Series.*;

public class Slip24A {
    public static void main(String[] args) {
        Series.Cube ob1 = new Cube();
        System.out.println("cube is " + ob1.numcube(4));

        Square ob2 = new Square();
        System.out.println("Square is " + ob2.numeSqr(4));
        
        Series.Fibonacci obj3 = new Fibonacci();
        int n = 5;
        System.out.println("The sequence of fibonacci till " + n + "th element :" + obj3.fibnonum(n));
    }
}
