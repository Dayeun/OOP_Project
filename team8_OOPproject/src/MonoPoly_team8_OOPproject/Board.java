package MonoPoly_team8_OOPproject;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Board extends JPanel{
	
	
	Square[][] map;
	int level=10;
	
	public Board() {
		setLayout(new GridLayout(level, level, 0, 0));
		
	}
	
	
	
	/**
	public Board(int level){
	
		map= new Square[level][];
		Square s= new Square();
		for(int i = 0; i< level; i++){
			for(int j=0; j<level; j++){
		//		add(s);
		
		}
		*/	
		public void display(){
			
			for(int row=0 ; row < level; row++){	
			for(int column= 0; column< level; column++){
				add(new Square(row, column));
			}
		}
			
	}	
				
		/**
		//
		
		//Board.add(map);
		setLayout(new GridLayout(level, level, 5, 5));
		
		
		
		for(int i=0; i<level; i++){
		
		}
	}
	
	private void paintCompoenet(Graphics g) {	
		g.setColor(Color.RED);
		g.fillRect(level, 0, 50, 50);
	}
	
	*/
	
	public Square[] getMap() {
		return map;
	}
	
	public void setMap(Square[] map) {
		this.map = map;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
