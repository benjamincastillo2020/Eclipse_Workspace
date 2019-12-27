package test;

class student {
    private static int ID;
    private static String Fname;
    private static String Lname;
    private static int GradYear;
    private static int Hours;
    private static String Email;
    

    public student(int ID, String Fname, String Lname, int GradYear, int Hours, String Email) {
        student.ID = ID;
        student.Fname = Fname;
        student.Lname = Lname;
        student.GradYear = GradYear;
        student.Hours = Hours;
        student.Email = Email;
    }

    

	public void setID(int ID) {
		student.ID = ID;
    }
    
    public void setFname(String Fname) {
    	student.Fname = Fname;
    }
    
    public void setLname(String Lname) {
    	student.Lname = Lname;
    }
    
    public void setGradYear(int Grade) {
    	student.GradYear = Grade;
    }
    
    public void setHours(int Hours) {
    	student.Hours = Hours;
    }
    
    public void setEmail (String Email) {
    	student.Email = Email;
    }
    
    public static String getFullName() {
        return Fname + " " +  Lname;
    }

    public static String getFname() {
        return Fname;
    }
    
    public static String getLname() {
    	return Lname;
    }
    
    public static String getEmail() {
    	return Email;
    }
    
    public static  int getID() {
    	return ID;
    }
    
    public static int getGradYear() {
    	return GradYear;
    }
    
    public static int getHours() {
    	return Hours;
    }

    

    @Override
    public String toString() {
        return ID + Fname + Lname + GradYear + Hours + Email;
    }

}