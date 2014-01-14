public class Euler5
{
  public static void main(String[] args)
	{
	  int value = 1;
		for(int i = 1; i <= 10; i++)
		{
		  if(value%i != 0)
			{
			  value++;
				i = 1;
			}
		}
		System.out.println(value);
	}
}