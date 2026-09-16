import java.util.*;


class Primepalindrome
{
  boolean pri(int n)
  {
    int count=0;
	for(int i=1;i<=n;i++)
	{
	  if(n%i==0)
	  {
	    count++;
	  }
	}
	return count==2;
  }
  boolean pal(int n)
  {
    int rem=0,res=0,temp=n;
	while(temp>0)
	{
	   rem=temp%10;
	   res=res*10+rem;
	   temp/=10;
	}
   return res==n;
  }
}
 class Prime
 {
    public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int n=sc.nextInt();
	  Primepalindrome p=new Primepalindrome();
	  if(p.pri(n) && p.pal(n))
	  {
	   System.out.println("It is a prime palindrome");
	  }
	  else
	  {
	  System.out.println("It is not a prime palindrome");
	  }
    }
  }
 
	   