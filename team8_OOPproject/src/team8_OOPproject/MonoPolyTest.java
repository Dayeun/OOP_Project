package team8_OOPproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class MonoPolyTest extends JPanel implements ActionListener, MouseListener {

	Random rand = new Random();
	int moving = 0;
	private JButton jButton_back;
	private JButton dice;
	private JLabel jlabel_background;
	
	private ImageIcon background;
	ImageIcon icon1 = new ImageIcon("barmagnet.PNG");
	ImageIcon icon2 = new ImageIcon("barmagnet.PNG");
	
	Game_Character character;
	public MonoPolyTest(){		
		character =new Game_Character(80,430,"character.PNG");
		jlabel_background = new JLabel();
		
		this.setSize(800, 600);
		this.setLayout(null);
		
		
		dice = new JButton("",icon1);
		dice.setBounds(650, 100, 50, 50);
		
		this.add(character);
		this.add(dice);
		dice.addMouseListener(this);
		// button event
		
		// add the component to JPanel
		
		// set the component location
		
		//return to previous panel
		jButton_back = new JButton("Back");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		this.add(jButton_back);
		
		background = new ImageIcon("MonopolyMap.png");
		this.jlabel_background.setBounds(0,0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
		
		this.setVisible(true);
	}

	public JButton getjButton_back() {
		return jButton_back;
	}

	public void setjButton_back(JButton jButton_back) {
		this.jButton_back = jButton_back;
	}

	public JLabel getJlabel_background() {
		return jlabel_background;
	}

	public void setJlabel_background(JLabel jlabel_background) {
		this.jlabel_background = jlabel_background;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//dice ���� ���� �ֻ��� ��� ���� -- �׸� ���� ����
		System.out.println(e.getY()+"=+="+e.getX());
		if(e.getSource().equals(dice)){
			int ran =rand.nextInt(6)+1;
			if(ran== 1){
				icon2 = new ImageIcon("barmagnet.PNG");
			}else if(ran== 2){
				icon2 = new ImageIcon("barmagnet.PNG");
			}else if(ran== 3){
				icon2 = new ImageIcon("barmagnet.PNG");
			}else if(ran== 4){
				icon2 = new ImageIcon("barmagnet.PNG");
			}else if(ran== 5){
				icon2 = new ImageIcon("barmagnet.PNG");
			}else if(ran== 6){
				icon2 = new ImageIcon("barmagnet.PNG");
			}
		
			Character_move(ran);
			
			this.repaint();
			this.remove(dice);
			dice = new JButton("",icon2);
			this.add(dice);
			this.repaint();
			dice.setVisible(true);
			dice.setBounds(650, 100, 50, 50);
			dice.addMouseListener(this);
			this.add(jlabel_background);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public void Character_move(int ran)
	{
		for(int i = 0; i< ran ; i++){
			System.out.println(ran);
			if(moving == 0 || moving == 4 || moving == 5 || moving == 8 ||moving == 10 ||moving ==11 ||moving ==14){
				character.moving_U(character.getX(),character.getY(),70);
			}else if( moving ==1 || moving == 2 || moving == 3 || moving == 12 ||moving ==13  ){
				character.moving_R(character.getX(),character.getY(),100);
			}else if(moving == 6 || moving == 7 || moving == 9){
				character.moving_L(character.getX(),character.getY(),100);
			}
			
			moving++;
			if(moving == 15){
				character.setLocation(300, -50);
				break;
			}
		}
		if(moving == 9){
			character.moving_U(character.getX(),character.getY(),70);
			character.moving_U(character.getX(),character.getY(),70);
		}
		
	}
	
}
