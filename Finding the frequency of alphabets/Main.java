import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc =new Scanner(System.in);
      String ss =sc.nextLine();
      String s=ss.toLowerCase();
      int l=s.length();
      char arr[] =new char[l];
      int res[] =new int[l];
      for(int i=0;i<l;i++)
      {
        char ch =s.charAt(i);
        int count =0;
        for(int j=i+1;j<l;j++)
        {       
          if(ch == s.charAt(j))
            count++;
        }
        arr[i] =ch;
        res[i] =count+1;
      }	
	  for(int i=0;i<arr.length;i++)
	  {
		 for(int j=i+1;j<arr.length;j++) 
		 {
			if(arr[i] == arr[j])
				 arr[j] ='$';
		 }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]>='a' && arr[i] <= 'z')
			  System.out.print(arr[i]+""+res[i]+" ");
	  }
        
      
    }
}