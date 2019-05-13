import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str = sc.nextLine();
       Pattern pat =Pattern.compile(str);
       String str2 = sc.nextLine();
      Matcher mat =pat.matcher(str2);
      int i=0;
      while(mat.find())
      {
        i++;
        System.out.println("found: "+i+" :"+" "+mat.start()+" - "+(mat.end()));
      }
      if(i == 0)
        System.out.println("The given word is not present in the string");
      else
        System.out.println(i);
    }
}