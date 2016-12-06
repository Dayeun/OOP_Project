package MonoPoly_team8_OOPproject;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Die {

	private int faceValue;
	private boolean ready;
	private Image[] image;
	
	
	public Die(){
		
	}
	
	
	public void init(){
		image= new Image[6];
		
		for(int i=0; i<6; i++){
			image[i]= new ImageIcon("df"+i+".png").getImage();
		}
	}
	
	public void roll(){
		int i= (int) Math.random()*6+1;
		faceValue=i;
	}
	
	
	//getters and setters
	public Image[] getImage() {
		return image;
	}


	public void setImage(Image[] image) {
		this.image = image;
	}


	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	public boolean isReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	

	
	
	
}
