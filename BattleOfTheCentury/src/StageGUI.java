import Monster.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;



public class StageGUI extends JFrame implements ActionListener, MouseListener {
	
	private static int points;
	
	
	//Images:
	private Icon Boss = new ImageIcon(getClass().getResource("Boss.png"));
	private Icon Minion = new ImageIcon(getClass().getResource("Minion.png"));
	
	private Icon explosion = new ImageIcon(getClass().getResource("explosion.png"));
	private Icon slash = new ImageIcon(getClass().getResource("slash.png"));
	private Icon bullet = new ImageIcon(getClass().getResource("bullet.png"));
	
	private Icon hero = new ImageIcon(getClass().getResource("Hero.png"));
	private Icon tank = new ImageIcon(getClass().getResource("Tank.png"));
	private Icon soldier = new ImageIcon(getClass().getResource("Soldier.jpg"));
	
	
	
	//Buttons:
	private JButton attackBtn = new JButton("Attack");
	private JButton heroUpAttBtn = new JButton("Increase Attack");

	//-private JButton map = new JButton("Map");
	private JButton[][] squares = new JButton[4][4];
	
	//Labels:
	private JLabel heroLbl = new JLabel("HEROES: Attack +25 - cost 25pts");
	
	//TextBox
	private JTextArea pointsTxtArea = new JTextArea("POINTS: 0");
	private JTextArea statsTxtArea = new JTextArea("INFO:");


	//Map panel
	private JPanel firstPanel = new JPanel(new GridLayout(3,3));

	//points TEXT
	private JPanel secondPanel1 = new JPanel();

	//UPGRADE PANEL
	private JPanel secondPanel2 = new JPanel(new FlowLayout());
	
	//ATTACK PANEL
	private JPanel secondPanel3 = new JPanel(new GridLayout(1,1));

	private JPanel rightHelperPanel = new JPanel(new GridLayout(3,1));
	
	public StageGUI(String title) {
		super(title = "Battle of The Century");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		
		// minimum width is 600
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

		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				squares[i][j] = new JButton();
				firstPanel.add(squares[i][j]);
			}
		}
		squares[2][0].setBackground(Color.GREEN);
		squares[2][1].setBackground(Color.GREEN);
		squares[2][2].setBackground(Color.GREEN);
		
		squares[0][0].setBackground(Color.LIGHT_GRAY);
		squares[0][1].setBackground(Color.LIGHT_GRAY);
		squares[0][2].setBackground(Color.LIGHT_GRAY);
		
		squares[1][0].setBackground(Color.GREEN);
		squares[1][1].setBackground(Color.GREEN);
		squares[1][2].setBackground(Color.GREEN);
		
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
	}

	private void createSecondPanel2() {
		secondPanel2.add(heroLbl);
		secondPanel2.add(heroUpAttBtn);
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
		attackBtn.addMouseListener(this);
		attackBtn.addActionListener(this);
		heroUpAttBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String callingBtn = event.getActionCommand();
		
		  if (callingBtn.equals("Attack")) { 
			pointsTxtArea.setText("POINTS: " + addPoints());
			} 
		  else if (callingBtn.equals("Increase Attack")) {
				if (points != 0) {
				player.addAttack();
			
				statsTxtArea.setText("Player + 25\n" + player.toString() + "\n");
				pointsTxtArea.setText("POINTS: " + subtractPoints());
				} else if (points <= 0) {
					pointsTxtArea.setText("NOT ENOUGH POINTS");
				}
			}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	public static int addPoints() {
		points += Unit.getAttack();
		
		return points;
	}
	
	public static int subtractPoints() {
		points -= 25;
		return points;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		squares[1][0].setIcon(bullet);
		squares[1][1].setIcon(slash);
		squares[1][2].setIcon(explosion);
		
		squares[0][0].setBackground(Color.RED);
		squares[0][1].setBackground(Color.RED);
		squares[0][2].setBackground(Color.RED);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		squares[1][0].setIcon(null);
		squares[1][1].setIcon(null);
		squares[1][2].setIcon(null);
		
		squares[0][0].setBackground(Color.LIGHT_GRAY);
		squares[0][1].setBackground(Color.LIGHT_GRAY);
		squares[0][2].setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
			
	}

	static Unit player = new Unit("PLAYER");
	
	
	

	public static void main(String[] args) {
		StageGUI game = new StageGUI("ok");
	}
}