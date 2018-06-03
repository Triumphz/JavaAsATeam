
package a_book;

public class loop19
{

	public static void main(String[] args)
	{
		int x=1;
		while (x <=100)
		{            
			if((x%3== 0|| x%5 == 0)!=(x%3== 0&& x%5 == 0))/// สรุปคือผลลัพธ์ 2สมการมาทำการเช็คกัน
			//if(x%3== 0&& x%5 == 0)
			{
				
		System.out.println(x);
		}
				
		x++;
		}
		
		
	
}

	}





//	if((x%3== 0|| x%5 == 0)!=(x%3== 0&& x%5 == 0))