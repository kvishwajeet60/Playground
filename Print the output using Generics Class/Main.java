import java.util.*;
public class Main<T> 
{ 
 public static<T> T result(T ele)
 {
   return ele;
 }
  public static void main(String[] args) 
     { 
       Scanner sc =new Scanner(System.in);
       int into = sc.nextInt();
        System.out.println("Integer Value: "+result(into));
       String str =sc.next();
       System.out.println("String Value: "+result(str));
       float fl = sc.nextFloat();   
       System.out.println("Float value: "+result(fl));
     }
 }