package Inheritance;

public class Fan {
 int wings;
 int price;
 String name;
 public Fan() ///deault constructor
 {
	 
 }
 public Fan(int wings,int price, String name)

 {
	 this.wings=wings;
this.price=price;
this.name=name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f=new Fan(3,500,"TC");
		System.out.println("Wings of fane are:" +f.wings);
		System.out.println("Name of the fan is:" +f.name);
		System.out.println("Price of the fan is:" +f.price);
	}

}
