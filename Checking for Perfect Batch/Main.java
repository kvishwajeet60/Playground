import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    //int arr[] =new int[n];
    int max=0,t;
    for(int i=0;i<n;i++)
    {
       t=sc.nextInt();
      if(t == 0 )
        max =1;
    }
    if(max == 0)
      System.out.println("Not a Perfect Batch");
    else
       System.out.println("Perfect Batch");
  }
}