package streamapi;
import java.util.*;
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("Aman",90,1));
        list.add(new Student("Arpit",70,2));
        list.add(new Student("Aryan",60,3));
        list.add(new Student("Adarsh",85,4));
        list.add(new Student("Ayush",49,5));
        list.add(new Student("Anurag",55,6));
        System.out.println("\tSid\t\tName\t\tMarks");
        list.stream()
        .filter(student->student.getMarks()>60)
        .forEach((student)->{
        	String result=String.format("\t%d\t\t%s\t\t%d", student.getSid(),student.getName(),student.getMarks());
        System.out.println(result);
	});

}
}
class Student{
	private String name;
	private int marks;
	private int sid;
	Student(String name, int marks,int sid){
		super();
		this.name=name;
		this.marks=marks;
		this.sid=sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", sid=" + sid + "]";
	}
}
