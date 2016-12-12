package team8_OOPproject;

import java.io.File;

public class Quiz {

	
	private String refernce;
	private String number;
	private String question;
	private String image;
	private int numberOfbtn;
	private String op1, op2, op3;
	private String answer;
	
	public Quiz(){
		
	}
	
	
	public String loadImage(String image){
		File ifs= new File(image);
		return ifs.getAbsolutePath();
		
	}

	public String getRefernce() {
		return refernce;
	}

	public void setRefernce(String refernce) {
		this.refernce = refernce;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getNumberOfbtn() {
		return numberOfbtn;
	}

	public void setNumberOfbtn(int numberOfbtn) {
		this.numberOfbtn = numberOfbtn;
	}

	public void setNumberOfbtn(String numberOfbtn) {
		int btn=Integer.parseInt(numberOfbtn);
		this.numberOfbtn = btn;
	}
	
	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
