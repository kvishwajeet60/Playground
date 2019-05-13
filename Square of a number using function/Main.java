import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int res =n*n;
    return res;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc= new Scanner(System.in);
      int k =sc.nextInt();
      System.out.println(square(k));
	} 
}