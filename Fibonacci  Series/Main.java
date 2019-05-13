/*class Fibonacci extends Thread
{
  // type your code here
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
     }
}*/
import java.util.*;
class Main{  
public static void main(String args[])  
{    
  Scanner sc =new Scanner(System.in);
  int count=sc.nextInt();
  if(count <= 0)
  {
    System.out.println("Enter the limit for Fibonacci: "+count);
    System.out.println("Exception occurred");
    return;
  }
 int n1=0,n2=1,n3,i;   
   System.out.println("Enter the limit for Fibonacci: "+count);
   System.out.print("The Fibonacci series is :");
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
   
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  