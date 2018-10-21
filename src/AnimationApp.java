import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AnimationApp extends Application{
	Pane pane;
	Scene scene;
	Canvas canvas;
	GraphicsContext gc;;
	ArrayList<Fish> fishes = new ArrayList<Fish>();
	ImageView im = new ImageView();
	Funky thing = new Funky();
	Image image = new Image("resources/632270-1280x1024.jpg");
	AnimationTimer timer = new AnimationTimer(){

		@Override
		public void handle(long arg0) {
			gc.setFill(Color.LIGHTCYAN);
			gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
			im.setImage(image);
			gc.drawImage(image, 0, 0);;
			for(Fish f : fishes){
				f.moveSimple();
				gc.drawImage(f.image, f.r.getX(), f.r.getY());

			}

		}};

		EventHandler<KeyEvent> keyHandler = new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent keyEvent) {

	
			}};



			public static void main(String[] args){
				launch(args);
			}

			@Override
			public void start(Stage stage) throws Exception{
				stage.initStyle(StageStyle.UNDECORATED);
				pane = new Pane();
				scene = new Scene(pane,1280,1024);

				stage.setScene(scene);
				stage.setX(-1280);
				//stage.setY(0);

				stage.show();
				canvas = new Canvas(1280,1024);
				gc = canvas.getGraphicsContext2D();
				gc.setFill(Color.LIGHTCYAN);
				gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
				pane.getChildren().add(canvas);
				scene.setOnKeyPressed(keyHandler);

				for(int i=1; i<thing.noOfFish(); i++){
					fishes.add(new Fish(thing.xCoord(),thing.yCoord()));
				}
				
				for(int i=1; i<thing.noOfFish(); i++){
					fishes.add(new BlueFish(thing.xCoord(),thing.yCoord()));
				}
				
				for(int i=1; i<thing.noOfFish(); i++){
					fishes.add(new ClownFish(thing.xCoord(),thing.yCoord()));
				}
				
				for(int i=1; i<thing.noOfFish(); i++){
					fishes.add(new RedFish(thing.xCoord(),thing.yCoord()));
				}
				
				for(int i=1; i<3; i++){
					fishes.add(new Stingray(thing.xCoord(),thing.yCoord()));
				}
				
				
				
				timer.start();

			}



}