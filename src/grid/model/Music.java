package grid.model; 

public class Music 
{
	private String name;
	private String artist;
	private int releaseDate;
	private double duration;
	
	public Music(String name, String artist, int releaseDate, double duration)
	{
		this.name = name;
		this.artist = artist;
		this.releaseDate = releaseDate;
		this.duration = duration;
		
	}
	
	public String toString()
	{
		String description = "This song is called " + name + " by " + artist + ", it was released in " + releaseDate+ " and is " + duration + " minutes long.";
		String song = name;
		return song;
	}

}
