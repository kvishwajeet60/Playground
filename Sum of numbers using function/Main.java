import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int res =0;
    for(int i=0;i<=n;i++)
      res =res+i;
    return res;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc= new Scanner(System.in);
      int k =sc.nextInt();
      System.out.println(sum(k));
	} 
}