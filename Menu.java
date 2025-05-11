package pwproj;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu extends JFrame{
	public static JTextArea editTextArea = new JTextArea("Type Here!");
    public static JTextArea uneditTextArea = new JTextArea();
public static void launchMenu() {
	   // Creating instance of JFrame
    JFrame frame = new JFrame();

    // Creating instance of JButton
    JButton button = new JButton("Launch Browser");
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       	 benchmark window = new benchmark();
       	window.launchBrowser();;
        }
    });
    JTextField textField1 = new JTextField();

 // Creating a text field with initial text
 JTextField textField2 = new JTextField("Initial Text");

 // Creating a text field with a specified number of columns
 JTextField textField3 = new JTextField(20);

 // Creating a text field with both initial text and columns
 JTextField textField4 = new JTextField("Initial Text", 20);
    // x axis, y axis, width, height
    button.setBounds(150, 200, 220, 50);

    // adding button in JFrame
    frame.add(button);

    // 400 width and 500 height
    frame.setSize(500, 600);

    // using no layout managers
    frame.setLayout(null);

    // making the frame visible
    frame.setVisible(true);
}
}
