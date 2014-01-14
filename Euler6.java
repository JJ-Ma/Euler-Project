public class Euler6
{
  public int SumOfSquares(int min, int max)
  {
    int sum = 0;
    while(min <= max)
    {
      sum = sum + (min*min);
      min++;
    }
    return sum;
  }

  public int SquareOfSum(int min, int max)
  {
    int sum = 0;
		while(min <= max)
    {
      sum = sum + min;
      min++;
    }
    return sum*sum;
  }
  public static void main(String[] args)
  {
    Euler6 answer = new Euler6();
    System.out.println(answer.SquareOfSum(1,100)-answer.SumOfSquares(1,100));
  }
}