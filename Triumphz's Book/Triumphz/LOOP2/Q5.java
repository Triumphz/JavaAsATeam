package LOOP2;

public class Q5
{

	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=10; j>i; j--)
			{
				System.out.print("-");
			}
			for(int h=1; h<=i; h++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
