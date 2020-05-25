package views;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application 
{
	
	private Stage primaryStage;
	private AnchorPane window;
	
	
    public static void main(String[] args) 
    {
        launch(args);
    }
 
    
    @Override
    public void start(Stage primaryStage) 
    {
    	this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Fallout Terminal");
        this.initWindow();
    }

    
    public void initWindow()
    {
    	try {
    		
    		//Load the window from FXML file
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(Main.class.getResource("/views/window.fxml"));
    		this.window = (AnchorPane) loader.load();
    		
    		//Show the scene containing the window
    		Scene scene = new Scene(this.window);
    		this.primaryStage.setScene(scene);
    		this.primaryStage.show();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    
    public Stage getPrimaryStage()
    {
    	return this.primaryStage;
    }
}