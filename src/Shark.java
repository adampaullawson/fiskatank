import javafx.scene.image.Image;

public class Shark extends Fish {

	public Shark(int x, int y){
		super(x,y);
		image = new Image(AnimationApp.class.getResource("resources/Shark-Transparent.png").toExternalForm());
	}
	
	double x,y,dx=5,dy=5;
	
	public void move()
	{
		x = r.getX();
		y = r.getY();
		x+=dx;
		if(x>1280)
			dx=-5;
		if(x<0)
			dx=5;
		y+=dy;
		if(y>1024)
			dy=-5;
		if(y<0)
			dy=5;
		r.setX(x);
		r.setY(y);
		
	
	}
	
	
}
