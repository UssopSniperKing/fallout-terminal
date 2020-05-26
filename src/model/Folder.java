package model;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Element
{
	
	private List<Element> content;
	
	
	public Folder(String name)
	{
		this.name = name;
		this.content = new ArrayList<>();
	}
	
	
	public List<Element> getContent() 
	{
		return this.content;
	}
	
	
	public void add(Entry entry)
	{
		this.content.add(entry);
	}
	
	
	public void add(Folder folder)
	{
		this.content.add(folder);
	}
	
}
