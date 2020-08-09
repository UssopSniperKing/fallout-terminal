package model;

/**
 * The class Element represent all the things which can be in the terminal
 * such as Folders, Entries.
 */
public abstract class Element
{
	protected String name;
	protected boolean isSelected = false;
	protected double posX;
	protected double posY;
	private boolean isInside = false;
	
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
	
	
	/*
	 * @return The X position of the button on the canvas.
	 */
	public double getPosX() 
	{
		return this.posX;
	}
	
	
	/*
	 * @return The Y position of the button on the canvas.
	 */
	public double getPosY()
	{
		return this.posY;
	}
	
	
	/*
	 * Set the X position to the given double.
	 */
	public void setPosX(double x)
	{
		this.posX = x;
	}
	
	
	/*
	 * Set the Y position to the given double.
	 */
	public void setPosY(double y)
	{
		this.posY = y;
	}
	
	/*
	 * @return Whether or not the content of the folder is viewed.
	 */
	public boolean isInside()
	{
		return this.isInside;
	}
	
	
	/*
	 * Set the value of isInside to true.
	 */
	public void goInside()
	{
		this.isInside = true;
	}
	
	
	/*
	 * Set the value of isInside to false.
	 */
	public void goOutside()
	{
		this.isInside = false;
	}
	
}
