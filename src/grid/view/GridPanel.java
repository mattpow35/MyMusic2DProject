package grid.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import grid.controller.GridController;

import java.awt.Dimension;
import java.awt.event.*;

public class GridPanel extends JPanel 
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JLabel inputLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	private JButton eraseButton;
	
	private JTable gridTable;
	private JScrollPane gridPane;

	
	public GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.rowField = new JTextField(2);
		this.columnField = new JTextField(2);
		this.inputField = new JTextField(15);
		this.rowLabel = new JLabel("Row:");
		this.columnLabel = new JLabel("Column:");
		this.inputLabel = new JLabel("Type in a new song here:");
		this.submitButton = new JButton("Change Song");
		this.eraseButton = new JButton("Clear");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	public GridController getBaseController()
	{
		return baseController;
	}
	
	private void setupTable()
	{
		//Load model
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String[] {"Kansas", "Poison", "Boston", "Journey", "Rush"});
		gridTable = new JTable();
		gridTable.setModel(data);;
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(750, 750));
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
		this.add(gridPane);
		this.add(eraseButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 22, SpringLayout.SOUTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, -5, SpringLayout.NORTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 7, SpringLayout.EAST, columnLabel);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 0, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, -5, SpringLayout.NORTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 8, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 8, SpringLayout.EAST, inputLabel);
		baseLayout.putConstraint(SpringLayout.EAST, inputLabel, -239, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 12, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 13, SpringLayout.SOUTH, inputLabel);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 40, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 120, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, -30, SpringLayout.WEST, rowLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, eraseButton, 6, SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, eraseButton, 0, SpringLayout.WEST, submitButton);
		
		
		
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				int row = Integer.parseInt(rowField.getText());
				int col = Integer.parseInt(columnField.getText());
				if (row < 5 && col < 5)
				{
					baseController.getGrid()[row][col].setName(inputField.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(baseController.getAppFrame(), "Type in a valid location for a song. Rememeer row and column start at 0 not 1 :)");
				}
			}
		});
		
		
		eraseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
					int row = Integer.parseInt(rowField.getText());
					int col = Integer.parseInt(columnField.getText());
					if (row < 5 && col < 5)
					{
						baseController.getGrid()[row][col].setName("");
					}
					else
					{
						JOptionPane.showMessageDialog(baseController.getAppFrame(), "Type in a valid location for a song to be cleared. Rows and columns start at 0 not 1 :)");
					}
		     	
		
			}
		});
	}

}
