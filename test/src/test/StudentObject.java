package test;

import java.io.Serializable;
import java.util.Arrays;



@SuppressWarnings("serial")
public class StudentObject implements Serializable{
	private String fname;
	private String lname;
	private String school;
	private int id;
	private int grade;
	private int hours;

	
    
public StudentObject() {
	
}


	
	public String getFname() {
        return fname;
    }
    
    public void setFname(String name) {
        this.fname = name;
    }
    
    public String getLname() {
        return lname;
    }
    
    public void setLname(String name) {
        this.lname = name;
    }
    
    public int getId() {
        return id;
    }
    public String getSchool() {
    	return school;
    }
    
    public void setSchool(String school) {
    	this.school = school;
    }
    public void setId(String get) {
    	int Int = Integer.parseInt(get);
    	this.id = Int;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(String get) {
    	int Int = Integer.parseInt(get);
    	this.grade = Int;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setHours(String get) {
    	int Int = Integer.parseInt(get);
    	this.hours = Int;
    }
    
    public String[] getInfo() {
		String ID = String.valueOf(id);
		String GRADE = String.valueOf(grade);
		String HOURS = String.valueOf(hours);
    	String[] info = {ID, GRADE, fname, lname, school, HOURS};
    	return info;
		
    	
    }

    
  
    
	
}
