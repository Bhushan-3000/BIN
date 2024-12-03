import java.awt.*;
public class Slip7B extends Frame
{
    Label l;
    Slip7B()
    {
        l=new Label("Dr. D.Y Patil College");
        Font fnt =new Font("Arial",Font.BOLD,20);
        add(l);
        l.setFont(fnt);
        Color c= Color.red;
        setBackground(c);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) 
    {
        Slip7B ob=new Slip7B();
    }

}
