import java.util.*; 

public class Ex01{
	public static void main(String... args){
		
		Student s1 = new Student("A",2011,95);
		Student s2 = new Student("B",2011,98);
		Student s3 = new Student("C",2011,82);
		
		
		List<Student> students = new ArrayList<>(); 
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		double highestScore = 0.0; 
		
		for(Student s : students){
			if(s.getGradYear() == 2011){
				if(s.getScore() > highestScore){
					highestScore = s.getScore();
				}
			}
		} 
		
		System.out.println("Highest grade is " + highestScore);
	}
	
}