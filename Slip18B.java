public class Slip18B {
    public void area(float r,float pi )
    {
        System.out.println("\n area of Circle: "+(pi*r*r));
    }
    public void area(float b,int h)
    {
        System.out.println("\n area of Triangle: "+((b*h)/2));
    }
    public void area(int l,int b)
    {
        System.out.println("\n area of Triangle: "+(l*b));
    }
    public static void main(String arg[])
    {
        Slip18B ob=new Slip18B();
        ob.area(2.0f, 3.14f);
        ob.area(2.0f, 3);
        ob.area(4, 5);
    }
}
