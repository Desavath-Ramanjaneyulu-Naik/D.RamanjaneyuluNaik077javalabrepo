 class A
 {
	int i;
	int j;
	int k;
	
	A(int i)
	{
	this.i=i;
	}
	
	A(int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	
	A(int i,int j,int k)
	{
	this.i=i;
	this.j=j;
	this.k=k;
	}
	
	void main()
	{
		System.out.println(i+j+k);
	}
 
	class Const
	{
	public static void main(String[] args)
	{
		A a1 = new A(10);
		A a2 = new A(20,30);
		A a3 = new A(40,50,60);
		a1.main();
		a2.main();
		a3.main();
	}
	}
 }
	
 