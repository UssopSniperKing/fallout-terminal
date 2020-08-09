package model;

import java.util.ArrayList;
import java.util.List;

public class Desktop 
{
	private Folder rootFolder;
	private int SelectedRank;
	private List<Folder> repositories;
	private Element viewedElement;
	
	public static final String TERMINAL_NAME = "ROBCO INDUSTRIES UNIFIED OPERATING SYSTEM \n COPYRIGHT 2075-2077 ROBCO INDUSTRIES";
	
	private static final String ROOT_NAME = "ROOT/";
	
	
	public Desktop()
	{
		this.SelectedRank = 0;
		this.rootFolder = new Folder(ROOT_NAME);
		this.rootFolder.setPosX(200);
		this.rootFolder.setPosY(200);
		this.repositories = new ArrayList<>();
		this.repositories.add(this.rootFolder);
		this.repositories.get(this.SelectedRank).select();
	}
	
	
	public List<Folder> getRepositories()
	{
		return this.repositories;
	}
	
	
	public Element getViewedElement()
	{
		return this.viewedElement;
	}
	
	
	private int getSelectedRank()
	{
		return this.SelectedRank;
	}
	
	
	private void setSelectedRank(int n)
	{
		this.SelectedRank = n;
	}
	
	
	public Element getSelectedElement()
	{
		return this.getRepositories().get(this.getSelectedRank());
	}
	
	
	public void selectForward()
	{
		if (this.getSelectedRank() + 1 <= this.getRepositories().size()) {
			
			this.getSelectedElement().unselect();
			this.setSelectedRank(this.getSelectedRank() + 1);
			this.getSelectedElement().select();
		}
	}
	
	
	public void selectBackward()
	{
		if (this.getSelectedRank() - 1 >= 0) {
			
			this.getSelectedElement().unselect();
			this.setSelectedRank(this.getSelectedRank() - 1);
			this.getSelectedElement().select();
		}
	}
	
	
	public void goInside()
	{
		this.viewedElement = this.getSelectedElement();
		this.getSelectedElement().goInside();
	}
	
	
	public void goOutside()
	{
		//TODO
	}
	
}
