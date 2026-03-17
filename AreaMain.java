interface Area{
    double PI=3.14;
    double getArea();
}
class Circle implements Area{
    double radius;
    Circle(double radius){
    this.radius=radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
}
public class AreaMain {
    public static void main(String[] args) {
        Circle c1=new Circle(14.5);
        System.out.println("Area of circle:"+c1.getArea());
        Area c2=new Circle(16.5);
        System.out.println("Area of circle:"+c2.getArea());
        Area r1=new Area() {
            public double getArea(){
                int l=10,b=40;
                return(l*b);
            }
        };
        System.out.println("Area of rectangle:"+r1.getArea());
    }
}
