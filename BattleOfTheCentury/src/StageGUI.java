
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class StageGUI extends JFrame{
	private JButton attackBtn = new JButton("Attack");
	private JButton moveBtn = new JButton("Move");
	
	private JButton map = new JButton("Map");
	
	private JLabel selectLbl = new JLabel("Select Unit");
	private JLabel chooseLbl = new JLabel("Actions");
	private JTextArea historyTxtArea = new JTextArea();
	
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
		createFirstPanel();
		createSecondPanel1();
		createSecondPanel2();
		createSecondPanel3();
		createRightHelperPanel();

		addPanelsToFrame();
		setVisible(true);
	}

	
	private void createFirstPanel() {
		firstPanel.add(map);
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
		add(rightHelperPanel);
		
	}

	
	
	public static void main(String[] args) {
		StageGUI game = new StageGUI("ok");
	}
	
	
}
