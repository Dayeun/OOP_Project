package team8_OOPproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game_Pathfinding extends JPanel implements ActionListener{
	private JLabel bar_mg;
	private JLabel u_mg;
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

	Game_Character sc;
	Pathfinding_map s;
	
	public Game_Pathfinding()
	{
		
		s = new Pathfinding_map();
		int r_l = 98;
		int u_d = 103;
		sc =new Game_Character(105,290,"MainMagnet.PNG");

		this.setSize(800,600);
        back = new JLabel();
		
        bar_mg = new JLabel(icon1);
        u_mg= new JLabel(icon2);
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
		
		bar_mg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				offX = e.getX() - bar_mg.getX();   
				offY = e.getY() - bar_mg.getY();
			}
			
			public void mouseReleased(MouseEvent e){
				int m;
				int x = sc.getX() /110;   // Main magnet x position
				int y = sc.getY() /300;   // Main magnet y position
				int[] bar = new Game_PathfindingPosition().CheckPosition(bar_mg.getX(),bar_mg.getY(),bar_rotation);
	
				
				if(bar[2] == 1){  
					if((bar[0] == 0) && (y == bar[1])){
						if(s.black_box(y) > x&&s.black_box(y)!= -1){
							m = s.moveL_Magnet(y, x);
					        for(int i = 0; i <m-1 ;i++)
				    	    	sc.moving_L(sc.getX(),sc.getY(),r_l);
						}			
					}
					else if((bar[0] == 6) && (y == bar[1])){ 
						if(s.black_box(y) < x &&s.black_box(y)!= -1);
			    			m = s.moveR_Magnet(y, x);
				        	for(int i = 0; i <m-1 ;i++)
					        	sc.moving_R(sc.getX(),sc.getY(),r_l);
					}
				}else if(bar[2] ==0){ 
					if((bar[0] == 0) && ( y == bar[1])){
						if(s.black_box(y) > x&&s.black_box(y)!= -1){
					    	m = s.moveR_Magnet(y, x);
				        	for(int i = 0; i <m-1 ;i++)
					        	sc.moving_R(sc.getX(),sc.getY(),r_l);
						}
					}else if((bar[0] == 6) && (y == bar[1])){  
						if(s.black_box(y) < x&&s.black_box(y)!= -1){
							m = s.moveL_Magnet(y, x);
					        for(int i = 0; i <m-1 ;i++)
					        	sc.moving_L(sc.getX(),sc.getY(),r_l);
						}		
					}
				}
				if(s.checkGoal(y, x) == 1){
					JOptionPane.showMessageDialog(null, "Success!", "Message", JOptionPane.INFORMATION_MESSAGE); // show
				}
			}
		});
		
		bar_mg.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				bar_mg.setLocation(e.getX()-offX, e.getY()-offY);
			}
		});
		
	
		
		u_mg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
		    	offX = e.getX() - u_mg.getX();   
		    	offY = e.getY() - u_mg.getY();
		    }	
			
			public void mouseReleased(MouseEvent e){
				int x = sc.getX() /110;   // Main magnet x position
				int y = sc.getY() /300;   // Main magnet y position
				int[] u = new Game_PathfindingPosition().CheckPosition_(u_mg.getX(),u_mg.getY(),u_rotation);
				
				if(u[2] == 1){ 
					if((x == u[0] - 1)&& (y == u[1] - 1 )){
					    sc.moving_U(sc.getX(),sc.getY(),u_d);
					}		  
				}else if(u[2] == 0){ //위에서 아래로
					if((x == u[0] - 1)&& (y == u[1])){
					    sc.moving_D(sc.getX(),sc.getY(),u_d);
					}	
				}
				
				if(s.checkGoal(y, x) == 1){
					JOptionPane.showMessageDialog(null, "Success!", "Message", JOptionPane.INFORMATION_MESSAGE); // show
				}
			}
		});
		
		u_mg.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				u_mg.setLocation(e.getX()-offX, e.getY()-offY);
			}
		});
		
		rotation1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bar_rotation%2 == 0)
					bar_mg.setIcon(icon1_1);
				else
					bar_mg.setIcon(icon1);			
				bar_mg.setBounds(620,80,60,30);
				bar_rotation++;				
			}
		});
		
		rotation2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(u_rotation %2 ==0)
					u_mg.setIcon(icon2_1);
				else
					u_mg.setIcon(icon2);			
				u_mg.setBounds(620, 150, 50,50);
				u_rotation++;	
			}
		});
		
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
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == jButton_reset) { // reset button
			sc.setLocation(105,290);
			bar_mg.setLocation(620,80);
			u_mg.setLocation(620,150);
		}
		
	}


	public JButton getjButton_back() {
		return jButton_back;
	}


	public void setjButton_back(JButton jButton_back) {
		this.jButton_back = jButton_back;
	}

}

