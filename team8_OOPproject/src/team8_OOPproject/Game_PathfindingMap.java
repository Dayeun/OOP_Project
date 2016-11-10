package team8_OOPproject;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game_PathfindingMap implements MouseMotionListener,MouseListener,ActionListener{
	private JFrame pathGame;
	private JButton bar_mg;
	private JButton u_mg;
	private JButton rotation1;
	private JButton rotation2;

	private JLabel back;


	private ImageIcon background;
	
	private int bar_rotation = 0;
	private int u_rotation = 0;
	
	ImageIcon icon1 = new ImageIcon("barmagnet.PNG");
	ImageIcon icon1_1 = new ImageIcon("barmagnetInv.PNG");
	ImageIcon icon2= new ImageIcon("umagnet.PNG");
	ImageIcon icon2_1= new ImageIcon("umagnetInv.PNG");
	ImageIcon icon = new ImageIcon("rotation.PNG");
	
	boolean isDragged1 =false;
	boolean isDragged2 =false;
	int offX ,offY;


	public Game_PathfindingMap()
	{
		Game_Character sc =new Game_Character(105,270,"MainMagnet.PNG");
		/*Game_Character bar_mg =new Game_Character(670,100,"barmagnet.PNG")
		Game_Character u_mg =new Game_Character(700,200,"umagnet.PNG");*/
		
		pathGame= new JFrame();
		pathGame.setBounds(555,235,800,600);
        back = new JLabel();
		

        bar_mg = new JButton("",icon1);
        u_mg= new JButton("",icon2);
		rotation1 = new JButton("",icon);
		rotation2= new JButton("",icon);

		bar_mg.setBounds(620, 80, 60, 30);
		u_mg.setBounds(620, 150, 50,50);
		rotation1.setBounds(700, 50, 70, 70);
		rotation2.setBounds(700, 150, 70, 70);
		
		pathGame.add(rotation1);
		pathGame.add(rotation2);
		pathGame.add(bar_mg);
	    pathGame.add(u_mg);
		pathGame.add(sc);
	    
		rotation1.addMouseListener(this);
		rotation2.addMouseListener(this);
		bar_mg.addMouseMotionListener(this);
		bar_mg.addMouseListener(this);
		u_mg.addMouseListener(this);
		u_mg.addMouseMotionListener(this);
		background = new ImageIcon("PathFinding.png");
	    this.back.setBounds(0,0, pathGame.getWidth(), pathGame.getHeight());
		this.back.setIcon(background);
		pathGame.add(back);
		
		pathGame.setVisible(true);	
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(rotation1)){
			if(bar_rotation%2 == 0){
				pathGame.repaint();
				pathGame.remove(bar_mg);
				bar_mg = new JButton("",icon1_1);
				pathGame.add(bar_mg);
				pathGame.repaint();
				bar_mg.setVisible(true);
				bar_mg.setBounds(620,80,60,30);
				bar_rotation++;
				bar_mg.addMouseMotionListener(this);
				bar_mg.addMouseListener(this);
				pathGame.add(back);
			}
			else{
				pathGame.repaint();
				pathGame.remove(bar_mg);
				bar_mg = new JButton("",icon1);
				pathGame.add(bar_mg);
				bar_mg.setBounds(620,80,60,30);
				bar_rotation++;
				bar_mg.addMouseListener(this);
				bar_mg.addMouseMotionListener(this);
				pathGame.add(back);
			}
		}
		else if(e.getSource().equals(rotation2)){
			if(u_rotation %2 ==0){
				pathGame.repaint();
				pathGame.remove(u_mg);
				u_mg = new JButton("",icon2_1);
				pathGame.add(u_mg);
				u_mg.setBounds(620, 150, 50,50);
				u_rotation++;
				u_mg.addMouseListener(this);
				u_mg.addMouseMotionListener(this);
				pathGame.add(back);
			}
			else{
				pathGame.repaint();
				pathGame.remove(u_mg);
				u_mg = new JButton("",icon2);
				pathGame.add(u_mg);
				u_mg.setBounds(620, 150, 50,50);
				u_rotation++;
				u_mg.addMouseListener(this);
				u_mg.addMouseMotionListener(this);
				pathGame.add(back);
			}
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
		if(bar_mg.contains(e.getX(), e.getY()) ){//누른 위치가 포함된다면
			isDragged1 = true;
			//
			offX = e.getX() - bar_mg.getX();   //누른곳 - 자석 위치
			offY = e.getY() - bar_mg.getY();
		}
		else if(u_mg.contains(e.getX(), e.getY() ) ){
			isDragged2 = true;
			offX = e.getX() - u_mg.getX();
			offY = e.getY() - u_mg.getY();
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(isDragged1)
			bar_mg.setBounds(e.getX() - offX, e.getY() - offY, 60, 30);
		else if(isDragged2)
			u_mg.setBounds(e.getX() - offX, e.getY() - offY, 50, 50);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		isDragged1 = false;
		isDragged2 = false;
	}


	public JFrame getPathGame() {
		return pathGame;
	}


	public void setPathGame(JFrame pathGame) {
		this.pathGame = pathGame;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

