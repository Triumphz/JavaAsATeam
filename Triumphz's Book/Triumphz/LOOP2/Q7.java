package LOOP2;

public class Q7
{

	public static void main(String[] args)
	{
		for(int x =10,y=x; y>=1; y--)
		{
			for(int j=1; j<=y; j++)
			{
				System.out.print("-");
			}
			for (int k=0; k<=x-y; k++)
			{
				System.out.print(k+1);
				
			}
			for (int k=x-y; k>0; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
			
		}
		
	}
		
		