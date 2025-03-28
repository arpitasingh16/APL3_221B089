public class Main
{
	public static void main(String[] args) {
	    System.out.println("Whisky");
		Beverage b = new Whisky();
		b.templateMethod(30);
		
		System.out.println("Rum");
		b = new Rum();
		b.templateMethod(30);
		
		System.out.println("Beer");
		b = new Beer();
		b.templateMethod(300);
		
	}
}
