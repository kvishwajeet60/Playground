import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s =sc.nextLine();
      String ss=s.toLowerCase();
      for(int i=97; i<=122; i++)
      {
        for(int j=0;j<ss.length();j++)
        {
          if(ss.charAt(j) == i)
            break;
           if(j == ss.length()-1)
            System.out.print((char)i+" ");
        }
      }
    }
}