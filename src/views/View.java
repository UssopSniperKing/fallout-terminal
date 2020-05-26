package views;

import controller.Controller;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;

public class View 
{
	private Controller controller;
	private CanvasView canvasView;
	private Canvas canvas;
	
	
	public void initialize(Canvas canvas, Controller controller)
	{
		this.controller = controller;
		this.canvas = canvas;
		this.canvasView = new CanvasView(this.canvas, controller);
		this.canvas.setWidth(Main.CANVAS_WIDTH);
	    this.canvas.setHeight(Main.CANVAS_HEIGHT);
	    this.canvasView.render();
	}
	
	
	@SuppressWarnings("incomplete-switch")
	public void handleKeyReleased(KeyEvent keyEvent)
	{
		switch (keyEvent.getCode()) {
		case UP :
			this.controller.selectForward();
			break;
		case DOWN :
			this.controller.selectBackward();
			break;
		case ENTER :
			this.controller.goInside();
			break;
		case TAB :
			this.controller.goOutside();
			break;
		}
	}
	
	
	void setEventHandler(Scene scene) 
	  {
	    scene.addEventFilter(KeyEvent.KEY_RELEASED, this::handleKeyReleased);
	  }

}
