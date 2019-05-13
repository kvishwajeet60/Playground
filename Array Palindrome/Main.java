import java.util.*;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc =new Scanner (System.in);
      int n =sc.nextInt();
      int arr[] =new int[n];
      int res[] =new int[n];
      for(int i=0;i<n;i++){
        arr[i] =sc.nextInt();
        res[n-i-1] =arr[i];}
      if(Arrays.equals(arr,res))
        System.out.println("Yes");
      else
       System.out.println("No");
    }
}