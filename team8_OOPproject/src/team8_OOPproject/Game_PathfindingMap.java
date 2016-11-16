package team8_OOPproject;

import java.awt.Color;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game_PathfindingMap extends JPanel implements MouseMotionListener,MouseListener,ActionListener{
	private JButton bar_mg;
	private JButton u_mg;
	private JButton rotation1;
	private JButton rotation2;
	private JButton jButton_back;
	private JButton jButton_reset;
	private JButton jButton_next;


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
	
	private int xPos;
	private int yPos;

	Game_Character sc;

	public Game_PathfindingMap()
	{
		sc =new Game_Character(105,290,"MainMagnet.PNG");

		this.setSize(800,600);
        back = new JLabel();
		

        bar_mg = new JButton("",icon1);
        u_mg= new JButton("",icon2);
		rotation1 = new JButton("",icon);
		rotation2= new JButton("",icon);
		jButton_reset = new JButton("Reset");
		jButton_next = new JButton("Next");

		bar_mg.setBounds(620, 80, 60, 30);
		u_mg.setBounds(620, 150, 50,50);
		rotation1.setBounds(700, 50, 70, 70);
		rotation2.setBounds(700, 150, 70, 70);
		jButton_reset.setBounds(600,480,80,80);
		jButton_next.setBounds(700, 480, 80, 80);
		
		this.add(rotation1);
		this.add(rotation2);
		this.add(bar_mg);
		this.add(u_mg);
		this.add(sc);
		this.add(jButton_reset);
		this.add(jButton_next);
	    
		rotation1.addMouseListener(this);
		rotation2.addMouseListener(this);
		bar_mg.addMouseMotionListener(this);
		bar_mg.addMouseListener(this);
		u_mg.addMouseListener(this);
		u_mg.addMouseMotionListener(this);
		jButton_reset.addActionListener(this);
		jButton_next.addActionListener(this);
		
		//return to previous panel
		jButton_back = new JButton("Back");
		jButton_back.addActionListener(this);
		jButton_back.setBackground(Color.white);
		jButton_back.setBounds(20, 20, 80, 30);
		this.add(jButton_back);
		
		background = new ImageIcon("pathFinding2.png");
	    this.back.setBounds(0,0, this.getWidth(), this.getHeight());
		this.back.setIcon(background);
		this.add(back);
		this.setLayout(null);
		
		this.setVisible(true);	
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(rotation1)){
			if(bar_rotation%2 == 0){
				this.repaint();
				this.remove(bar_mg);
				bar_mg = new JButton("",icon1_1);
				this.add(bar_mg);
				this.repaint();
				bar_mg.setVisible(true);
				bar_mg.setBounds(620,80,60,30);
				bar_rotation++;
				bar_mg.addMouseMotionListener(this);
				bar_mg.addMouseListener(this);
				this.add(back);
			}
			else{
				this.repaint();
				this.remove(bar_mg);
				bar_mg = new JButton("",icon1);
				this.add(bar_mg);
				bar_mg.setBounds(620,80,60,30);
				bar_rotation++;
				bar_mg.addMouseListener(this);
				bar_mg.addMouseMotionListener(this);
				this.add(back);
			}
		}
		else if(e.getSource().equals(rotation2)){
			if(u_rotation %2 ==0){
				this.repaint();
				this.remove(u_mg);
				u_mg = new JButton("",icon2_1);
				this.add(u_mg);
				u_mg.setBounds(620, 150, 50,50);
				u_rotation++;
				u_mg.addMouseListener(this);
				u_mg.addMouseMotionListener(this);
				this.add(back);
			}
			else{
				this.repaint();
				this.remove(u_mg);
				u_mg = new JButton("",icon2);
				this.add(u_mg);
				u_mg.setBounds(620, 150, 50,50);
				u_rotation++;
				u_mg.addMouseListener(this);
				u_mg.addMouseMotionListener(this);
				this.add(back);
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
		if(bar_mg.contains(e.getX(), e.getY()) ){//���� ��ġ�� ���Եȴٸ�
			isDragged1 = true;
			isDragged2 = false;
			//
			offX = e.getX() - bar_mg.getX();   //������ - �ڼ� ��ġ
			offY = e.getY() - bar_mg.getY();
		}
		else if(u_mg.contains(e.getX(), e.getY() ) ){
			isDragged1 = false;
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
		double ch = CheckPosition();
		int x, y;
		x = sc.getX() /110;
		y = sc.getY() /300;
		map s = new map();
		int m;
		int r_l = 98;
		int u_d = 103;
		if(ch == 1.0 && x== 0&&y== 1){//1
			sc.moving_U(sc.getX(),sc.getY(),u_d);/*sc.setLocation(105, 270);*/
		}else if(ch == 2.0 && x == 0 && y == 0 ){//2
			sc.moving_D(sc.getX(),sc.getY(),u_d);/*sc.setLocation(105, 375);*/
		}else if(ch == 2.1 && x == 2 && y == 1 ){//2
			m = s.moveL_Magnet(y, x);
			for(int i = 0; i <m-1 ;i++)
				sc.moving_L(sc.getX(),sc.getY(),r_l);/*sc.setLocation(105, 375);*/
		}else if(ch == 3.0&&x==2&&y==0){//3
			sc.moving_D(sc.getX(),sc.getY(),u_d);/*sc.setLocation(305, 375);*/
		}else if(ch == 3.1&&x==0&&y==1){//3
			m = s.moveR_Magnet(y, x);
			for(int i = 0; i <m-1 ;i++)
				sc.moving_R(sc.getX(),sc.getY(),r_l);/*sc.setLocation(305, 375);*/
		}else if(ch == 4.0&& x== 2 && y== 1){//4
			sc.moving_U(sc.getX(),sc.getY(),u_d);/*sc.setLocation(305, 270);*/
		}else if(ch == 4.1&& x== 4 && y==0){//4
			m = s.moveL_Magnet(y, x);
			for(int i = 0; i <m-1 ;i++)
				sc.moving_L(sc.getX(),sc.getY(),r_l);/*sc.setLocation(305, 270);*/
		}else if(ch == 5.1&&x==2&&y==0){//5
			m = s.moveR_Magnet(y, x);
			for(int i = 0; i <m-1 ;i++)
				sc.moving_R(sc.getX(),sc.getY(),r_l);/*sc.setLocation(500,270);*/
		}else if(ch == 6.0&&x==4 &&y==0){//6
			sc.moving_D(sc.getX(),sc.getY(),u_d);/*sc.setLocation(500,375);*/
			JOptionPane.showMessageDialog(null, "Success!", "Message", JOptionPane.INFORMATION_MESSAGE); // show

		}
	}



/*	public JFrame getPathGame() {
		return pathGame;
	}


	public void setPathGame(JFrame pathGame) {
		this.pathGame = pathGame;
	}*/


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == jButton_reset) { // reset button
			sc.setLocation(105,290);
			bar_mg.setLocation(620,80);
			u_mg.setLocation(620,150);
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	/*
	* 1��                                                                               6 u_inv//
	* 2��                        bar_inv 2-1// 1 u_
	* 3�� bar�� 2-1//              3 u_
	* 4��bar 1-2//                          8 u_inv//
	* 5��                       bar_inv 1-2//           10 u_inv//
	* 6��                                                     5 u_
	* */
	
	public double CheckPosition()
	{
		if(bar_rotation %2 == 1){//inv	
		    if(bar_mg.getX()>= 10 && bar_mg.getX()<= 70 && bar_mg.getY() <= 440 &&bar_mg.getY() >= 360)
			    return 2.1; //ok
		 	else if(bar_mg.getX()>= 590 && bar_mg.getX()<= 670 && bar_mg.getY() <= 340 &&bar_mg.getY() >= 260)
				return 5.1; //ok
		}
		else if(bar_rotation %2 == 0){
	        if(bar_mg.getX()>= 0 && bar_mg.getX()<= 70 && bar_mg.getY() <= 480 &&bar_mg.getY() >= 360)
		        return 3.1; //ok
		    else if(bar_mg.getX()>= 590 && bar_mg.getX()<= 670 && bar_mg.getY() <= 340 &&bar_mg.getY() >= 260)
				return 4.1; //ok
		}
		
		if(u_rotation % 2 == 1){ //inv
		    if(u_mg.getX() >= 70 && u_mg.getX()<= 170 && u_mg.getY() <= 560 &&u_mg.getY() >= 450)
		        return 1.0; //ok
			else if(u_mg.getX() >= 270 && u_mg.getX()<= 370 && u_mg.getY() <= 560 &&u_mg.getY() >= 450)
			    return 4.0; //ok
			/*else if(u_mg.getX() >= 470 && u_mg.getX()<= 570 && u_mg.getY() <= 560 &&u_mg.getY() >= 450)
			    return 5.0; //ok*/		
		    }
		else if(u_rotation % 2 == 0){
			if(u_mg.getX() >= 70 && u_mg.getX()<= 170 && u_mg.getY() <= 260 &&u_mg.getY() >= 140)
			    return 2.0; //ok
			else if(u_mg.getX() >= 271 && u_mg.getX()<= 370 && u_mg.getY() <= 260 &&u_mg.getY() >= 140)
			    return 3.0; //ok
			else if(u_mg.getX() >= 471 && u_mg.getX()<= 570 && u_mg.getY() <= 260 &&u_mg.getY() >= 140)
			    return 6.0; //ok
		}
		return -1;
	}



	public JButton getjButton_back() {
		return jButton_back;
	}


	public void setjButton_back(JButton jButton_back) {
		this.jButton_back = jButton_back;
	}
	
	public JButton getjButton_reset() {
		return jButton_reset;
	}

	public void setjButton_reset(JButton jButton_reset) {
		this.jButton_reset = jButton_reset;
	}
	
	public JButton getjButton_next() {
		return jButton_next;
	}
	
	public void setjButton_next(JButton jButton_next) {
		this.jButton_next = jButton_next;
	}

}

