import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    String s = sc.nextLine();
    int count=1;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i) == ' ')
        count++;
    }
    String arr[] =s.split(" ",count);
      for(int i=0;i<count;i++){
        if(arr[i].equals("ap")){
          continue;}
        System.out.print(arr[i]+" ");
        
        for(int j=i+1;j<count;j++)
        {
          if(arr[i].equals(arr[j]))
            arr[j]="ap";
        }
      }
  }
}