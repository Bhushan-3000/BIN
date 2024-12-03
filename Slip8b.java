interface Shape
{
    final float pi=3.14f;
    public abstract void area();    
}
class Circle implements Shape
{
    float r;
    public Circle(float r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("The area of the circle : "+pi*r*r);
    }
}
class Sphere implements Shape
{
    float r;
    public Sphere(float r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("The area of the Sphere: "+4*pi*r*r);
    }
}

public class Slip8b
{
    public static void main(String arg[])
    {
        Circle c1=new Circle(3);
        c1.area();
        Sphere s1=new Sphere(3);
        s1.area();
    }
}







