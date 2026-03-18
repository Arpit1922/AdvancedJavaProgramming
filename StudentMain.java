class Student {
    private String name;
    private String course;
    private int sid;
    public Student(String name , String course,int sid){
        super();
        this.name=name;
        this.course=course;
        this.sid=sid;
    }
    public int getSid(){
        return sid;
    }
    public void setSid(int sid){
        this.sid=sid;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
}
public class StudentMain {
    public static void main(String[] args){
        Student s1=new Student("Student1","MCA",1);
        s1.setSid(2);
        
    }
}
