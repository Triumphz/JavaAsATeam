package LOOP1;

public class Q8
{

	public static void main(String[] args)
	{
		int i = 1;
		while(i<=100)
		{
			if (i%3==0 || i%5==0)//เอาจำนวนที่หาร3หรือ5ลงตัว 
			{
				System.out.println(i);
			}	
			i=i+1;
		}

	}

}
