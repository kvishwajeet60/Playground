import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int row =sc.nextInt();
      int col =sc.nextInt();
      for(int i=0;i<row;i++)
      {
        int vv=row;
        for(int j=0;j<i;j++)
        {
          System.out.print(vv);
          vv--;
        }
        for(int j=i;j<col;j++)
        {
          System.out.print(row-i);
        }
        System.out.println();
      }
    }
}