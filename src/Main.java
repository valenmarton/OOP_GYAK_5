import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
	// konstruktor paraméter átadás amit megadtunk
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(3);
		Rectangle c = a;
		
	// toString meghívás
		
		System.out.println(a + "\n" + b + "\n"+c);
		
		a.setSides( 5, 6);
		
		System.out.println(a + "\n" + b + "\n"+c);
		
		
		a.setBothSides(3);
		
		System.out.println(a==b);
		System.out.println(a==c);
		
		System.out.println(a.hasSameSideLenght(b));
		
		Random rand = new Random();
		Rectangle[] rectangleArray = new Rectangle[10];
			
			
			for(int i=0; i<rectangleArray.length; i++){
				rectangleArray[i] = new Rectangle(rand.nextInt(8)+2, rand.nextInt(8)+2);
				System.out.println(rectangleArray[i]);
			}

	}
	

}
