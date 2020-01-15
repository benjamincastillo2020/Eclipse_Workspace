package csv;


import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;


@SuppressWarnings("resource")
public class parser {
	public int ID;
	public String FName;
	public String LName;
	public int GradYear;
	public int Hours;
	public String Email;

	public void ParseLine() throws Exception {

		
		
		Scanner parse = new Scanner(new File("students.csv")).useDelimiter(",");
		ID = Integer.parseInt(parse.next());
		FName = parse.next();
		LName = parse.next();	
		GradYear = Integer.parseInt(parse.next());	
		Hours = Integer.parseInt(parse.next());	
		Email = parse.next();	
		parse.close();
		
		
		student ArrayStud = new student(ID, FName, LName, GradYear, Hours, Email);
		
		System.out.println(ArrayStud.getEmail());
		

	}
		
}

