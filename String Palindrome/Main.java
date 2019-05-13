import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    String s =sc.nextLine();
    StringBuilder sb1 =new StringBuilder(s);
    StringBuilder sb =new StringBuilder();
   for(int i=s.length()-1;i>=0;i--)
   {
     sb.append(s.charAt(i));
   }
    if ((sb.toString()).equals((sb1.toString())))
      System.out.println("Yes");
    else
      System.out.println("No");
   
  }
}