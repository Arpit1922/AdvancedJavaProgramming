package convertlambdaexpression;

@FunctionalInterface
interface CheckPalindrome {
   boolean checkPalin(String info);
}
public class Main {
   public static void main(String[] args) {
       CheckPalindrome cp=(String info)->{
    	   String infoRev=new StringBuilder(info).reverse().toString();
    	   return infoRev.equals(info);
       };
    }
}
