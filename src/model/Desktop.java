package model;

public class Desktop 
{
	private Folder rootFolder;
	
	private static final String ROOT_NAME = "ROOT/";
	
	
	public Desktop()
	{
		this.rootFolder = new Folder(ROOT_NAME);
		this.rootFolder.select();
	}
	
	public Folder getRootFolder()
	{
		return this.rootFolder;
	}
	
}
