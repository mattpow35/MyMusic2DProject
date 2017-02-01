package grid.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import grid.controller.GridController;

import java.awt.Dimension;

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
		this.inputLabel = new JLabel("Type input here:");
		this.submitButton = new JButton("submit");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	
	private void setupTable()
	{
		//Load model
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String[] {"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);;
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
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
		this.add(gridPane);
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
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 125, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 46, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -5, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -46, SpringLayout.EAST, this);
		
		
		
		
		
	}
	
	private void setupListeners()
	{
		
	}

}
