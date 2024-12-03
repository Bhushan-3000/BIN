import java.awt.*;
import java.awt.event.*;
public class Slip14A  extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b;
    Frame f;
    TextArea ta;
    Slip14A()
    {
        l1= new Label("Enter Employee number:");
        l2= new Label("Enter Employee name:");
        l3= new Label("Enter Employee salary");
        t1= new TextField(20);
        t2= new TextField(20);
        t3= new TextField(20);
        b= new Button("Click to show Employee details ");
        f= new Frame();
        ta=new TextArea(10,20);
        b.addActionListener(this);

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b);
        f.add(ta);

        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        Font fnt= new Font("Arial",Font.BOLD,20);
        setFont(fnt);
        f.setFont(fnt);
    }
    public void actionPerformed(ActionEvent e)
    {
        String res;
        res="Employee Number: "+t1.getText()+"\nEmployee Name: "+t2.getText()+"\nEmployee Salary: "+t3.getText();
        ta.setText(res);
        f.setVisible(true);
    }
    public static void main(String arg[])
    {
        Slip14A ob = new Slip14A();
    }
}
