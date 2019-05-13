import java.util.*;
class Main
{
  public static void main(String[] args )
  {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int res =1;
    for(int i =1; i<=m;i++)
       res= res *n;
    System.out.println(res);
  }
}