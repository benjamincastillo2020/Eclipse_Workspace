package communityService;

class student {
    private int ID;
    private String Fname;
    private String Lname;
    private int Grade;
    private int Hours;
    private String Email;
    

    public student(int ID, String Fname, String Lname, int Grade, int Hours, String Email) {
        this.ID = ID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Grade = Grade;
        this.Hours = Hours;
        this.Email = Email;
    }

    public void setID(int ID) {
    	this.ID = ID;
    }
    
    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    
    public void setLname(String Lname) {
        this.Lname = Lname;
    }
    
    public void setGrade(int Grade) {
    	this.Grade = Grade;
    }
    
    public void setHours(int Hours) {
    	this.Hours = Hours;
    }
    
    public void setEmail (String Email) {
    	this.Email = Email;
    }
    
    public String getFullName() {
        return Fname + " " +  Lname;
    }

    public String getFname() {
        return Fname;
    }
    
    public String getLname() {
    	return Lname;
    }
    
    public String getEmail() {
    	return Email;
    }
    
    public int getID() {
    	return ID;
    }
    
    public int getGrade() {
    	return Grade;
    }
    
    public int getHours() {
    	return Hours;
    }

    

    @Override
    public String toString() {
        return ID + Fname + Lname + Grade + Hours + Email;
    }

}