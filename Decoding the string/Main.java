import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s =sc.nextLine();
    int key =sc.nextInt();
    int len =s.length();
    for(int i=0;i<len;i++)
    {
      char ch =s.charAt(i);
      if(ch == ' ')
        System.out.print(" ");
      else{
		  if(ch >= 65 && ch<= 90){
		     ch = (char)(ch -65);
			 ch = (char)((26+ch-key)%26);
			 ch =(char)(ch +65);
			 System.out.print(ch);
		  }
		  else{
		     ch = (char)(ch -97);
			 ch = (char)((26+ch-key)%26);
			 ch =(char)(ch +97);
			 System.out.print(ch);
		  }
		     
      }
        
    }
  }
}