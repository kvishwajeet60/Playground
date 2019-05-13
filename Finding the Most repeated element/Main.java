import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] =new int[n];
    int res[] =new int[n];
    int ele[] =new int[n];
    for(int i=0;i<n; i++)
      arr[i] = sc.nextInt();
    int cnt=0;
    for(int i=0;i<n; i++)
    {
      if(arr[i] == -1)
          continue;
      int count =0;
      ele[cnt] =arr[i];
      for(int j=i+1;j<n; j++)
      {
        
        if(arr[j] == arr[i])
        {
          count++;
          arr[j] = -1;
        }
      }
      res[cnt] = count+1;
      cnt++;
    }
   /* for(int i=0;i<cnt;i++)
      System.out.print(res[i] +" ");
    System.out.print(" \n");
    for(int i=0;i<cnt;i++)
      System.out.print(ele[i] +" ");
    System.out.print(" \n");
    for(int i=0;i<n;i++)
      System.out.print(arr[i] +" ");*/
    
   
    int first =res[0],sec=res[0];
    int pos =0;
	for(int i=1;i<cnt;i++)
	{
	    if(res[i] > first)
        {
          pos=i;
			sec =first;
			first =res[i];
		}
       if(res[i] > sec && res[i] < first)
        {
			sec =res[i];
		}		
	}
	if(first == sec)
      System.out.print(arr[0]);
    else
       System.out.print(ele[pos]);
    
  }
}