import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc =new Scanner(System.in);
    String s =sc.nextLine();
    String s2 =sc.nextLine();
    int l=s.length();
    char arr[] =new char[l];
    for(int i=0;i<l;i++)
    {
      arr[i] =s.charAt(i);
    }
    for(int i=0;i<s2.length();i++)
    {
     for(int j=0;j<l;j++)
     {
       if(s2.charAt(i) == arr[j])
         arr[j] =' ';
     }
    }
    for(int i=0;i<l;i++)
    {
      if(arr[i] == ' ')
        continue;
      else
        System.out.print(arr[i]);
    }
  }
}
