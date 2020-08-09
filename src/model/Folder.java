package model;

import java.util.ArrayList;
import java.util.List;

/*
 * The class Folder can contains Entries.
 */
public class Folder extends Element
{
	
	private List<Entry> content;
	
	
	public Folder(String name)
	{
		this.name = name;
		this.content = new ArrayList<>();
	}
	
	
	/*
	 * @return The content of the folder.
	 */
	public List<Entry> getContent() 
	{
		return this.content;
	}
	
	
	/*
	 * Add an entry in the folder.
	 */
	public void add(Entry element)
	{
		this.content.add(element);
	}
	
}
