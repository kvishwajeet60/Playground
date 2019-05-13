import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
    try{
       int i =sc.nextInt();
       if(i == (int)i)
         System.out.println(i);
     }
     catch (Exception e){
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}