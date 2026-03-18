    class Animal{
        String name;
        String sound;
        Animal(){
            this("Cat","Meow");
        }
        Animal(String name , String sound){
            this.sound=sound;
            this.name=name;
        }
        void getInfo(){
            System.out.println("Name = "+name);
            System.out.println("Sound = "+sound);
        }
        void getInfo(String name, String sound, int legs){
            System.out.println("Name="+name);
             System.out.println("Sound="+sound);
              System.out.println("Number of legs="+legs);
        }
    }
    class Cat extends Animal{
        Cat(String name,String sound){
           super(name,sound);
        }
        void getInfo(){
            System.out.println("Cat name:"+name);
            System.out.println("Cat sound:"+sound);

        }
    }
    public class PolyMain {
    public static void main(String[] args) {
        Cat c1=new Cat("Cat2","meow2");
        c1.getInfo();
    }
}
