package model;

/*
 * The class Entry is just a sort of text file.
 */
public class Entry extends Element
{
	private String content;
	
	
	public Entry(String name, String content)
	{
		this.name = name;
		this.content = content;
	}
	
	/*
	 * @return The text of the entry.
	 */
	public String getContent()
	{
		return this.content;
	}
	
}
