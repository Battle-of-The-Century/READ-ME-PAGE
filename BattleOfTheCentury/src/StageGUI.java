

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class StageGUI extends JFrame{
	private Icon Hero = new ImageIcon(getClass().getResource("Hero.jpg"));
	private Icon arrow = new ImageIcon(getClass().getResource("arrow.png"));
	private Icon Tank = new ImageIcon(getClass().getResource("Tank.jpg"));
	private Icon Soldier = new ImageIcon(getClass().getResource("Soldier.jpg"));


	private JButton attackBtn = new JButton("Attack");
	private JButton tankUpAttBtn = new JButton(arrow);
	private JButton heroUpAttBtn = new JButton(arrow);
	private JButton soldierUpAttBtn = new JButton(arrow);
	
	
	
	

	//-private JButton map = new JButton("Map");
	private JButton[][] squares = new JButton[4][4];

	//Colors:
	private Color colorGray = Color.gray;
	
	//Position
	// upper left corner of board is (0,0).
	private int row = 7;
	private int col = 1;

	//Images:
	
	



	private JLabel pointsLbl = new JLabel("POINTS");

	private JLabel upgradeLbl = new JLabel("Upgrades:");
	private JLabel attUpLbl = new JLabel("Attack UP");
	
	private JLabel tankLbl = new JLabel("Tank: Attack +20 - cost 20pts");
	private JLabel heroLbl = new JLabel("Hero: Attack +25 - cost 25pts");
	private JLabel soldierLbl = new JLabel("Soldier: Attack +15 - cost 15ts");
	
	
	
	private JLabel chooseLbl = new JLabel("XD");
	private JTextArea pointsTxtArea = new JTextArea("POINTS");
	private JTextArea statsTxtArea = new JTextArea("STATS");



	//public GridLayoutManager() {
		//super("GUI GridLayout Manager - (click a valid square to move piece)")



	//}

	
	Soldier soldier = new Soldier(15, 5, 15, 5);
	Tank tank = new Tank(35, 7, 35, 1);

	//Map panel
	private JPanel firstPanel = new JPanel(new GridLayout(3,3));

	//points TEXT
	private JPanel secondPanel1 = new JPanel(new GridLayout(3,2));

	//UPGRADE PANEL
	private JPanel secondPanel2 = new JPanel(new GridLayout(3,2));

	//ATTACK BUTTON
	private JPanel secondPanel3 = new JPanel(new GridLayout(1,1));


	private JPanel rightHelperPanel = new JPanel(new GridLayout(3,1));
	
	

	
	ButtonHandler buttonHandler = new ButtonHandler();
	
	public StageGUI(String title) {
		super(title = "Battle of The Century");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		// min width is 600
		setSize(800, 800);

		setResizable(false);
	

		createFirstPanel();
		createSecondPanel1();
		createSecondPanel2();
		createSecondPanel3();
		createRightHelperPanel();

		addPanelsToFrame();
		setVisible(true);
		pointsTxtArea.setEditable(false);
		statsTxtArea.setEditable(false);
	}

	

	//for squares for map
	private Container contents;

	
	

		
	private void createFirstPanel() {

		for (int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				squares[i][j] = new JButton();
				if ((i + j) % 2 != 0)
				{
					squares[i][j].setBackground(colorGray);
				}
				firstPanel.add(squares[i][j]);
				squares[i][j].addActionListener(buttonHandler);
				
				squares[3][1] = new JButton(Soldier);
				squares[3][2] = new JButton(Hero);
				squares[3][3] = new JButton(Tank);
				
			}
		}
		//Its supposed to set the icon I set for the hero
		// this line gives us null pointer exception *down below*????
		//squares[row][col].setIcon(Hero);
	}
	//secondPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "POINTS"));
	private void createSecondPanel1() {
		secondPanel1.add(statsTxtArea);
		secondPanel1.add(pointsTxtArea);
		
		secondPanel1.add(upgradeLbl);
		secondPanel1.add(chooseLbl);
		
		secondPanel1.add(tankLbl);
		secondPanel1.add(tankUpAttBtn);
	}

	private void createSecondPanel2() {

		
		

		
		
		secondPanel2.add(heroLbl);
		secondPanel2.add(heroUpAttBtn);
		secondPanel2.add(soldierLbl);
		secondPanel2.add(soldierUpAttBtn);

	}
	
	private void createSecondPanel3() {
		
		secondPanel3.add(attackBtn);
	}

	private void createRightHelperPanel() {
		rightHelperPanel.add(secondPanel1);
		rightHelperPanel.add(secondPanel2);
		rightHelperPanel.add(secondPanel3);
	}

	private void addPanelsToFrame() {
		add(firstPanel);
		
		add(rightHelperPanel);

	}
	
	
	private boolean isValidMove (int i, int j) {
		
		int rowDelta = Math.abs(i - row);
		int colDelta = Math.abs(j - col);
		
		if ((rowDelta == 1) && (colDelta ==2)) {
			
			return true;
		}

			if ((rowDelta == 1) && (colDelta ==2)) {
			
				return true;
			}
			return false;
	}

	
	
	private void processClick(int i, int j) {
		
		if (isValidMove(i,j) == false)
		{
			return;
			
		}
		squares[row][col].setIcon(null);
		squares[i][j].setIcon(Hero);
		row = i;
		col = j;
		
	}
	
	
	
	private class ButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			
			for (int i = 0; i < 7; i++)
			{
				for(int j = 0; j < 7; j++)
				{
					if (source == squares[i][j])
					{
						
						processClick(i,j);
						return;
					}
				}
			}
		}
	}
	
	
	
	

	public static void main(String[] args) {
		StageGUI game = new StageGUI("ok");
	}


}
