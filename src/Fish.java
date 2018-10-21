import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

public class Fish {

	public Image image;
	public Rectangle r;
	double x, y, dx=1, dy=1;
	Funky thing = new Funky();
	
	
	public Fish(int x, int y)
	{
		image = new Image(AnimationApp.class.getResource("resources/Fish-PNG-15.png").toExternalForm());
		r = new Rectangle(x,y,image.getWidth(),image.getHeight());
	}
	
	public Fish(){}
	
	public void moveSimple()
	{
		
		
		x = r.getX();
		y = r.getY();
		
		x+=dx;
		if(x>1280){
			
			dx=-thing.positionChange();
			image = new Image(AnimationApp.class.getResource("resources/Fish-PNG-15.png").toExternalForm());
		}
			
		if(x<-150){
			
			dx=thing.positionChange();
			image = new Image(AnimationApp.class.getResource("resources/Fish-PNG-15Flip.png").toExternalForm());
		}
		y+=dy;
		if(y>1024)
			dy=-thing.positionChange();
		if(y<0)
			dy=thing.positionChange();
		r.setX(x);
		r.setY(y);
		
				
	}

	
}
