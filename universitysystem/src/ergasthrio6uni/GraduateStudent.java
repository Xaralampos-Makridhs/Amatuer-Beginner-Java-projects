package ergasthrio6uni;

public class GraduateStudent extends Student {
	private String supervisor;

	public GraduateStudent(String name,String id,String supervisor) {
		super(name,id);
		this.supervisor = supervisor;
	}
	
	public void printinfo() {
		super.printinfo();
		System.out.println("Supervisor:"+supervisor);
	}
	
	
	
	
}
