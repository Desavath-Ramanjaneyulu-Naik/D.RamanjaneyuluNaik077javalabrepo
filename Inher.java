class A
 {
	int i=10;
	int j=20;
	
	void main()
	{
	System.out.println(i+j);
	}
 }
 class B extends A
 {
	void main1()
	{
	System.out.println(i+j);
	}
 }
 class Inher
 {
  public static void main(String[] args)
	{
		A a = new B();
		System.out.println(a.i);
		System.out.println(a.j);
		a.main();
		
	}
  }