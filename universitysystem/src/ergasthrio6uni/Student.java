package ergasthrio6uni;
import java.util.ArrayList;

public class Student {
	private String name;
	private String id;
	private ArrayList<Course> courses;
	
	public Student(String name,String id) {
		this.name = name;
		this.id = id;
		this.courses=new ArrayList<>();
	}

	public void Addcourse(Course C) {
		courses.add(C);
	}
	
	public void printinfo() {
		System.out.println("------------");
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
			for(Course C:courses) {
				System.out.println("Name of the course:"+C.getName()+ " ECTS:"+C.getEcts());
			}
			System.out.println("Number of Courses:"+courses.size());//synarthsh ths arraylist gia na metraei posa stoixeia exei h lista
	}
	
	
}
