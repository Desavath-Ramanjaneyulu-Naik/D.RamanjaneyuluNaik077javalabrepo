class Student
    {
	  int rollNo;
	  float marks;
	  String name;
	}
 class Object
    {
	  public static void main(String[] args)
	  {
 	  Student s1 = new Student();
	  s1.name="Ram";
	  s1.rollNo=77;
	  s1.marks=8.95f;
		System.out.println("Name:" + s1.name);
		System.out.println("RollNo:" + s1.rollNo);
		System.out.println("Marks:" + s1.marks);
	  }
	}
