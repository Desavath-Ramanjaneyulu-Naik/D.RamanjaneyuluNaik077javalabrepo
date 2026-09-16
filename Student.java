class A
    {
      String name,section,branch;
	  int rollNo;
	  double marks;
	  void display()
	     { 
		   System.out.println("Name :" + name + "Section :" + section + "Branch :" + branch + "Roll :" + rollNo + "Marks :" + marks);
		  }
	}
 class Student
    {
	  public static void main(String[] args)
	  {
 	  A s = new Student();
	  s.name="Ram";
	  s.section="CSM";
	  s.branch="B";
	  s.rollNo=77;
	  s.marks=8.95;
	  s.display();
	  }
	}
