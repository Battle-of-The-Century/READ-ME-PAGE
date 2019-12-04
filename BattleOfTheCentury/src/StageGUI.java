

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;




public class StageGUI extends JFrame{
	

	
	private JButton attackBtn = new JButton("Attack");
	private JButton moveBtn = new JButton("Move");
	
	private JButton map = new JButton("Map");
	private JButton[][] squares = new JButton[7][7];
	
	//Colors:
	private Color colorBlack = Color.BLACK; 
	
	//Images:
	//private ImageIcon *variable ex. pawn* = new ImageIcon("white pawn.jpg");
	
	private JLabel selectLbl = new JLabel("Select Unit");
	private JLabel chooseLbl = new JLabel("Actions");
	private JTextArea historyTxtArea = new JTextArea();
	
	
	
	//public GridLayoutManager() {
		//super("GUI GridLayout Manager - (click a valid square to move piece)")
		
		
		
	//}
	
	Hero hero = new Hero(25, 10, 25, 3);
	Soldier soldier = new Soldier(15, 5, 15, 5);
	Tank tank = new Tank(35, 7, 35, 1);
	private Army[] units = {soldier, tank, hero};
	private JComboBox unit = new JComboBox(units);
	
	//Map panel
	private JPanel firstPanel = new JPanel();
	
	//Move & attack button
	private JPanel secondPanel1 = new JPanel(new GridLayout(1,2));
	
	//Unit Jcombo box
	private JPanel secondPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	//display text box or history
	private JPanel secondPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	
	private JPanel rightHelperPanel = new JPanel(new GridLayout(3,1));

	public StageGUI(String title) {
		super(title = "Battle of The Century");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		// min width is 600 
		setSize(600, 400);
		
		setResizable(false);
		
		createFirstPanel();
		createSecondPanel1();
		createSecondPanel2();
		createSecondPanel3();
		createRightHelperPanel();

		addPanelsToFrame();
		setVisible(true);
	}

	//for squares for map
		private Container contents;
	
	private void createFirstPanel() {
		//contents.setLayout(new GridLayout(6,6));
		firstPanel.add(map);
		
		contents = getContentPane();
		//contents.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		contents.setLayout(new GridLayout(6,6));
		
		for (int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				squares[i][j] = new JButton();
				if ((i + j) % 2 != 0)
				{
					squares[i][j].setBackground(colorBlack);
				}
				contents.add(squares[i][j]);
				//squares[i][j].addActionListener(l);
			}
		}
	}

	private void createSecondPanel1() {
		secondPanel1.add(moveBtn);
		//secondPanel1.add(chooseLbl, BorderLayout.CENTER);
		secondPanel1.add(attackBtn);
		
	}
	
	private void createSecondPanel2() {
		secondPanel2.add(selectLbl);
		secondPanel2.add(unit);
	}
	private void createSecondPanel3() {
		secondPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "History"));
		secondPanel3.add(historyTxtArea);
	}
	
	private void createRightHelperPanel() {
		rightHelperPanel.add(secondPanel1);
		rightHelperPanel.add(secondPanel2);
		rightHelperPanel.add(secondPanel3);
	}

	private void addPanelsToFrame() {
		add(firstPanel);
		//add();
		add(rightHelperPanel);
		
	}

	
	
	public static void main(String[] args) {
		StageGUI game = new StageGUI("ok");
	}
	
	
}
