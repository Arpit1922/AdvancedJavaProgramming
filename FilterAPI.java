package streamapi;
import java.util.*;
import java.util.stream.Stream;
import java.util.function.Consumer;
public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Integer> list=new ArrayList<>();
	    list.add(22);
	    list.add(19);
	    list.addAll(List.of(11,12,1,18,27,30));
	    System.out.println(list);
	    Stream listStream=list.stream();
	   // listStream.forEach((element)->System.out.println(element));
	    listStream.forEach((element)->System.out.print(element+" "));
	   // listStream.forEach(System.out::println);
	    //list.stream().forEach(System.out::println);
	    System.out.println("Count="+list.stream().count());
	    list.stream().filter((n)->n>16).forEach((n)->System.out.print(n+" "));
	    List<Integer> g16=list.stream().filter((n)->n>16 && n<30).toList();
	    System.out.println();
	    System.out.println(g16);
	}

}
