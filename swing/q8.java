import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q8 extends JFrame implements MouseListener {
	public q8() {
	setTitle("q8");
	addMouseListener(this);
	}
	
	private static void jfrm() {
		JFrame jf = new q8();
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(200, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	public void mouseClicked(MouseEvent e) {
		setSize(new Dimension(200, 200));
    }

    public void mouseEntered(MouseEvent e) {
		setSize(new Dimension(600, 600));
    }

    public void mouseExited(MouseEvent e) {
		setVisible(false);
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
	
	

public static void main(String args[]) {
	
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			jfrm();
			}
		}
	);
     }
}
