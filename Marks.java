 import java.util.*;
class Marks
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks for each subject per 100");
	System.out.print("\nMATHS:");
	int m=sc.nextInt();
	System.out.print("\nPHYSICS:");
	int p=sc.nextInt();
	System.out.print("\nCHEMISTRY:");
	System.out.print("\nENGLISH:");
	
	int e=sc.nextInt();
	System.out.print("\nBIOLOGY:");
	int b=sc.nextInt();
	int total=m+p+c+e+b;
	int average=total/5;
	System.out.println("TOTAL MARKS:"+total);
	System.out.println("AVERAGE:"+average);
  }
}


  
	   
   