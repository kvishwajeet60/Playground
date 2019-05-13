import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc =new Scanner(System.in);
      int n= sc.nextInt();
      int arr[] =new int[n];
      for(int i=0;i< n; i++)
          arr[i] =sc.nextInt();
     int k= sc.nextInt(); 
      for(int i=0;i< k; i++)
      {
        int max =arr[0];
        int pos =0;
        for(int j=1;j< n; j++)
        {
          if(arr[j] >max){
            max =arr[j];
            pos =j;
          }          
        }
        if(i == k-1 )
          System.out.print(max);
        arr[pos] =0;
      }
    }   
}