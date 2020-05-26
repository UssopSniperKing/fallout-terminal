package model;

/**
 * The class Element represent all the things which can be in the terminal
 * such as Folders, Entries.
 */
public class Element 
{
	protected String name;
	protected boolean isSelected = false;
	
	
	/*
	 * @return The name or title of the element.
	 */
	public String getName()
	{
		return this.name;
	}
	
	
	/*
	 * Set the Element as "selected".
	 */
	public void select()
	{
		this.isSelected = true;
	}
	
	
	/*
	 * Set the Element as "unselected".
	 */
	public void unselect()
	{
		this.isSelected = false;
	}
	
	
	/*
	 * @return Whether or not the element is selected.
	 */
	public boolean isSelected()
	{
		return this.isSelected;
	}
	
}
