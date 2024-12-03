import java.awt.*;
import java.awt.event.*;
public class Slip20B extends Frame implements WindowListener
{    Slip20B()
    {
        Color c=Color.RED;
        setBackground(c);
        setVisible(true);
    
        setSize(400,400);
        setLayout(new FlowLayout());
        addWindowListener(this);
        setTitle("TY-BBA-CA");
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public static void main(String[] args) 
    {
        Slip20B ob=new Slip20B();    
    }
}
