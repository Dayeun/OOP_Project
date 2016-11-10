package team8_OOPproject;
import java.io.Serializable;

public class UserInformation implements Serializable{
	
	private String id;
	private String password;
	private String name;
	private int score; 

	public UserInformation() {
	}

	public UserInformation(String id, String password, String name, int score) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.score = score;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() { 
		return id + ","+password + ","+ name + "," + score;
	}
	
}
