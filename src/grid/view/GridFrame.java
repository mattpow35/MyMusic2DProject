package grid.view;

import javax.swing.JFrame;

import grid.controller.GridController;

import java.awt.Dimension;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new GridPanel(baseController);
		
		setupFrame();
	}

	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("My 2D Music Table");
		this.setSize(new Dimension(750,500));
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}
	
	
}
