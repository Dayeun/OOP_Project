package team8_OOPproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class MonoPolyTest extends JPanel implements ActionListener{

	Random rand = new Random();
	private boolean finish = false;
	int moving = 0;
	private JButton jButton_back;
	private JButton dice;
	private JButton jButton_reset;
	private JLabel jlabel_background;
	
	private ImageIcon background;
	ImageIcon icon1 = new ImageIcon("die.PNG");
	
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
		dice.addActionListener(this);
		// button event
		jButton_reset = new JButton("Reset");
		jButton_reset.setBounds(700, 480, 80, 80);
		jButton_reset.addActionListener(this);
		this.add(jButton_reset);		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==getjButton_reset()){
			character.setLocation(80,430);
			moving=0;
			finish=false;
		}else if(e.getSource().equals(dice)){
			int ran =rand.nextInt(6)+1;
			if(ran== 1){
				icon1 = new ImageIcon("df1.PNG");
			}else if(ran== 2){
				icon1 = new ImageIcon("df2.PNG");
			}else if(ran== 3){
				icon1 = new ImageIcon("df3.PNG");
			}else if(ran== 4){
				icon1 = new ImageIcon("df4.PNG");
			}else if(ran== 5){
				icon1 = new ImageIcon("df5.PNG");
			}else if(ran== 6){
				icon1 = new ImageIcon("df6.PNG");
			}
		
			Character_move(ran);
			
			this.repaint();
			this.remove(dice);
			dice = new JButton("",icon1);
			this.add(dice);
			this.repaint();
			dice.setVisible(true);
			dice.setBounds(650, 100, 50, 50);
			dice.addActionListener(this);
			this.add(jlabel_background);
		}
		
	}

	public void Character_move(int ran) 
	{
		if(finish ==false){
			for(int i = 0; i< ran ; i++){
				if(moving == 0 || moving == 4 || moving == 5 || moving == 8 ||moving == 10 ||moving ==11 ||moving ==14){
					character.moving_U(character.getX(),character.getY(),70);
				}else if( moving ==1 || moving == 2 || moving == 3 || moving == 12 ||moving ==13  ){
					character.moving_R(character.getX(),character.getY(),100);
				}else if(moving == 6 || moving == 7 || moving == 9){
					character.moving_L(character.getX(),character.getY(),100);
				}
				if(moving == 15){
					character.setLocation(300, -50);
					MonoPoly_Quiz quizDialog = new MonoPoly_Quiz(ran);
					
					//if user correct it, show success message. If not, go back to starting point
					
					JOptionPane.showMessageDialog(null, "Success!", "Message", JOptionPane.INFORMATION_MESSAGE);
					finish =true;
					break;
				}
				moving++;
			}	
	    	if(moving == 9){
		    	character.moving_U(character.getX(),character.getY(),70);
			    character.moving_U(character.getX(),character.getY(),70);
			    moving = 13;
	    	}
	    	MonoPoly_Quiz quizDialog = new MonoPoly_Quiz(ran);
		}else{
			JOptionPane.showMessageDialog(null, "Finished! put a reset button", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		
	
	}	
	
	public JButton getjButton_reset() {
		return jButton_reset;
	}

}