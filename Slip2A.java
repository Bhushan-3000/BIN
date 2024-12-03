//this has to be done in with java swings
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Slip2A extends JFrame implements MouseListener,MouseMotionListener
{
    JTextField t1;
    Slip2A()
    {
        t1=new JTextField(20);
        Font fnt =new Font("Arial",Font.BOLD,30);
        setFont(fnt);
        add(t1);
        addMouseListener(this);
        addMouseMotionListener(this);
        
        setLayout(new FlowLayout());
        setSize(450,300);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        t1.setText("x = "+e.getX()+" y = "+e.getY());
    }
    public void mouseMoved(MouseEvent e)
    {
        t1.setText("x = "+e.getX()+" y = "+e.getY());
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
    public static void main(String arg[])
    {
        Slip2A ob= new Slip2A();
    }
}
