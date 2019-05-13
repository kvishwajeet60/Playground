import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc =new Scanner(System.in);
      int n1 =sc.nextInt();
      int n2 =sc.nextInt();
      int n3 =sc.nextInt();
      System.out.println(great(n1,n2,n3));
	}
  public static int great(int n1,int n2, int n3)
  {
    int p =0,q=0;
    if(n1>n2)
      p =n1;
    else
      p=n2;
    if(p>n3)
      q =p;
    else
      q =n3;
     return q; 
  }
}