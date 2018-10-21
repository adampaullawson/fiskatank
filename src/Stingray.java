import javafx.scene.image.Image;
public class Stingray extends Fish{

	double x, y, dx=1, dy=1;
	Funky thing = new Funky();
	
	public Stingray(int x, int y)
	{
		super(x,y);
		image = new Image(AnimationApp.class.getResource("resources/StingRay-Isolated.png").toExternalForm());
		}
	
	public void moveSimple()
	{
		
		
		x = r.getX();
		y = r.getY();
		
		x+=dx;
		if(x>1280)
			dx=-thing.positionChange();
		if(x<0)
			dx=thing.positionChange();
		y+=dy;
		if(y>1024)
			dy=-thing.positionChange();
		if(y<0)
			dy=thing.positionChange();
		r.setX(x);
		r.setY(y);
		
				
	}
	
	
	
}
