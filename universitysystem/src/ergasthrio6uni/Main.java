package ergasthrio6uni;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// me bash ton constructor dhmiourgw antikeimena
		
		//mathimata
		Course c1=new Course("Antikeimenostrefhs",5);
		Course c2=new Course("Diadikastikos",10);
		
		//foithths
		Student s1=new Student("Xarhs","iis24166");
		s1.Addcourse(c1);
		s1.Addcourse(c2);
		
		//metaptyxiakos
		GraduateStudent gs1=new GraduateStudent("Stelos","ics24032","Xinogalos");
		gs1.Addcourse(c1);
		
		//eisagwgh foithtwn sthn lista
		ArrayList<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(gs1);
		
		//eisagwgh dedomenwn
		DataEntry.readData(students);
		
		for(Student s:students) {
			s.printinfo();
		}
		
		
		
		
	}

}
