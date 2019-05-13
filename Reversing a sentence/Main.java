import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      String s =sc.nextLine();
      int count =0;
      for(int i=s.length()-1;i>=0;i--)
      {
        count++;
        if(s.charAt(i) == ' ')
        {
          int ll =i;
        for(int j=ll+1;j<ll+count;j++){
          System.out.print(s.charAt(j));}
          count=0;
          System.out.print(" ");
        }
      }
      System.out.print(s.charAt(0));
      
    }
}