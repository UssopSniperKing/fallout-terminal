package model;

import java.util.ArrayList;
import java.util.List;

public class Desktop 
{
	private Folder rootFolder;
	private int SelectedRank;
	private List<Folder> repositories;
	
	private static final String ROOT_NAME = "ROOT/";
	
	
	public Desktop()
	{
		this.SelectedRank = 0;
		this.rootFolder = new Folder(ROOT_NAME);
		this.repositories = new ArrayList<>();
		this.repositories.add(this.rootFolder);
		this.repositories.get(this.SelectedRank).select();
	}
	
	
	public List<Folder> getRepositories()
	{
		return this.repositories;
	}
	
	
	private int getSelectedRank()
	{
		return this.SelectedRank;
	}
	
	
	private void setSelectedRank(int n)
	{
		this.SelectedRank = n;
	}
	
	
	public void selectForward()
	{
		if (this.getSelectedRank() + 1 <= this.getRepositories().size()) {
			
			this.getRepositories().get(this.getSelectedRank()).unselect();
			this.setSelectedRank(this.getSelectedRank() + 1);
			this.getRepositories().get(this.getSelectedRank()).select();
		}
	}
	
	
	public void selectBackward()
	{
		if (this.getSelectedRank() - 1 >= 0) {
			
			this.getRepositories().get(this.getSelectedRank()).unselect();
			this.setSelectedRank(this.getSelectedRank() - 1);
			this.getRepositories().get(this.getSelectedRank()).select();
		}
	}
	
	
	public void goInside()
	{
		//TODO
	}
	
	
	public void goOutside()
	{
		//TODO
	}
	
}
