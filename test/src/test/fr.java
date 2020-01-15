package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class fr extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.

	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fr frame = new fr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fr() {
		JFrame f=new JFrame("Button Example");  
	    JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30);  
	    f.add(b);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	}

}
