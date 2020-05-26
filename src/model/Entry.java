package model;

public class Entry extends Element
{
	private String content;
	
	
	public Entry(String name, String content)
	{
		this.name = name;
		this.content = content;
	}
	
	
	public String getContent()
	{
		return this.content;
	}
	
}
