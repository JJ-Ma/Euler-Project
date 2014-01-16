public class Euler7
{
  public boolean isPrime(int num)
  {
    if(num <= 1) return false;
    if(num == 2) return true;
    int i = 2;
    while(i <= num/2)
    {
      if(num%i == 0) return false;
      i++;
    }
    return true;
  }
  public static void main(String[] args)
  {
	  Euler7 s = new Euler7();
    int counter = 0;
		int i = 0;
    for(i = 2; counter < 10001; i++)
    {
      if(s.isPrime(i))
      {
        counter++;
      }
    }
    System.out.println(--i);
  }
}