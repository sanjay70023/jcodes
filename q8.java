import java.awt.*;
import java.awt.event.*;

public class prac8 extends Frame implements MouseListener {

	String msg = "Hello";
	int mouseX = 50, mouseY = 50; // coordinates of mouse


	public prac8() {	
		addMouseListener(this);  
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}

	// Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
	// save coordinates
		mouseX = 50;
		mouseY = 100;
		msg = "Mouse clicked.";
		setSize(new Dimension(300, 300));
		repaint();
	}

	// Handle mouse entered.
	public void mouseEntered(MouseEvent me) {
	// save coordinates
		mouseX = 50;
		mouseY = 100;
		msg = "Mouse entered.";
		setSize(new Dimension(900, 900));
		repaint();
	}
	
	// Handle mouse exited.
	public void mouseExited(MouseEvent me) {
	// save coordinates
		mouseX = 50;
		mouseY = 100;
		msg = "Mouse exited.";
		setVisible(false);
		repaint(); 
		
	}

	public void mousePressed(MouseEvent me) {
	}
	
	public void mouseReleased(MouseEvent me) {
	} 


	// Display msg at current X,Y location.
	public void paint(Graphics g) {
		
		g.setColor(Color.black); //Used to set the font color
		g.drawString(msg, mouseX, mouseY); //Used to display a msg at coordinates mouseX and mouseY

	}

	public static void main(String[] args)
	{
		prac8 obj = new prac8();

		obj.setSize(new Dimension(300, 300));
		obj.setTitle("Mouse Events Demo"); 
		obj.setVisible(true);
		
	}
}