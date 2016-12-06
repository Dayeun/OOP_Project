package team8_OOPproject;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JLabel;

class MonoPoly_Quiz extends JDialog{
	private JLabel question;
	 
    public MonoPoly_Quiz(int ran){
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		this.setResizable(false);
		this.setSize(600,400);
		
		int x = (dim.width / 2) - (this.getWidth() / 2);
		int y = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(x, y);
    	this.setTitle("Quiz");
    	
    	question = new JLabel("Your dice number is : "+ran);
    	this.add(question);
             
        this.setModal(true);
        this.setVisible(true);
           
    }
}