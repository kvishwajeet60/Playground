import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc =new Scanner(System.in);
      int n =sc.nextInt();
      for(int i =1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
          System.out.print(" ");
        for(int k=1;k<=i+i-1;k++)
           System.out.print("*");
        System.out.print("\n");
      }
	}
}