import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    String[] arr =new String[n];
    for(int i=0;i<n;i++)
    {
      String str =sc.next();	  
      arr[i] =str.toLowerCase();
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
      System.out.println(arr[i]);
    }
  }
}