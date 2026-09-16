class A
 {
	int i=10;
	int j=20;
	
 }
 class B extends A
 {
	int i=30;
	int j=40;
	
	void main()
	{
	System.out.println(super.i);
	System.out.println(super.j);
	System.out.println(this.i);
	System.out.println(this.j);
	System.out.println(i);
	System.out.println(j);
	}
 }	
	class key
	{
		public static void main(String[] args)
		{
		B b = new B();
		b.main(50,60);
		}
	}
	