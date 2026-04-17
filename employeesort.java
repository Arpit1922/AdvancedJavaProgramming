class employee{
    int sal;
    String name;
    String dept;
    employee(int sal,String name,String dept){
        this.sal=sal;
        this.name=name;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return "employee{" +
                "sal=" + sal +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

class q4{

    public static void main(String[] args) {
        employee e1=new employee(20000,"Aryan","IT");
        employee e2=new employee(1000,"ALok","Accounts");
        employee e3=new employee(3000,"alok singh","Testing");
        employee e4 =new employee(10000,"arpit","Admin");
        employee e5=new employee(2000,"archit","Ceo");
        List<employee> list1 = Arrays.asList(e1,e2,e3,e4,e5);
        List<employee>list4=list1.stream().sorted((a,b)->a.sal-b.sal).toList();
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i).name+" "+list4.get(i).sal);
        }
        System.out.println("dept");
        List<employee>list5=list1.stream().sorted((a,b)->a.dept.compareTo(b.dept)).toList();
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i).name+" "+list5.get(i).sal);
        }
    }
}
