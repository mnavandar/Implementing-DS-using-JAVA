
public class Person {
	private String name;
	private int rollno;
	private int size;
	public Person(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString(){
		return "Name: " +this.name + "Rollno:" +this.rollno;
	}

}
