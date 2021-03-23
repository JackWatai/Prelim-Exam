package Watai;
public class Student {

	private int studentID;
	private int creds;
	private int points;
	private double gpa;
	
public void setID(int ID)
{
	ID = studentID;
}
public int getID()
{
	return studentID;
}
public void setcreds(int cred)
{
	cred = creds;
}
public int getcred()
{
	return creds;
}
public void setpoints(int point)
{
	point = points;
}
public int getpoints() 
{
	return points;
}
public double calcGPA(double gradepoint)
{
	gradepoint = points/creds;
	return gradepoint;
}

public void printMessage()
{
	System.out.println("Student ID: " + studentID);
	System.out.println("Credits: " + creds);
	System.out.println("Points: " + points);
	System.out.println("GPA: " + gpa);
}


}
