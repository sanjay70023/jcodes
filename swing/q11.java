import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class q11 extends JFrame {
	private JLabel lkey;
	
	public q11() {
		setTitle("Key Title");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lkey = new JLabel();
		add(lkey);	
		
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char ch = e.getKeyChar();
			lkey.setText("Typed Character is : " + ch);
			}
		});
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new q11();
			}
		});
	}
}

