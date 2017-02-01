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
		
		appFrame = new GridFrame(this);
		grid = new Music[5][4];
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
