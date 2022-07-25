import java.awt.*;
import java.awt.event.*;

public class prac9 extends Frame {

	
	Label lbl = new Label("this is my string");

	public prac9() {
		Frame obj = new Frame("Demo");
		obj.setSize(new Dimension(300, 300));
		obj.setTitle("Keyboard Events Demo");
		obj.setVisible(true); 
		obj.setBackground(Color.pink);
		obj.add(lbl);
        obj.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
	

	public static void main(String[] args)
	{
		new prac9();		
	}
}
