package constructor;

public class Student {
	int id;
	String name;
	
	Student() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.id=3;
		s1.name="Sonal";
		System.out.println(s1.id+" "+s1.name); //printing members with a white space.Student s1 = new Student();
		s1.id=2;
		s1.name="Netrangi";
		System.out.println(s1.id+" "+s1.name); //printing members with a white space.
	}

}
