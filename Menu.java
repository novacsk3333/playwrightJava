package pwproj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Menu extends JFrame{
	private JFrame window;
	
	public void launchMenu() {
		 benchmark browser = new benchmark();
	    // Create the main frame
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a panel to hold components
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // Create components
        JLabel websiteName = new JLabel("Website:");
        JTextField websiteField = new JTextField(10);
        JLabel xpathLabel = new JLabel("Xpath:");
        JTextField xpathField = new JTextField(10);
        JButton greetButton = new JButton("Run Test");

        // Add components to the panel
        panel.add(websiteName);
        panel.add(websiteField);
        panel.add(xpathLabel);
        panel.add(xpathField);
        panel.add(greetButton);

        // Add action listener to the button
        greetButton.addActionListener(e -> {
            String website = websiteField.getText();
            String xpath = xpathField.getText();
             JOptionPane.showMessageDialog(frame, browser.launchBrowser(website, xpath),"The response time is in nanosecs", JOptionPane.INFORMATION_MESSAGE);
        });

        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
}
