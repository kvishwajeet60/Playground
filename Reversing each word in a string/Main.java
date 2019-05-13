import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    String s =sc.nextLine();
    int count=1;
    for(int i=0;i<s.length();i++)
    {
      char ch =s.charAt(i);
      if(ch == ' ')
        count++;
    }
    String arr[] = s.split(" ",count);
    for(int i=0;i<count;i++)
    {
      StringBuilder sb =new StringBuilder(arr[i]);
      sb.reverse();
      System.out.print(sb+" ");
    }
  }
}