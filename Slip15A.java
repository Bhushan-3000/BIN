// import java.applet.*;
import java.awt.*;
public class Slip15A extends Frame
{
    Slip15A()
    {        
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        Color c=Color.RED;
        g.setColor(c);
        g.fillOval(100, 100, 250, 250);
        g.setColor(Color.BLACK);
        g.fillOval(170, 170, 30, 30);
        g.fillOval(250, 170, 30, 30);
        g.drawLine(225, 200, 225, 240);
        g.fillOval(55, 170, 50, 50);
        g.fillOval(345, 170, 50, 50);
        g.fillArc(190, 220, 70, 60, 180, 180);
    }
    public static void main(String[] args) {

        Slip15A ob=new Slip15A();
    }
}
