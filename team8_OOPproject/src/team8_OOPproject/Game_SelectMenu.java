package team8_OOPproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game_SelectMenu extends JFrame implements MouseListener{

	private JButton bMonopolyG;
	private JButton bPathFindingG;
	private JButton back;
	private JLabel jlabel_background;
	private ImageIcon background;

	ImageIcon icon1 = new ImageIcon("homeIcon.PNG");
	
	public Game_SelectMenu() {
	
		setBounds(555,235,800,600);
		
		jlabel_background = new JLabel();
		
		bMonopolyG = new JButton("MonoPoly");
		bPathFindingG = new JButton("Path Finding");
		back = new JButton("Back",icon1);
		
		bPathFindingG.setBackground(Color.ORANGE);
		bMonopolyG.setBackground(Color.ORANGE);
		back.setBackground(Color.white);
	
		bMonopolyG.setBounds(230, 300, 350, 60);
		bPathFindingG.setBounds(230, 400, 350, 60);
		back.setBounds(25, 25, 55, 55);
		
		bMonopolyG.addMouseListener(this);
		bPathFindingG.addMouseListener(this);
	/*	back.addMouseListener(this);*/
		
		this.add(bMonopolyG);
		this.add(bPathFindingG);
		this.add(back);
		
		background = new ImageIcon("backSelect.png");
		this.jlabel_background.setBounds(0,0, this.getWidth(), this.getHeight());
		this.jlabel_background.setIcon(background);
		this.add(jlabel_background);
				
		setVisible(true);	
	}

	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getSource().equals(bMonopolyG)){
			
		}
		else if(e.getSource().equals(bPathFindingG)){
			new Game_Pathfinding();
			dispose();
		}
		else if(e.getSource().equals(back)){
			
		}
	}
	@Override
	public void mouseEntered(MouseEvent e){}
	@Override
	public void mouseExited(MouseEvent e){}
	@Override
	public void mousePressed(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e){}
}