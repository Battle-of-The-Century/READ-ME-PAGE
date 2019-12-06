

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class StageGUI extends JFrame implements ActionListener{
	
	
	private Icon Hero = new ImageIcon(getClass().getResource("Hero.jpg"));
	private Icon Tank = new ImageIcon(getClass().getResource("Tank.jpg"));
	private Icon Soldier = new ImageIcon(getClass().getResource("Soldier.jpg"));
	
	//Images:
	private Icon arrow = new ImageIcon(getClass().getResource("arrow.png"));
	private Icon arrow2 = new ImageIcon(getClass().getResource("arrow2.png"));
	private Icon arrow3 = new ImageIcon(getClass().getResource("arrow3.png"));


	private JButton attackBtn = new JButton("Attack");
	private JButton tankUpAttBtn = new JButton(arrow);

	private JButton heroUpAttBtn = new JButton(arrow2);
	private JButton soldierUpAttBtn = new JButton(arrow3);


	//-private JButton map = new JButton("Map");
	private JButton[][] squares = new JButton[4][4];

	//Colors:
	private Color colorGray = Color.gray;
	
	//Position
	// upper left corner of board is (0,0).
	private int row = 7;
	private int col = 1;
	


	private JLabel pointsLbl = new JLabel("POINTS");

	private JLabel upgradeLbl = new JLabel("Upgrades:");
	private JLabel attUpLbl = new JLabel("Attack UP");
	
	private JLabel tankLbl = new JLabel("Tank: Attack +20 - cost 20pts");
	private JLabel heroLbl = new JLabel("Hero: Attack +25 - cost 25pts");
	private JLabel soldierLbl = new JLabel("Soldier: Attack +15 - cost 15ts");
	
	
	
	private JLabel chooseLbl = new JLabel("XD");
	private JTextArea pointsTxtArea = new JTextArea("POINTS");
	private JTextArea statsTxtArea = new JTextArea("STATS");


	

	//Map panel
	private JPanel firstPanel = new JPanel(new GridLayout(3,3));

	//points TEXT
	private JPanel secondPanel1 = new JPanel(new GridLayout(3,2));

	//UPGRADE PANEL
	private JPanel secondPanel2 = new JPanel(new GridLayout(3,2));

	//ATTACK BUTTON
	private JPanel secondPanel3 = new JPanel(new GridLayout(1,1));


	private JPanel rightHelperPanel = new JPanel(new GridLayout(3,1));
	
	
//
	

	//ButtonHandler buttonHandler = new ButtonHandler();

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

				//squares[i][j].addActionListener(buttonHandler);
				
				
				//squares[3][1] = new JButton(Soldier);
				//squares[3][2] = new JButton(Hero);
				//squares[3][3] = new JButton(Tank);
				firstPanel.add(squares[i][j]);
			}
		}
		squares[2][0].setBackground(colorGray);
		squares[2][1].setBackground(Color.YELLOW);
		squares[2][2].setBackground(Color.BLUE);
		
		squares[2][0] = new JButton(Soldier);
		squares[2][1] = new JButton(Hero);
		squares[2][2] = new JButton(Tank);
		
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
	
	

	private void setActionListener() {
		attackBtn.addActionListener(this);
		tankUpAttBtn.addActionListener(this);
		heroUpAttBtn.addActionListener(this);
		soldierUpAttBtn.addActionListener(this);
		
	}
	
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String callingBtn = e.getActionCommand();
		
		if (callingBtn.equalsIgnoreCase("Attack")) {
			
			//log.append();
		} else if (callingBtn.equalsIgnoreCase("arrow")) {
			
			//log.append();
		} else if (callingBtn.equalsIgnoreCase("arrow2")) {
			
			//log.append();
		} else if (callingBtn.equalsIgnoreCase("arrow3")) {
			
			//log.append();
		}
		
	}


}
