package LOOP1;

public class Q9
{

	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if (i%3==0||i%5==0) //1.�����á�ͧ�������Ѻ�Ţ������3�Ѻ5������
			{
				if (i%3==0 && i%5==0)//2. �����ҵѴ����Ţ������3�Ѻ5�����ͧ�ӹǹ�͡ 
				{
					continue;
				}				
				System.out.println(i);
				
			}
			
		}
		
	}
}
	

