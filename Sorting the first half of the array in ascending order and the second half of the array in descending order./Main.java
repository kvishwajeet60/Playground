import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] =new int[n];
    for(int i=0;i<n;i++)
      arr[i] =sc.nextInt();
    int len;
    if(n%2 == 0)
      len =n/2;
    else
      len =((int)n/2) ;
    Arrays.sort(arr,0,len);
    Arrays.sort(arr,len,n);
    for(int i=0;i<len;i++)
      System.out.print(arr[i]+" ");
    for(int i=n-1;i>=len;i--)
      System.out.print(arr[i]+" ");
  }
}