import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc= new Scanner(System.in);
      String s =sc.nextLine();
      String s1 =sc.nextLine();
      String s2 =sc.nextLine();
      String sb= s.replace(s1,s2);
      System.out.println(sb);
      
    }
}