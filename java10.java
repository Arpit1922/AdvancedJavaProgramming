package java10;

public class MainVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable type inference
		int a=10;
		var b=20;//after java10 we can use var as datatype
		
		var value=10.34;
		//type inference can be done at a time of declaration
		//we cannot create instance variable using var
		var c=0.0;
		c=39.56;
		String name=new String("This is string");
		var name1=new String("This is string with var");
		int[] arr= {0,1,2,3};
		for(var a1:arr) {
			System.out.println(a1);
		}
	}

}
