package LOOP1;

public class Q10
{

	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=1000;i++)
		{	// 1.������ѡ��á�ͧ������Ѻ���繤����͹ (������ǡ��������ö������� ��������������ͧ������繤����)							
			if ((i%3==0&&i%5==0)||(i%3==0&&i%7==0)||(i%5==0&&i%7==0))
			{
				if(i%3==0&&i%5==0&&i%7==0) // 2. �����ҡ�ͧ�ա������������ ��� 3 ���  
				{
					continue;
				}
								
				System.out.println(i);
				
			}
	}
	}
}

