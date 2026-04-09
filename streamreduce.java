package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
    /*    List<Integer> list = Arrays.asList(34, 12, 45, 76, 34, 56, 54, 32);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum=" + sum);
        double avg=sum/list.size();
        System.out.println("Avg="+avg);*/
    	/* List<Integer> list = Arrays.asList(10,20,30,40,5);

         int sum = list.stream().reduce(0,(a,b)->a+b);
         System.out.println("Sum=" + sum);*/
    /*	List<Integer> list = Arrays.asList(1,2,3,4,5);

        int mul = list.stream().reduce(1,(a,b)->a*b);
        System.out.println("mul=" + mul);
    	*/
    	/*List<Integer> list = Arrays.asList(12,45,7,89,23,56);

        int max = list.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max=" + max);*/
    	/*List<Integer> list = Arrays.asList(12,45,7,89,23,56);

        int min = list.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println("Min=" + min);*/
    	/*List<Integer> list = Arrays.asList(12,45,7,89,23,56);

        int count = list.stream().reduce(0,(a,b)->a+1);
        System.out.println("Count=" + count);*/
    	/*List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88);
    	int sum = list.stream()
    	              .filter(n -> n % 2 == 0)
    	              .reduce(0, (a, b) -> a + b);
    	System.out.println("Sum of Even Numbers = " + sum);
    	*/
    	/*List<String> list=Arrays.asList("Java","Stream","API","Reduce");
    	String finalList=list.stream().reduce("",(a,b)->a+" "+b);
    	System.out.println(finalList);*/
    	/*List<Integer> list = Arrays.asList(1,2,3,4,5,6);

    	int square = list.stream()
    	              .map(n -> n * n)
    	              .reduce(0, (a, b) -> a + b);
    	System.out.println("Square of  Numbers = " + square);*/
    	/*List<Integer> list = Arrays.asList(12,45,7,89,23,56);

        int max = list.stream().reduce(0,(a,b)->a>b?a:b);
        int Smax=list.stream().reduce(0, (a,b)->a>b&&a<max?a:b);
        System.out.println("Second Max="+Smax);*/
    	/*List<Integer> list = Arrays.asList(12,45,7,89,23,56);

        int min = list.stream().reduce(100,(a, b) -> a < b ? a : b);
       
        int Smin=list.stream().reduce(0, (a,b)->a>b&&a<min?a:b);
        System.out.println("Second Max="+Smin);*/
       /* List<String> list=Arrays.asList("Java","Stream","Programming","Functional");
    	int finalList=list.stream()
                .map(s -> s.length())
                .reduce(0, (a, b) -> a + b);
    	System.out.println(finalList);*/
    	List<Integer> list=Arrays.asList(12,34,56,78);
    	//int res=list.stream().reduce(0, (a,b)->a+(b%10)+(b-b%10)/10);
    	int value=123456;
    	int res=String.valueOf(value).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
    	System.out.println(res);
    }
}
