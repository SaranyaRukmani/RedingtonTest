package redington.week2.project;

public class Student {
      int reg_no;
      String name,dept,clg_name;
	public Student(String name, int reg_no, String dept, String clg_name) {
		
		this.name=name;
		this.reg_no=reg_no;
		this.dept=dept;
		this.clg_name=clg_name;

		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student student1=new Student("Raya",38,"CSE","SBM CET");
          Student student2=new Student("Saranya",45,"IT-CS","SSM CET");
          System.out.println("Student Details");
          student1.display();
          student2.display();
	}
	void display()
	{
	    System.out.println("===========================");
		System.out.println("Student Name "+name);
		System.out.println("Register Number "+reg_no);
		System.out.println("Department "+dept);
		System.out.println("College Name "+clg_name);
	}

}
