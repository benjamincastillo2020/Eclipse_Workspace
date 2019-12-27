package test;

import java.util.Scanner;

public class parser {
		public String ID;
		public String FName;
		public String LName;
		public String GradYear;
		public String Hours;
		public String Email;
	
		public void ParseLine(String L) {
		
			@SuppressWarnings("resource")
			Scanner parse = new Scanner(L).useDelimiter(",");
			ID = parse.next();
			FName = parse.next();
			LName = parse.next();	
			GradYear = parse.next();	
			Hours = parse.next();	
			Email = parse.next();	
			parse.close();
		
		}
}
