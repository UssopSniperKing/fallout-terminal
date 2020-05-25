package model;

public class Entry 
{
	
	private String title;
	private String content;
	
	
	public Entry(String title, String content)
	{
		this.title = title;
		this.content = content;
	}
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	
	public String getContent()
	{
		return this.content;
	}
	
}
