package music.view;

import javax.swing.*;
import music.controller.MusicController;
import java.awt.Dimension;

public class MusicPanel extends JPanel 
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JLabel inputLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private MusicController baseController;
	
	public MusicPanel(MusicController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		this.rowField = new JTextField(2);
		this.columnField = new JTextField(2);
		this.inputField = new JTextField(15);
		this.rowLabel = new JLabel("Row:");
		this.columnLabel = new JLabel("Column:");
		this.inputLabel = new JLabel("Type input here:");
		this.submitButton = new JButton("submit");
		
		
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));
		rowField.setEditable(true);
		columnField.setEditable(true);
		inputField.setEditable(true);
		this.add(rowField);
		this.add(columnField);
		this.add(inputField);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(inputLabel);
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 6, SpringLayout.SOUTH, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 29, SpringLayout.SOUTH, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, -5, SpringLayout.NORTH, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 6, SpringLayout.EAST, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, inputLabel, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 22, SpringLayout.SOUTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, -5, SpringLayout.NORTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 7, SpringLayout.EAST, columnLabel);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, -5, SpringLayout.NORTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 30, SpringLayout.WEST, this);
		
		
		
	}
	
	private void setupListeners()
	{
		
	}

}
