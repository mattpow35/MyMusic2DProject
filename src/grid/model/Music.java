package grid.model; 

public class Music 
{
	private String name;
	private String artist;
	
	public Music(String name, String artist)
	{
		this.name = name;
		this.artist = artist;
		
		
	}
	
	public String toString()
	{
	//	String description = "This song is called " + name + " by " + artist;
		String song = name;
		return song;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
