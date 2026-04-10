package streamsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*List<Integer> list=Arrays.asList(23,12,1,45,23,76,26,91);
System.out.println(list);
List<Integer> descsortedList=list.stream().sorted((a,b)->b-a).toList();//Descending formula
System.out.println(descsortedList);
List<Integer> ascsortedList=list.stream().sorted((a,b)->a-b).toList();//Ascending formula , we can normally use sorted () as it can give default ascending order
//we can also use .sorted(Comparator.reverseOrder())
System.out.println(ascsortedList);*/
	/* 1.	List<Integer> list=Arrays.asList(12,5,33,9,21,1);
		System.out.println(list);
		List<Integer> ascsortedList=list.stream().sorted((a,b)->a-b).toList();
		System.out.println(ascsortedList);*/
	/* 2.	List<Integer> list=Arrays.asList(12,5,33,9,21,1);
		System.out.println(list);
		List<Integer> descsortedList=list.stream().sorted((a,b)->b-a).toList();
		System.out.println(descsortedList);*/
	/* 3.	List<Integer> list=Arrays.asList(12,5,33,9,21,1);
		System.out.println(list);
		List<Integer> top3List=list.stream().sorted((a,b)->b-a).limit(3).toList();//.skip(list.size()-k)
		System.out.println(top3List);*/
   /*     4. List<Integer> list=Arrays.asList(12,5,33,9,21,1);
		System.out.println(list);
		List<Integer> evenList=list.stream().sorted().filter(a->a%2==0).toList();
		System.out.println(evenList);*/
	/* 6.	List<Integer> list=Arrays.asList(10,5,10,7,5,3,8,3);
		System.out.println(list);
		List<Integer> removeDuplicates=list.stream().distinct().sorted().toList();
		System.out.println(removeDuplicates);*/
	/* 7.	List<Integer> list=Arrays.asList(12,5,33,9,21,1);
		System.out.println(list);
		Integer secondHighest=list.stream().sorted((a,b)->b-a).toList().get(1);
		System.out.println(secondHighest);*/
    /* 8.	List<Integer> list=Arrays.asList(8,26,13,41,19,32,5);
		System.out.println(list);
		List<Integer> max20=list.stream().filter(a->a>20).sorted().toList();
		System.out.println(max20);*/
	/* 10.	List<String> names=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
		System.out.println(names);
		List<String> snames=names.stream().sorted().toList();
		System.out.println(snames);*/
	/*11.	List<String> names=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
		System.out.println(names);
		List<String> sortedList=names.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println(sortedList);*/
	/* 12.	List<String> names=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
		System.out.println(names);
		List<String> sortedList=names.stream().sorted((a,b)->b.length()-a.length()).toList();
		System.out.println(sortedList);*/
	/* 13.	List<Integer> list=Arrays.asList(25,14,50,33,45,18,60);
		System.out.println(list);
		List<Integer> fiveList=list.stream().sorted().filter(a->a%5==0).toList();
		System.out.println(fiveList);*/
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Aman",20000,"IT"));
		list.add(new Employee(1,"Anand",22000,"ME"));
		list.add(new Employee(1,"Abhishek",30000,"CSE"));
		list.add(new Employee(1,"Alok",28000,"HR"));
		List<Employee> sortedList=list.stream()
				.sorted((e1,e2)->e1.salary-e2.salary)
				.toList();
		sortedList.forEach(System.out::println);;
	}

}
class Employee{
	int id;
	String name;
	int salary;
	String dept;
	Employee(int id , String name , int salary, String dept){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
