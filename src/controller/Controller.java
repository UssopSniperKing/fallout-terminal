package controller;

import model.Desktop;
import views.View;

public class Controller 
{
	private Desktop desktop; //Model
	private View view; //View
	
	
	public Controller(Desktop desktop, View view)
	{
		this.desktop = desktop;
		this.view = view;
	}
	
}
