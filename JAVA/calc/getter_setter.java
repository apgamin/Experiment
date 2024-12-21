package calc;

class abhiPandey{
    private int salary;
    private String name;

    public int get_salary(){
        return salary;
    }
    public void set_salary(int n){
        salary = n;
    }

    public String get_name(){
        return name;
    }
    public void set_name(String a){
        name = a;
    }
}



public class getter_setter {
    public static void main(String[] args) {
        abhiPandey Abhishek = new abhiPandey();
        Abhishek.set_salary(50000);
        System.out.println(Abhishek.get_salary());
        Abhishek.set_name("Abhishek pandey");
        System.out.println(Abhishek.get_name());



    }
}
