package team8_OOPproject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class QuizReader {

	private String fileName;
	private Quiz[] quiz;

	public QuizReader(String fileName){
		
	}
	
	public QuizReader(){
		
	}

	public static void main(String[] args) {
		QuizReader qr= new QuizReader();
		Quiz[] q= qr.FileRead();
		for(int i=0; i<q.length; i++){
		System.out.println(q[i].getAnswer());
		System.out.println(q[i].loadImage(q[i].getImage()));
	}
	}
	public Quiz[] FileRead(){

		try {
			File quiz1 = new File("MonoPolyQuiz1");
			FileReader fr = new FileReader(quiz1);
			BufferedReader br= new BufferedReader(fr);
			String line;
			int number;
			ArrayList<String[]> arr= new ArrayList<String[]>();
			int i=0;
			line=br.readLine();
			number= Integer.parseInt(line);
			quiz= new Quiz[number];
			
			
				while((line= br.readLine())!=null){
					arr.add(line.split(";"));						
					
					if(line.equals("endOfquiz;")){
						quiz[i]= new Quiz();
						quiz[i].setRefernce((arr.get(0))[0]);
						quiz[i].setQuestion((arr.get(1))[0]);
						quiz[i].setImage((arr.get(2))[0]);
						quiz[i].setNumberOfbtn((arr.get(3))[0]);
						quiz[i].setOp1((arr.get(3))[1]);
						quiz[i].setOp2((arr.get(3))[2]);
						quiz[i].setOp3((arr.get(3))[3]);
						quiz[i].setAnswer((arr.get(4))[0]);
						arr.clear();
						i++;
					}
				
				}
						br.close();	
			}	catch (IOException e) {
		e.printStackTrace();
	}
		return quiz;
	}
	

	public Quiz getRandomQuiz(Quiz[] quiz){
		int rand = (int) Math.random()*quiz.length;
		Quiz ran= new Quiz();
		ran=quiz[rand];
		return ran;
	}
	
	
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Quiz[] getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz[] quiz) {
		this.quiz = quiz;
	}
	
}
