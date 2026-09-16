class BREAKNFLABLE
{
	public static void main(String[] args)
	{
			
       l1:for(int i=0;i<15;i++)
        {
         for(int j=0;j<15;j++)
		 {		 
			if(i==9)
			{
				break l1;
			}
		   System.out.println(i+"...."+j);
		   
		 }	      
		}
         
    }
}