package java16;

import java.util.*;
import java.util.stream.Collectors;

public class MainRecords {
record Student(int sid,String name,String course) {};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Student1","MCA");
		System.out.println(s.sid());	
		System.out.println(s.name());
		System.out.println(s.course());
		System.out.println(s);*/
		int[] data=new int[] {1,2,3,4};
		List<int[]> listData=Arrays.asList(data);
		System.out.println(listData.get(0)[1]);
		List<Integer> listData2=Arrays.stream(data).boxed().toList();
		System.out.println(listData2);
		listData2.forEach((value)->System.out.println(value));
		listData2.forEach(System.out::println);
	}

}
