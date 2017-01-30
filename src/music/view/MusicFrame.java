package music.view;

import javax.swing.JFrame;
import music.controller.MusicController;
import java.awt.Dimension;

public class MusicFrame extends JFrame
{
	private MusicController baseController;
	private MusicPanel appPanel;
	
	
	public MusicFrame(MusicController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new MusicPanel(baseController);
		
		setupFrame();
	}

	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Music");
		this.setSize(new Dimension(500,500));
		this.setVisible(true);
		this.setResizable(false);
	}
}
