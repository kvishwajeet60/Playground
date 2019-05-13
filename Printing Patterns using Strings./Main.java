import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    String s =sc.nextLine();
	int len =s.length();
	char arr[] =new char[len];
	for(int i=0;i<len;i++)
		arr[i] =s.charAt(i);
	int newl =(int)(len/2);
	for(int j=1;j<=len;j++)
		{
			for(int k=1;k<=len-j;k++)
			  System.out.print(" ");
		    for(int k=1;k<=j;k++){
			  char chh =arr[(newl+k-1)%len];
			  System.out.print(chh);
			}
			System.out.print("\n");	
		}

  }
}