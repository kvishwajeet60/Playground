import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      	Scanner sc =new Scanner(System.in);
      int n =sc.nextInt();
      int arr[] =new int[n];
      int res[] =new int[n];
      int count =0;
      for(int i=0;i<n;i++){
        arr[i] =sc.nextInt();
        if (arr[i] == 0)
          count++;
      }
      int cnt=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i] != 0){
          res[cnt] =arr[i];
          cnt++;
        }
      }
      for(int i=0;i<n;i++){
        System.out.print(res[i]+" ");
      }
     
      
    }
}