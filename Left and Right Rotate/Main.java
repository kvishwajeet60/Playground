import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]= new int[n];
    
    for (int i=0;i<n;i++)
      arr[i] =sc.nextInt();
    int r =sc.nextInt();
    for(int i=0;i<r; i++)
    {
      rotate_odd(n,arr);
      rotate_even(n,arr);
    }
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  	}
  public static void rotate_odd(int n,int arr[])
  {
    int total;
    int x;
    if(n%2 == 0){
      total =n/2;
      x= n-2;}
    else{
        total =(int)n/2 +1;
          x= n-1;}
    int p=arr[x];
      for(int i=0;i<total-1;i++)
      {
        arr[x] =arr[x-2];
        x =x-2;
      }
    arr[0]=p;
  }
   public static void rotate_even(int n,int arr[])
  {
    int total =(int)n/2;
    int p =arr[1];
     int count=1;
     for(int i=0;i<total-1; i++)
     {
       arr[count] =arr[count+2];
       count=count+2;
     }
     int t=total*2 -1;
     arr[t] =p;
    
  }
}