import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] =new int[n];
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    
    for(int i=0;i<n;i++)
    {
      int res=0;
      for(int j=i+1;j<n;j++)
      {
        if(arr[j] > res){
        if(arr[j] > arr[i]){
          res =arr[j];
          System.out.println(arr[i]+","+arr[j]);
        }}
        
      }
    }
  }
}