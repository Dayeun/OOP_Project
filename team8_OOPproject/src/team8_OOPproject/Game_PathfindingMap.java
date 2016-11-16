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
	Game_Character sc;
	
	boolean isDragged1 =false;
	boolean isDragged2 =false;
	int offX ,offY;


	public Game_PathfindingMap()
	{
		sc =new Game_Character(105,270,"MainMagnet.PNG");
		/*Game_Character bar_mg =new Game_Character(670,100,"barmagnet.PNG")
		Game_Character u_mg =new Game_Character(700,200,"umagnet.PNG");*/

		pathGame= new JFrame();
		pathGame.setBounds(120,120,800,600);
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
		double ch = CheckPosition();
		int x, y;
		x = sc.getX() /110;
		y = sc.getY() /300;
		System.out.println(x+"---"+y +"--"+ch);
		map s = new map();
		int r = s.moveR_Magnet(y, x);
		int l = s.moveL_Magnet(y, x);
		if(ch == 1.0 && x== 0&&y== 1){//1
			sc.moving_U(sc.getX(),sc.getY());/*sc.setLocation(105, 270);*/
		}else if(ch == 2.0 && x == 0 && y == 0 ){//2
			sc.moving_D(sc.getX(),sc.getY());/*sc.setLocation(105, 375);*/
		}else if(ch == 2.1 && x == 2 && y == 1 ){//2
			for(int i = 0; i <l-1 ;i++)
				sc.moving_L(sc.getX(),sc.getY());/*sc.setLocation(105, 375);*/
		}else if(ch == 3.0&&x==2&&y==0){//3
			sc.moving_D(sc.getX(),sc.getY());/*sc.setLocation(305, 375);*/
		}else if(ch == 3.1&&x==0&&y==1){//3
			for(int i = 0; i <r-1 ;i++)
				sc.moving_R(sc.getX(),sc.getY());/*sc.setLocation(305, 375);*/
		}else if(ch == 4.0&& x== 2 && y== 1){//4
			sc.moving_U(sc.getX(),sc.getY());/*sc.setLocation(305, 270);*/
		}else if(ch == 4.1&& x== 4 && y==0){//4
			for(int i = 0; i <l-1 ;i++)
				sc.moving_L(sc.getX(),sc.getY());/*sc.setLocation(305, 270);*/
		}else if(ch == 5.1&&x==2&&y==0){//5
			for(int i = 0; i <r-1 ;i++)
				sc.moving_R(sc.getX(),sc.getY());/*sc.setLocation(500,270);*/
		}else if(ch == 6.0&&x==4 &&y==0){//6
			sc.moving_D(sc.getX(),sc.getY());/*sc.setLocation(500,375);*/
		}
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

	/*
	* 1번                                                                               6 u_inv//
	* 2번                        bar_inv 2-1// 1 u_
	* 3번 bar가 2-1//              3 u_
	* 4번bar 1-2//                          8 u_inv//
	* 5번                       bar_inv 1-2//           10 u_inv//
	* 6번                                                     5 u_
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
			    return 5.0; //ok
*/		}
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
	
}