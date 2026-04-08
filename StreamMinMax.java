package streamminmax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> list=Arrays.asList(12,1,4,100,200,150,45,67,99);
		List<Integer> sortedList=list.stream().sorted((a,b)->1).toList();
		System.out.println(list);
		System.out.println(sortedList);
		Optional<Integer> result=list.stream().min((a,b)->1);
		result.ifPresent(System.out::println);*/
		List<Integer> list=Arrays.asList(5,10,15,20,25,30,35,40,45);
		List<Integer> sortedList=list.stream().sorted((a,b)->0).toList();
		System.out.println(list);
		System.out.println(sortedList);
		/* 1. Optional<Integer> result=list.stream().min((a,b)->a-b);
		result.ifPresent(System.out::println);*/
		/* 2. Optional<Integer> result=list.stream().min((a,b)->b-a);
		result.ifPresent(System.out::println);*/
		/* 3. Optional<Integer> result=list.stream().distinct().min((a,b)->b-a);
			result.ifPresent(System.out::println);*/
		/* 4. Optional<Integer> result=list.stream().limit(4).min((a,b)->b-a);
		result.ifPresent(System.out::println);*/
		/* 5. Optional<Integer> result=list.stream().skip(3).min((a,b)->b-a);
		result.ifPresent(System.out::println);*/
		/* 6.Optional<Integer> secondMin = list.stream().distinct().sorted().skip(1).findFirst();
secondMin.ifPresent(System.out::println);*/
		/* 7.Optional<Integer> secondMax=list.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		secondMax.ifPresent(System.out::println);*/
		/*9. Optional<Integer> result=list.stream().limit(3).sorted().min((a,b)->a-b);
		result.ifPresent(System.out::println);*/
		/*10. Optional<Integer> result=list.stream().distinct().min((a,b)->b-a);
		result.ifPresent(System.out::println);*/
		/*11. Optional<Integer> result=list.stream().skip(5).limit(3).min((a,b)->a-b);
		result.ifPresent(System.out::println);*/
		/*12. List<String> names=Arrays.asList("Ram","Amit","Shyam","Zoya");
		Optional<String> result1=names.stream().min((a,b)->a.compareTo(b));
		result1.ifPresent(System.out::println);*/
		/*13. List<String> names=Arrays.asList("Ram","Amit","Shyam","Zoya");
			Optional<String> result1=names.stream().max((a,b)->a.compareTo(b));
			result1.ifPresent(System.out::println);*/
		/*14. List<String> names=Arrays.asList("Ram","Amit","Shyam","Zoya","Zoya","Ram");
		Optional<String> result1=names.stream().distinct().min((a,b)->a.length()-b.length());
		result1.ifPresent(System.out::println);*/
		
		}

}
