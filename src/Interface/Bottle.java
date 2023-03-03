package Interface;

public class Bottle implements Color
{
private String bottle_color;
private String Bottle_name;
private int price;
public Bottle() {
	super();
	// TODO Auto-generated constructor stub
}
public String getBottle_color() {
	return bottle_color;
}
public void setBottle_color(String bottle_color) {
	this.bottle_color = bottle_color;
}
public String getBottle_name() {
	return Bottle_name;
}
public void setBottle_name(String bottle_name) {
	Bottle_name = bottle_name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Bottle(String bottle_color, String bottle_name, int price) {
	super();
	this.bottle_color = bottle_color;
	Bottle_name = bottle_name;
	this.price = price;
}
@Override
public void fill() {
	// TODO Auto-generated method stub
System.out.println("Filled");	
}
@Override
public void color() {
	// TODO Auto-generated method stub
	System.out.println("Blue");
}
@Override
public void empty() {
	// TODO Auto-generated method stub
	System.out.println("Empty");
}
@Override
public void fillC() {
	// TODO Auto-gnerated method stub
	System.out.println("Filled Color");
}
}