package a_book;

public class loop2o3_revised
{

	public static void main(String[] args)
	{
		int i =0;
		while (i<10)
		{
			int x =1;
			while (x<=i+1)  /// ถ้าไม่ใส่1 บรรทัดสุดท้ายจะได้แค่9ตัว
			{
				System.out.print("x");
				x++;
			}
			System.out.println();
			i++;
		}
		

	}

}
