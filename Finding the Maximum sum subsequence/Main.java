import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] =new int[n];
    for(int i=0;i<n;i++)
      arr[i] =sc.nextInt();
    int sum =arr[0];
    int max =0;
    for(int i=1;i<n;i++)
    {
      if(arr[i-1] < arr[i])
        sum =sum+arr[i];
      else{
        if(sum>max)
        { max =sum;}
        sum = arr[i];
      }
      if(i == n-1)
      {
        if(sum>max)
        { max =sum;}
      }
    }
    System.out.print(max);
    
  }
}