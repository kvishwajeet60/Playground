import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int pro=1;
      for(int i=1;i<=n;i++)
      {
        pro =pro *i;
         
      }
       System.out.println(pro);
	}
}