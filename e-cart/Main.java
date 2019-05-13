//import required packages here
import java.util.*;
class Item
{
   private int price;
  //create various method to return attribute value(s)
  public void setdata(int price)
  {this.price =price;}
  public int getdata()
  {return this.price;}
}
   
class Customer extends Item
{
  private String product;
   private int quantity;
  //create various method to return attribute value(s)
  public void setdatas(int quantity)
  {this.quantity =quantity;}
  public int getdatas()
  {return this.quantity;}
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  public int tprice(){
     return getdata()*getdatas();
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc=new Scanner(System.in);
   sc.nextLine();
    i.setdata(sc.nextInt());
    c.setdatas(sc.nextInt());
    System.out.println("Total Price is : "+i.getdata()*c.getdatas());
  }
}