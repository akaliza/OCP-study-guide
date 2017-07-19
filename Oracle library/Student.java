import java.util.*; 

public class Student{
	private String name;
	private int year; 
	private double score; 

	public Student(String name, int year, double score){
		this.name  = name;
		this.year  = year;
		this.score = score; 
	}
	
	public double getScore(){
		return this.score;
	}
	
	public int getGradYear(){
		return this.year; 
	}

	

}