import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q12 extends JFrame {
	public q12() {

	JFrame jfrm = new JFrame("Button Demo");
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.setSize(200, 100);

	JButton jbtnr = new JButton("My Info");
	JButton jbtnb = new JButton("CGPA");
	jfrm.add(jbtnr);
	jfrm.add(jbtnb);
	
	final JLabel textBox1 = new JLabel("Sanjay, B.Sc, 214004, SGGSCC");
	final JLabel textBox2 = new JLabel("4.00");
	
	jbtnr.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.add(textBox1);
			jfrm.remove(textBox2);
		}
	});
	
	jbtnb.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.remove(textBox1);
			jfrm.add(textBox2);
		}
	});		

	jfrm.setVisible(true);
	}

	public static void main (String args[]) {
	
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new q12();
		}
	});
    }
}