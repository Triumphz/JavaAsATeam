package LOOP1;

public class Q9
{

	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if (i%3==0||i%5==0) //1.ผมใช้การกรองข้อมูลรับเลขที่หาร3กับ5ทั้งหมด
			{
				if (i%3==0 && i%5==0)//2. แล้วมาตัดเอาเลขที่หาร3กับ5ได้ทั้งสองจำนวนออก 
				{
					continue;
				}				
				System.out.println(i);
				
			}
			
		}
		
	}
}
	

