package team8_OOPproject;

import java.io.Serializable;

public class QuestionType implements Serializable{
	private String question;
	private String remark;
	private String explain;
	private String answer1;
	private String answer2;
	private String answer3;
	private String correct;
	
	public QuestionType(String question, String remark, String explain, String answer1, String answer2, String answer3, String correct){
		super();
		this.question = question;
		this.remark = remark;
		this.explain = explain;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.correct = correct;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String answer) {
		this.explain = answer;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	
	@Override
	public String toString() { 
		return question;
	}
}
