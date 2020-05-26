package views;

import controller.Controller;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.Desktop;

public class CanvasView 
{
	private final Canvas canvas;
	private final Controller controller;
	private GraphicsContext context;
	
	private static final Font FONT = Font.loadFont(Main.class.getClassLoader().getResource("resources/FSEX300.ttf").toExternalForm(), 25);
	private static final Color BACKGROUND_COLOR = Color.rgb(14, 46, 32);
	private static final Color TEXT_COLOR = Color.rgb(41, 225, 140);
	
	
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
		this.renderDesktopText();
	}
	
	
	private void clear()
	{
		this.context.clearRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
	}
	
	
	private void renderBackground()
	{
		this.context.setFill(BACKGROUND_COLOR);
		this.context.fillRect(0, 0, Main.CANVAS_WIDTH, Main.CANVAS_HEIGHT);
	}
	
	
	private void renderDesktopText()
	{
		this.context.setFill(TEXT_COLOR);
		this.context.setFont(FONT);
		this.context.fillText(Desktop.TERMINAL_NAME, 100, 100);
	}
}
