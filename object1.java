class Student{
	int age;
	String name;
	void display(){
		System.out.println(name);
		System.out.println(age);
}
}
 class object2{
 public static void main(String[] args){
	 Student s1=new Student();
	 Student s2=new Student();
	 s1.name="Sanjana";
	 s1.age=19;
	 s2.name="Ramji";
	 s2.age=20;
	 s1.display();
	 s2.display();
            }
 }
	 