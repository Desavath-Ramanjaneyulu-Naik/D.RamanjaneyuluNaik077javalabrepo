class A 
{
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;   
}

class B extends A 
{
    void display() 
	{
        System.out.println("a= "+a); 
        //System.out.println("b= "+b); 
        System.out.println("c= "+c); 
        System.out.println("d= "+d); 
       }
}

class C 
{
    void display() 
	{
        A obj = new A();
        
        System.out.println("a= "+obj.a); 
        //System.out.println("b= "+obj.b); 
        System.out.println("c= "+obj.c); 
        System.out.println("d= "+obj.d);  
    }
}

class D extends B 
{
    void display() 
	{
        System.out.println("a= "+a); 
        //System.out.println("b= "+b); 
        System.out.println("c= "+c); 
        System.out.println("d= "+d);   
    }
}

class E 
{
    void display() 
	{
        A obj = new A();

         System.out.println("a= "+obj.a); 
        //System.out.println("b= "+obj.b); 
        System.out.println("c= "+obj.c); 
        System.out.println("d= "+obj.d);   
    }
}

class Modifi 
{
    public static void main(String[] args) 
	{

        A a1 = new A();
        B a2 = new B();
        C a3 = new C();
        D a4 = new D();
        E a5 = new E();


        System.out.println("B:");
        a2.display();

        System.out.println("C:");
        a3.display();

        System.out.println("D:");
        a4.display();

        System.out.println("E:");
        a5.display();
    }
}