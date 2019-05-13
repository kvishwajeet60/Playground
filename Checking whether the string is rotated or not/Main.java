import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc= new Scanner(System.in);
      String s1 =sc.nextLine();
      String s2 =sc.nextLine();
      String s3=s1.concat(s1);
      //System.out.println(s3);
      int l1= s3.length();
      int l2= s2.length();
      for(int i=0;i<l1-l2+1;i++)
      {
        //System.out.println(s3.substring(i,i+l2));
        if((s3.substring(i,i+l2)).equals(s2))
        {
          System.out.println("Yes");
          break;
        }
        if(i == l1-l2)
           System.out.println("No");
      }
      
    }
}