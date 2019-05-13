import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int op =sc.nextInt();
      double area=0;
      if(op == 1){
          int n=sc.nextInt();
          area=n*n;
          System.out.println(area);
      }
      if(op == 2){
          int nn=sc.nextInt();
          int m=sc.nextInt();
          area=nn*m;
          System.out.println(area);
      }
      if(op == 3){
          int no=sc.nextInt();
          int mo=sc.nextInt();
          area=0.5*no*mo;
          System.out.println(area);
      }
      if(op == 4){
          int ni=sc.nextInt();
          area=3.14*ni*ni;
          System.out.println(area);
      }
      
    }
}