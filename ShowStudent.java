package Watai;
public class ShowStudent {
public static void main (String[]args) {
	
	Student student1 = new Student();
	student1.setcreds(4);
	student1.setID(1);
	student1.setpoints(4);
	double gradepoint = student1.getpoints();
	
	System.out.println("Student ID: " + student1.getID());
	System.out.println("Credits: " + student1.getcred());
	System.out.println("Points: " + student1.getpoints());
	System.out.println("GPA: " + gradepoint);
	System.out.println("Kwan was here! </3");
}
}
