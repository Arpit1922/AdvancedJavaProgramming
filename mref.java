package mref;
class Calculator{
	Calculator(){
	System.out.println("This is constructor");
	}
	
	int sub(int n1,int n2) {
		return n1-n2;
	}
	static int mul(int n1,int n2) {
		return n1*n2;
	}
}
@FunctionalInterface
interface Calc{
	int cal(int n1,int n2);
}
public class MethodRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c=new Calculator();
/*int r=c.sub(22,19);
System.out.println("Subtraction= "+r);*/
Calc c1=c::sub;//sub function got referenced into cal method of Calc interface
int r1=c1.cal(22,19);
System.out.println("Subtraction= "+r1);
Calc c2=Calculator::mul;
int m1=c2.cal(22, 19);
System.out.println("Multiply="+m1);
/*For method referencing return type of the method other class must be same as the return type of method of interface*/
	}

}
