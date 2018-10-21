import javafx.scene.image.Image;

public class BlueFish extends Fish{


	double x, y, dx=1, dy=1;
	Funky thing = new Funky();
	
	public BlueFish(int x, int y)
	{
		super(x,y);
		image = new Image(AnimationApp.class.getResource("resources/Fish-PNG-2.png").toExternalForm());
		}
	
	public void moveSimple()
	{
		
		
		x = r.getX();
		y = r.getY();
		
		x+=dx;
		if(x>1280){
		
			dx=-thing.positionChange();
			image = new Image(AnimationApp.class.getResource("resources/Fish-PNG-2.png").toExternalForm());
		}
		if(x<-150){
			
			dx=thing.positionChange();
			image = new Image(AnimationApp.class.getResource("resources/Fish-PNG-2Flip.png").toExternalForm());
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
