package LOOP2;

public class Q6
{

	public static void main(String[] args)
	{
		int x =1;
		for(int i=1; i<=10; i++)
		{
			for(int j=10; j>=i; j--)
			{
				System.out.print("-");
			}
			for(int h=1; h<=x; h++)
			{
                System.out.print("x");
            }
			x+=2;
			
			System.out.println();
		}

	}

}
