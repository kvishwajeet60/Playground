import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
       Scanner sc = new Scanner (System.in);
      int n =sc.nextInt();
      int upper=n/2,lower =n/2;
      //System.out.print(upper);
      for(int i =1;i<=upper+1;i++)
      {
        for(int j =1;j<=n;j++)
        {
          if(j == i || j == n -i +1 )
            System.out.print("*");
          else
             System.out.print(" ");
        }
         System.out.print("\n");
      }
      
      for(int i =lower;i>=1;i--)
      {
        for(int j =1;j<=n;j++)
        {
          if(j == i || j == n -i +1 )
            System.out.print("*");
          else
             System.out.print(" ");
        }
         System.out.print("\n");
      }
	}
}