import java.awt.*;
import java.awt.event.*;

class ques12 extends Frame implements ActionListener{
	String msg = "Click buttons to get Info : ";
	int X = 50, Y = 50;
    private Button a, b;

    public ques12() {
		setLayout(new FlowLayout());
		
		a = new Button("A");
		b = new Button("B");
		
		add(a);
		add(b);

		a.addActionListener(this);
		b.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
		});
    }
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("A")){
			X = 50;
			Y = 100;
			msg = "Sanjay Singh, BSc. (Hons) Computer Science, 214004, SGGSCC College";
			repaint();
		}
		if(str.equals("B")){
			X = 50;
			Y = 100;
			msg = "Your CGPA: 4.4";
			repaint();
		}
		repaint();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.black); //Used to set the font color
		g.drawString(msg, X, Y);
	}
	
	public static void main(String[] args) {
        ques12 bd = new ques12();
		bd.setSize(500, 350);
		bd.setTitle("Student Details");
		bd.setVisible(true);
    }
}