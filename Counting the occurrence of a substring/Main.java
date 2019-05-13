import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc= new Scanner(System.in);
    String s =sc.nextLine();
    String sr =sc.nextLine();
    int l1 =s.length();
    int l2 =sr.length();
    int count =0;
    for(int i=0;i<l1-l2+1;i++)
    {
      String sd =s.substring(i,i+l2);
      if(sd.equals(sr))
        count++;
    }
    System.out.println(count);
  } 
}