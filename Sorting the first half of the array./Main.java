import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] =new int[n];
    for(int i=0;i<n;i++)
      arr[i] =sc.nextInt();
    int cnt=0;
    if(n%2 == 0)
      cnt=n/2;
    else
      cnt=((int)n/2) ;
    Arrays.sort(arr,0,cnt);
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}