import java.util.Scanner;
class Main {
    public static int res (int x,int y)
    {
      if (x>y)
         return x;
      else
        return y;
    }
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int p =res(n1,n2);
      System.out.println(res(p,n3));
      
    }
}