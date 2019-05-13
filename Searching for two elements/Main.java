import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k[] = new int[n];
         for(int i =0;i<n; i++)
         {
	        k[i]=sc.nextInt();  
         }
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         int first=0,second =0;
         for(int i =0;i<n; i++)
         {
	        if(n1 == k[i])
              first=i;
           if(n2 == k[i])
             second=i;
         }
      if (first != 0)
        System.out.println(first);
      else
        System.out.println("-1");
       if (second != 0)
        System.out.println(second);
      else
        System.out.println("-1");
    }
}