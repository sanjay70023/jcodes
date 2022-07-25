import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q9 extends JFrame {
	public q9() {

	JFrame jfrm = new JFrame("String Demo");
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.setSize(200, 100);

	JLabel jlab = new JLabel("String");
	jfrm.add(jlab);

	jfrm.setVisible(true);
	jfrm.getContentPane().setBackground(Color.pink);
}

public static void main (String args[]) {
	
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new q9();
		}
	});
    }
}
