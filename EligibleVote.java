package java8;
@FunctionalInterface
interface Eligibility{
	boolean age(int n);
}
public class EligibileVote {

	public static boolean checkAge(int n) {
		return n>=18;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibility e=(int n)->{
			if(n>=18) {
				return true;
			}else {
				return false;
			}
		};
		boolean result=e.age(42);
		System.out.println(result);
		Eligibility e1=EligibileVote::checkAge;
		boolean ans=e1.age(22);
		System.out.println(ans);
	}

}
