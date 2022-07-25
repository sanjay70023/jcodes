import java.awt.*;
import java.awt.event.*;

public class ques10 extends Frame implements ActionListener{
    Button red, blue;

    public ques10() {
        // Use a flow layout.
        setLayout (new FlowLayout());

        // Create some buttons.
        red = new Button("RED");
        blue = new Button("BLUE");

        //Add them to the frame
        add(red);
        add(blue); 

        //Add action listener for the buttons.
        red.addActionListener(this);
        blue.addActionListener(this);
        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent we){
                System.exit (0) ;
            }
        });
    }
        // Handle button action events
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("RED")) {
            setBackground(Color.red);
        }
        if(str.equals("BLUE")) {
            setBackground(Color.blue);
        }
        repaint();
    }

    public static void main(String[] args) {
        ques10 bd = new ques10();
        bd.setSize(new Dimension (250 ,150));
		bd.setTitle("Button Demo") ;
		bd.setVisible(true) ;
        
    }
}
