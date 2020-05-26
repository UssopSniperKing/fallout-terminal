package views;

import controller.Controller;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Desktop;

public class Main extends Application 
{
	
	public static final double CANVAS_HEIGHT = 800;
	public static final double CANVAS_WIDTH = 800;
	
	private Stage stage;
	private View view;
	
	
    public static void main(String[] args) 
    {
        launch(args);
    }
 
    
    @Override
    public void start(Stage stage) 
    {
        stage.setTitle( "Fallout Terminal" );
        this.view = new View();
        Controller controller = new Controller(new Desktop(), this.view);
        Group root = new Group();
        Scene scene = new Scene(root, CANVAS_WIDTH, CANVAS_HEIGHT, Color.BLACK);
        Canvas canvas = new Canvas();
        root.getChildren().add(canvas);
        stage.setScene(scene);
        this.view.initialize(canvas, controller);
        this.view.setEventHandler(scene);
        stage.show();
    }
    
    
    public Stage getStage()
    {
    	return this.stage;
    }
}