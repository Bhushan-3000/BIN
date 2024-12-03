import java.awt.*;
import java.awt.event.*;

public class Slip19A extends Frame implements MouseListener,MouseMotionListener{
    TextField t1;
    Slip19A()
    {
        t1= new TextField(20);
        Font fnt= new Font("Arial",Font.BOLD,20);
        setFont(fnt);
        add(t1);
        addMouseListener(this);
        addMouseMotionListener(this);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        t1.setText(e.getX()+","+e.getY());
    }
    public void mouseMoved(MouseEvent e)
    {
        t1.setText(e.getX()+","+e.getY());
    }
    public void mouseExited(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    
    public static void main(String[] args) {
        new Slip19A();
    }
}
