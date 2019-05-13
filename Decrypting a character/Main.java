import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc =new Scanner(System.in);
      char ch =sc.next().charAt(0);
      int key =sc.nextInt();
      char res;
      if(ch >= 'a' && ch<= 'z')
           res =(char)(ch+26-key);
      else
        res =(char)(ch-key);
        System.out.println(res);
    }
}