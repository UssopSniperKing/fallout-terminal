package model;

import java.util.ArrayList;
import java.util.List;

public class Folder 
{
	
	private List<Entry> entries;
	private List<Folder> folders;
	private String name;
	
	
	public Folder(String name)
	{
		this.name = name;
		this.entries = new ArrayList<>();
		this.folders = new ArrayList<>();
	}
	
	
	public List<Entry> getEntries() 
	{
		return this.entries;
	}
	
	
	public List<Folder> getFolders()
	{
		return this.folders;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	public void addEntry(Entry entry)
	{
		this.entries.add(entry);
	}
	
	
	public void addFolder(Folder folder)
	{
		this.folders.add(folder);
	}
	
}
