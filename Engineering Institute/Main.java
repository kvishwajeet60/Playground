import java.util.*;

class Faculty
{
  public void salary(int basesal)
  {
    System.out.println("Base Salary: "+basesal);
  }
}
class CSE extends Faculty
{
  public void salary(int basesal)
  {
    System.out.println("CSE Faculty: "+(basesal+3000));
  }
}
class IT extends Faculty
{
  public void salary(int basesal)
  {
    System.out.println("IT Faculty: "+(basesal+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int basesal)
  {
    System.out.println("ECE Faculty: "+(basesal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty obj = new  Faculty();
    CSE objq = new CSE();
    IT objw = new IT();
    ECE obje = new ECE();
    //implement your required concept here
    Scanner sc=new Scanner(System.in);
    int b =sc.nextInt();
    obj.salary(b);
     objq.salary(b);
     objw.salary(b);
     obje.salary(b);
  }
}