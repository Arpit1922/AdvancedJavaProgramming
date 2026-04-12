package switchp;

public class MainYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int day=3;
switch(day) {
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
	default:
		System.out.println("Invalid");
}
String result=switch(day) {
case 1,3,4->{
	System.out.println("This is 1,3,4");
	yield "MOnday";
}
case 2->"TUesday";
default ->"Invalid";
};
System.out.println(result);
	}

}
