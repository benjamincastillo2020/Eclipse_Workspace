package test;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.helpers.DefaultHandler;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class XmlPaserClass extends JFrame {
	
	
	private JPanel contentPane;
	private JPanel buttonPane;
	public StudentObject st = new StudentObject();
	public String ID;
	public String GRADE;
	public String HOURS;
	public String FNAME;
	public String LNAME;
	public String SCHOOL;
	
	
	
	public XmlPaserClass(){
		String[] header = {"ID", "Grade", "First Name", "Last Name", "School", "Hours" };
		DefaultTableModel DTM = new DefaultTableModel(header, 0);
		
		JTable list = new JTable(DTM);
		JButton button = new JButton("Update List");
		
		
		JScrollPane scrollPane = new JScrollPane(list);
		
		try
		{
			SAXParserFactory fact = SAXParserFactory.newInstance();
			SAXParser saxParser = fact.newSAXParser();
			
			DefaultHandler handle = new DefaultHandler() {
				boolean bID = false;
				boolean bgrade = false;
				boolean bfname = false;
				boolean blname = false;
				boolean bschool = false;
				boolean bhours = false;
				
				
				public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
					
					if(qName.equals("id")) {
						bID = true;
					}
					if(qName.equals("grade")) {
						bgrade = true;
					}
					if(qName.equals("firstname")) {
						bfname = true;
					}
					if(qName.equals("lastname")) {
						blname = true;
					}
					if(qName.equals("school")) {
						bschool = true;
					}
					if(qName.equals("hours")) {
						bhours = true;
					}
					
				}
				
				public void endElement(String uri, String localName, String qName) {
					
				}
				
				public void characters(char[] ch, int start, int length )throws SAXException{
					//ID will always be first
					
					int temp = 1;
					if(bID) {
				
						ID = new String(ch, start, length);
						bID = false;
						
					}
					if(bgrade) {
						
						GRADE = new String(ch, start, length);
						bgrade = false;
					}
					if(bfname) {
					
						FNAME = new String(ch, start, length);
						bfname = false;
					}
					if(blname) {
						
						LNAME = new String(ch, start, length);
						blname = false;
					}
					if(bschool) {
						
						SCHOOL = new String(ch, start, length);
						bschool = false;
					}
					
					if(bhours) {
						
						HOURS = new String(ch, start, length);
						bhours = false;
						
						Object[] info = {ID, GRADE, FNAME, LNAME, SCHOOL, HOURS};
						DTM.addRow(info);
							
						
					}
					
					
					
					
					
				}
			};
			saxParser.parse("students.xml", handle);
			
			}
		
		catch(Exception ex ) {
			
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 360, 20));
		contentPane.setLayout(new BorderLayout(20, 20));
		setContentPane(contentPane);
		contentPane.add(scrollPane);
		
		
		

		
	}

	public static void main(String[] args)   {
	
		
			
		
		
		
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						XmlPaserClass frame = new XmlPaserClass();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
			
	
		
		
		
	}
	
	private void editData() {
		
	}
}
