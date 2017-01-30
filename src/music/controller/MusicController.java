package music.controller;

import javax.swing.JOptionPane;
import music.view.MusicFrame;

public class MusicController 
{
	private MusicFrame appFrame;
	
	public MusicController()
	{
		// create the music objects here
		
		appFrame = new MusicFrame(this);
	}
	
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "This is my 2D creation of music.");
	}

}
