import Monster.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class StageGUI extends JFrame implements ActionListener{
	//Images:
	private Icon Boss = new ImageIcon(getClass().getResource("Boss.png"));
	private Icon Minion = new ImageIcon(getClass().getResource("Minion.png"));
	
	
	private Icon hero = new ImageIcon(getClass().getResource("Hero.png"));
	private Icon tank = new ImageIcon(getClass().getResource("Tank.png"));
	private Icon soldier = new ImageIcon(getClass().getResource("Soldier.jpg"));
	
	
	private Icon arrow = new ImageIcon(getClass().getResource("arrow.png"));
	private Icon arrow2 = new ImageIcon(getClass().getResource("arrow2.png"));
	private Icon arrow3 = new ImageIcon(getClass().getResource("arrow3.png"));

	//Buttons:
	private JButton attackBtn = new JButton("Attack");
	
	private JButton returnBtn = new JButton("Return");
	
	private JButton tankUpAttBtn = new JButton(arrow);
	private JButton heroUpAttBtn = new JButton(arrow2);
	private JButton soldierUpAttBtn = new JButton(arrow3);


	//-private JButton map = new JButton("Map");
	private JButton[][] squares = new JButton[4][4];
	
	//Labels:
	private JLabel upgradeLbl = new JLabel("Upgrades:");
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
		
		setActionListener();

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
				firstPanel.add(squares[i][j]);
			}
		}
		squares[2][0].setBackground(Color.RED);
		squares[2][1].setBackground(Color.YELLOW);
		squares[2][2].setBackground(Color.ORANGE);
		
		squares[2][0].setIcon(soldier);
		squares[2][1].setIcon(hero);
		squares[2][2].setIcon(tank);
		
		
		squares[0][1].setIcon(Boss);
		squares[0][0].setIcon(Minion);
		squares[0][2].setIcon(Minion);
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
		secondPanel3.add(returnBtn);
		
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
			squares[1][0].setIcon(soldier);
			squares[1][1].setIcon(hero);
			squares[1][2].setIcon(tank);
			squares[2][0].setIcon(null);
			if (squares[1][0]!= null) {
				squares[1][0].setIcon(soldier);
			} 
			if (squares[2][0] == null) {
				squares[2][0].setIcon(soldier);
			}
			squares[2][1].setIcon(null);
			squares[2][2].setIcon(null);
		
			//log.append();
			
		} else if (callingBtn.equalsIgnoreCase("Return")) {
			squares[2][0].setIcon(soldier);
			squares[2][1].setIcon(hero);
			squares[2][2].setIcon(tank);
			
			
		} else if (callingBtn.equalsIgnoreCase("arrow")) {
			
			//log.append();
		} else if (callingBtn.equalsIgnoreCase("arrow2")) {
			
			//log.append();
		} else if (callingBtn.equalsIgnoreCase("arrow3")) {
			
			//log.append();
		}
		
	}

}
