import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner sc = new Scanner(System.in);
      int no =sc.nextInt();
      int noo=no;
      int sum =0;
      
      for(int i=no;no>0;no =no/10)
      {
        int x=no%10;
        //System.out.println(x);
        int pro =1;
        for(int j=1;j<=x;j++)
        {
           pro =pro *j;         
        }
        //System.out.println(pro);
        sum =sum + pro;
      }
      
      
      //System.out.println(sum);
      if (noo == sum)
           System.out.println("Yes");
      else
        System.out.println("No");
	}
}