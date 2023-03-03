package Interface;

abstract class cat {
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	public abstract void noise();
	{
	
	}
 }
	class parrot implements cat1
	{
		public void noise()
		{
			System.out.println("Bhu Bhu");
		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			System.out.println("sleeping");
		}
	
		}
public class Animal
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parrot p = new parrot();
		p.noise();
p.sleep();
	}
	}