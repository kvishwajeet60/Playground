import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
class Main {
  public static void main(String a[]){
    Scanner sc =new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Is "+str+" a valid user name? "+str.matches("[a-zA-Z0-9[_][-]]+"));
	String str2 = sc.nextLine();
    System.out.println("Is "+str2+" a valid email address? "+str2.matches("[a-z0-9[_][@][.]]+"));
    String str3 = sc.nextLine();
    System.out.println("Is "+str3+" a valid password? "+str3.matches("[a-zA-Z0-9[#][@][$][%]]+"));
    
	}
}