package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	CSVReader CSV = new CSVReader();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		List<student> StudentArray = CSVReader.readStudentsFromCSV("students.csv");
		
		String[] header = {"ID", "Name", "Graduation Year", "Hours", "Email" };
		DefaultTableModel DTM = new DefaultTableModel(header, 0);
		JTable list = new JTable(DTM);
		JScrollPane scrollPane = new JScrollPane(list);
		for(student word : StudentArray)
		{
			
		    DTM.addRow(new Object[] { 
		    		student.getID(), student.getFullName(), student.getGradYear(), student.getHours(), student.getEmail()
		    });
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(scrollPane);
		
	}

}
