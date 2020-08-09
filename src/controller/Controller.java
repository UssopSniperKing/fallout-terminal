package controller;

import java.util.List;

import model.Desktop;
import model.Element;
import model.Folder;
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
	
	
	public void selectForward()
	{
		this.desktop.selectForward();
	}
	
	
	public void selectBackward()
	{
		this.desktop.selectBackward();
	}
	
	
	public void goInside()
	{
		this.desktop.goInside();
	}
	
	
	public void goOutside()
	{
		this.desktop.goOutside();
	}
	
	
	public Element getViewedElement()
	{
		return this.desktop.getViewedElement();
	}
	
	
	public List<Folder> getRepositories()
	{
		return this.desktop.getRepositories();
	}
	
}
