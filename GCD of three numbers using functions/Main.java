import java.util.*;
class Main
{
  public static int gcd(int n1, int n2)
  {
      int sm,p=0,gc=0;
      if(n1>n2)
         sm =n2;
      else 
         sm=n1;
      if(n2%sm == 0)
        return sm;
          //gc =sm;
      else
         for(int i =sm-1 ;i>=1; i--)
         {
           if(n2%i == 0  && n1%i == 0){
			   gc=i;
              break;
           }
		  
         }   
      		return gc; 
    }
public static void main(String args[])
{
  Scanner sc =new Scanner(System.in);
  int n1 =sc.nextInt();
  int n2 =sc.nextInt();  
   int n3 =sc.nextInt();
   int res =gcd(n1,n2);
   System.out.println( gcd(res,n3));
 }
}
