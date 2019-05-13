import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          count++;
          if(count%2 == 1)
             System.out.print("*");
          else
             System.out.print("#");
          
        }
        System.out.print("\n");
      }
	}
}