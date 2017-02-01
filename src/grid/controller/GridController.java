package grid.controller;

import javax.swing.JOptionPane;
import grid.model.Music;
import grid.view.GridFrame;

public class GridController 
{
	private GridFrame appFrame;
	private Music [][] grid;
	
	public GridController()
	{
		// create the music objects here
		grid = new Music[4][5];
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
		grid[0][0] = new Music("Point of Know Return", "Kansas", 1977, 3.11);
		grid[1][0] = new Music("Play the Game Tonight", "Kansas", 1982, 3.26);
		grid[2][0] = new Music("Dust in the Wind", "Kansas", 1977, 3.26);
		grid[3][0] = new Music("Carry on Wayward Son", "Kansas", 1976, 3.26);
	}
	
	private void addPoisonMusic()
	{
		grid[0][1] = new Music("Talk Dirty To Me", "Poison", 1986, 3.39);
		grid[1][1] = new Music("Nothin' But A Good Time", "Poison", 1988, 3.44);
		grid[2][1] = new Music("Every Rose Has Its Thorn", "Poison", 1988, 4.20);
		grid[3][1] = new Music("Your Mama Don't Dance", "Poison", 1972, 3.00);
	}
	
	private void addBostonMusic()
	{
		grid[0][2] = new Music("More Than a Feeling", "Boston", 1976, 4.45);
		grid[1][2] = new Music("ForePlay/ Long Time", "Boston", 1976, 7.48);
		grid[2][2] = new Music("Hitch a Ride", "Boston", 1976, 4.12);
		grid[3][2] = new Music("Feelin' Satisfied", "Boston", 1978, 4.12);
	}
	
	private void addJourneyMusic()
	{
		grid[0][3] = new Music("Signs of Life", "Journey", 2001, 4.54);
		grid[1][3] = new Music("Escape", "Journey", 1981, 5.17);
		grid[2][3] = new Music("Don't Stop Believin'", "Journey", 1981, 4.08);
		grid[3][3] = new Music("Stone in Love", "Journey", 1981, 4.26);
	}
	
	private void addRushMusic()
	{
		grid[0][4] = new Music("Closer To The Heart", "Rush", 1977, 2.52);
		grid[1][4] = new Music("A Passage To Bangkok", "Rush", 1976, 3.35);
		grid[2][4] = new Music("Limelight", "Rush", 1981, 4.20);
		grid[3][4] = new Music("The Spirit Of Radio", "Rush", 1980, 4.59);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "This is my 2D creation of music.");
	}

	
	public Music[][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
