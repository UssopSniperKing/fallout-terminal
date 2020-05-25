package model;

public class Desktop 
{
	private Folder rootFolder;
	
	private static final String ROOT_NAME = "ROOT/";
	
	
	public Desktop()
	{
		this.rootFolder = new Folder(ROOT_NAME);
	}
	
	public String getRootfolderName()
	{
		return this.ROOT_NAME;
	}
	
}
