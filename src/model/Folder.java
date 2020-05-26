package model;

import java.util.ArrayList;
import java.util.List;

/*
 * The class Folder can contains both Entries and Folders (= sub-folders).
 */
public class Folder extends Element
{
	
	private List<Element> content;
	
	
	public Folder(String name)
	{
		this.name = name;
		this.content = new ArrayList<>();
	}
	
	
	/*
	 * @return The content of the folder.
	 */
	public List<Element> getContent() 
	{
		return this.content;
	}
	
	
	/*
	 * Add an Element in the folder.
	 */
	public void add(Element element)
	{
		this.content.add(element);
	}
	
}
