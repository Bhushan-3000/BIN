abstract class Shape
{
    final float pi=3.14f;
    abstract void area();
    abstract void volume();
}
class Cone extends Shape
{
    float radius ,height;
    public Cone(float r,float h)
    {
        radius=r;
        height=h;
    }

    void volume() 
    {
        System.out.println("Volume of Cone: "+((super.pi*radius*radius*height)/3));

    }
    void area()
    {
        double l1=(radius*radius)+(height*height);
        l1=Math.sqrt(l1);
        float l=((float)l1);
        System.out.println("Curved Surface Area of Cone: "+(super.pi*radius*l));
        System.out.println("Total Surface Area of Cone: "+(super.pi*radius*(radius+l)));
    }
}
class Cylinder extends Shape
{  
    float radius,height;
    public Cylinder(float r,float h)
    {
        radius=r;
        height=h;
    }
    void area()
    {
        System.out.println("Area of Cylinder: "+(2*super.pi*radius*height+2*super.pi*radius*radius));
    }
    void volume()
    {
        System.out.println("Volume of Cylinder: "+super.pi*radius*radius*height);

    }
}

public class Slip3A 
{
    public static void main(String[] args) 
    {
        Cone c1=new Cone(2, 3);
        c1.volume();
        c1.area();
        Cylinder c2=new Cylinder(2, 3);
        c2.volume();
        c2.area();
    }
}
