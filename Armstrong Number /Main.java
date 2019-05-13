import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int no=n;
      int noo =n;
      int cnt =0;
      for(int i=n;n>0;n =n/10)
      {
        cnt++;
      }
      int sum =0;
      for(int i=no;no>0;no =no/10)
      {
        int x=no%10;
        sum =sum + (int)Math.pow(x,cnt);
      }
      if (noo == sum)
           System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}