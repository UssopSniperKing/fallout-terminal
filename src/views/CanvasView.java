package views;

import controller.Controller;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

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
	
}
