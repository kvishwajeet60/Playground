class Users {
		//write the logic for the class Users
     int id;
     String name;
     String mob; 
    
}

class Customers extends Users{
		//write the logic for the class Customers	
  String address;
  String dob;
  char gender;
  String order;   
  Customers(int id,String name,String mob,String address,String dob,char gender,String order)
  {
    this.name =name;
    this.mob =mob;
    this.address=address;
  }
  public void display()
  {
    System.out.println(name+", "+mob);
  }
  public void editaddress()
  {
    System.out.println(name+", "+address);
    this.address= "Coimbatore";
    System.out.println(name+", "+address);
  }
  public void placeOrder()
  {
    System.out.println( "Order placed successfully!");
  }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  String billaddress;
  int item;
  String pay;
  double feedback;   
  Suppliers(int id,String name,String mob,String billaddress,int item,String pay,double feedback)
  {
    this.name =name;
    this.mob =mob;
    this.billaddress=billaddress;
    this.item=item;
  }
   public void display()
  {
    System.out.println(name+", "+mob);
  }
  public void editaddress()
  {
    System.out.println(name+", "+billaddress);
    this.billaddress= "Delhi";
    System.out.println(name+", "+billaddress);
  }
  public void increaseStock(int increase)
  {
    System.out.println(name+", "+(item+increase));
  }
}

public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers cst1= new Customers(1001,"Saakshi","9000000000","Bangalore","16-Jul-1990",'F',"Lakme Kajal,Salwar");
      Customers cst2= new Customers(1008,"Rahul","9000000001","Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      Suppliers sup1= new Suppliers(7901,"ABC Traders","8000000000","Mumbai",10,"Paid",4.75);
      Suppliers sup2= new Suppliers(7972,"XYZ Enterprises","8000000900","Kolkata",7,"Unpaid",4.35);
      cst1.display();
      cst2.display();
      sup1.display();
      sup2.display();
      cst1.editaddress();
      sup1.editaddress();
      cst1.placeOrder();
      sup1.increaseStock(5);
      sup2.increaseStock(10);
    }	
}