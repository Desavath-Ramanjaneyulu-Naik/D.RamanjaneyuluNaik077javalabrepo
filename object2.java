class Student{
	int rollno;
	String name;
	void display(){
		System.out.println(name);
		System.out.println(rollno);
}
}
 class object2{
 public static void main(String[] args){
	 Student s1=new Student();
	 Student s2=new Student();
	 s1.name="Sanjana";
	 s1.rollno=011;
	 s2.name="Ramji";
	 s2.rollno=077;
	 s1.display();
	 s2.display();
            }
 }
	 