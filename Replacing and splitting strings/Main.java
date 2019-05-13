import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner  sc=new Scanner(System.in);
      String str1 =sc.nextLine();
      String str2 =sc.nextLine();
      int n=sc.nextInt();
      for(int i=0;i<str2.length();i++)
      {
        
        if(str2.charAt(i) == ' '){
         System.out.println();
          continue;}
        System.out.print(str2.charAt(i));
      }
    }
}