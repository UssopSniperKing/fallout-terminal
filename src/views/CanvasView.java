package views;

import controller.Controller;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasView 
{
	private final Canvas canvas;
	private final Controller controller;
	private GraphicsContext context;
	
	
	public CanvasView(Canvas canvas, Controller controller)
	{
		this.controller = controller;
		this.canvas = canvas;
		this.context = this.canvas.getGraphicsContext2D();
	}
	
	
	public void render()
	{
		this.clear();
		this.renderBackground();
	}
	
	
	public void clear()
	{
		this.context.clearRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
	}
	
	
	public void renderBackground()
	{
		this.context.setFill(Color.BEIGE);
		this.context.fillRect(0, 0, Main.CANVAS_WIDTH, Main.CANVAS_HEIGHT);
	}
	
}
