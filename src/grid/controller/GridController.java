package grid.controller;

import javax.swing.JOptionPane;
import grid.model.Music;
import grid.view.GridFrame;

public class GridController 
{
	private GridFrame appFrame;
	public GridFrame getAppFrame() {
		return appFrame;
	}


	public void setAppFrame(GridFrame appFrame) {
		this.appFrame = appFrame;
	}


	private Music [][] grid;
	
	public GridController()
	{
		// create the music objects here
		grid = new Music[5][5];
		fillGrid();
		appFrame = new GridFrame(this);
		
		
	}
	
	
	private void fillGrid()
	{
		addKansasMusic();
		addPoisonMusic();
		addBostonMusic();
		addJourneyMusic();
		addRushMusic();
	}
	
	private void addKansasMusic()
	{
		grid[0][0] = new Music("Point of Know Return", "Kansas");
		grid[1][0] = new Music("Play the Game Tonight", "Kansas");
		grid[2][0] = new Music("Dust in the Wind", "Kansas");
		grid[3][0] = new Music("Carry on Wayward Son", "Kansas");
		grid[4][0] = new Music("The Wall", "Kansas");
	}
	
	private void addPoisonMusic()
	{
		grid[0][1] = new Music("Talk Dirty To Me", "Poison");
		grid[1][1] = new Music("Nothin' But A Good Time", "Poison");
		grid[2][1] = new Music("Every Rose Has Its Thorn", "Poison");
		grid[3][1] = new Music("Your Mama Don't Dance", "Poison");
		grid[4][1] = new Music("Want Some, Need Some","Poison");
	}
	
	private void addBostonMusic()
	{
		grid[0][2] = new Music("More Than a Feeling", "Boston");
		grid[1][2] = new Music("ForePlay/ Long Time", "Boston");
		grid[2][2] = new Music("Hitch a Ride", "Boston");
		grid[3][2] = new Music("Feelin' Satisfied", "Boston");
		grid[4][2] = new Music("Amanda" ,"Boston");
	}
	
	private void addJourneyMusic()
	{
		grid[0][3] = new Music("Signs of Life", "Journey");
		grid[1][3] = new Music("Escape", "Journey");
		grid[2][3] = new Music("Don't Stop Believin'", "Journey");
		grid[3][3] = new Music("Stone in Love", "Journey");
		grid[4][3] = new Music("Faithfully","Journey");
	}
	
	private void addRushMusic()
	{
		grid[0][4] = new Music("Closer To The Heart", "Rush");
		grid[1][4] = new Music("A Passage To Bangkok", "Rush");
		grid[2][4] = new Music("Limelight", "Rush");
		grid[3][4] = new Music("The Spirit Of Radio", "Rush");
		grid[4][4] = new Music("Tom Sawyer","Rush");
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Type a valid integer between 0 and 4 into the row and field column\n"
				+ "Press clear to erase the text in that spot or type into the text field\n"
				+ "and press change song to change the text in that position.");
	}

	
	public Music[][] getGrid()
	{
		return grid;
	}
	
	public void setGrid(Music[][] grid) 
	{
		this.grid = grid;
	}

	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
