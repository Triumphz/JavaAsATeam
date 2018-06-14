package LOOP2;

public class Q8
{

	public static void main(String[] args)
	{
		int g =0;
		int g_1=1;
		for(int y =1; y<=10; y++)
		{
			for(int j=10; j>=y; j--)
			{
				System.out.print("-");
			}
			
			if(y%2==0)
			{
				for(int h=1; h<=y+g; h++)
				{
					System.out.print(h);
				}	
					
			}
			if(y%2!=0) 
			{

				for(int z=g_1; z>=1; z--)
				{
					System.out.print(z);
				}
			}
			
			System.out.println();
			g=g+1;
			g_1=g_1+2;
	}
}
}