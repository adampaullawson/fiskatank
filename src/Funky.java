import java.util.Random;


public class Funky {

	Random generator = new Random();
	
	public Funky(){}
	
	
	public int xCoord(){
		
		int i = generator.nextInt(1280);
		return i;
	}
	
	public int yCoord(){
		
		int i = generator.nextInt(1024);
		return i;
	}
	
	public int noOfFish(){
		int i = generator.nextInt(70);
		return i; 
		
	}
	
	public int positionChange(){
		
		int i = generator.nextInt(3);
		
		
		return i;
	}
	
	
}
