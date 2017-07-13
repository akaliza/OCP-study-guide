import java.util.*; 
import java.util.function.Predicate;

public class Ex02{
	public static void main(String... args){
		
		Student s1 = new Student("A",2011,95);
		Student s2 = new Student("B",2011,98);
		Student s3 = new Student("C",2011,82);
		
		
		List<Student> students = new ArrayList<>(); 
		students.add(s1);
		students.add(s2);
		students.add(s3);
		double highestScore =  students
			.filter(new Predicate<Student>(){
				public boolean op(Student s){
					return s.getGradYear() == 2011;
				}	
			})
			.map(new Mapper<Student,Double>(){
				public Double extract(Student s){
					return s.getScore();
				}
			})
			.max();

		
		System.out.println("Highest grade is " + highestScore);
	}
	
}