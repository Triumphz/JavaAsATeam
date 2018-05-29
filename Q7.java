package LOOP1;

public class Q7
{

	public static void main(String[] args)
	{
		int i = 1;
		while(i<=100)
		{
			if (i%3==0 && i%5==0)// เอาจำนวนที่หารทั้ง3และ5ลงตัว(ทั้งสองตัว) 
			{
				System.out.println(i);
			}
			i=i+1;
		}

	}

}
