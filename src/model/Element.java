package model;

public class Element 
{
	protected String name;
	protected boolean isSelected = false;
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	public void select()
	{
		this.isSelected = true;
	}
	
	
	public boolean isSelected()
	{
		return this.isSelected;
	}
	
}
