import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10 extends JFrame {
	public q10() {
	JFrame jfrm = new JFrame("Button Demo");
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.setSize(200, 100);


	JButton jbtnr = new JButton("Red");
	JButton jbtnb = new JButton("Blue");
	jfrm.add(jbtnr);
	jfrm.add(jbtnb);
	
	jbtnr.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.getContentPane().setBackground(Color.red);
		}
	});		
	
	jbtnb.addActionListener( new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.getContentPane().setBackground(Color.blue);
		}
	});		

	jfrm.setVisible(true);
	
	}

	public static void main (String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new q10();
			}
		});
    }
}
