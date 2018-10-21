import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

public class Player {

	public Image image;
	public Rectangle r;
	public Player(int x, int y)
	{
		image = new Image(AnimationApp.class.getResource("resources/scuba-diving-147683_960_720.png").toExternalForm());
		r = new Rectangle(x,y,image.getWidth(),image.getHeight());
	}
}
