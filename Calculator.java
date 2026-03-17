class Sum{
    Sum(int a, int b){
        System.out.println(a+b);
    }
}
class Multiplication{
     int product(int a,int b){
        return a*b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Sum s=new  Sum(5,5);
        Multiplication m=new Multiplication();
       int result= m.product(3,4);
       System.out.println(result);
    }
}
