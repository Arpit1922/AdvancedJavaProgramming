import java.util.*;
class StudentName{
int id;
String name;
int age;

    public StudentName(int id, String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }

}
public class StudentDemo {
    public static void main(String[] args) {
     ArrayList<StudentName>student=new ArrayList<>();
     student.add(new StudentName(1,"Arpit",22));
     student.add(new StudentName(2,"Adarsh",23));
     student.add(new StudentName(3,"Abhinav",19));
     student.add(new StudentName(4,"Aman",21));
     student.add(new StudentName(5,"Anurag",20));
     System.out.println("Id\tName\tAge");
     for(StudentName s:student){
        System.out.println(s.id+"\t"+s.name+"\t"+s.age);
     }
    }
}
