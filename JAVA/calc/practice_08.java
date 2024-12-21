package calc;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;

    }

    public void setName(String n){
        name = n;
    }


}

class cellPhone{
    String ringing;
    String vibrating;

    public void get_ringing(){
        System.out.println("Abhishek's phone is ringing");
    }
    public void get_vibrating(){
        System.out.println("Abhishek's phone is on Silent but it is vibrating");
    }
}


class square{
    int side;
    float area;
    float perimeter;

    public float get_area(int side){
        area = side * side;
        return area;
    }
    public float get_perimeter(int side){
        perimeter = 4 * side;
        return perimeter;
    }
}



public class practice_08 {
    public static void main(String[] args) {
//        Employee Abhishek = new Employee();
//        int sal = Abhishek.salary = 50000;
//        Abhishek.setName("Abhishek");
////Problem:1.
//        System.out.println(Abhishek.getName());
//        System.out.println(sal);
////Problem: 2.
//        cellPhone Abhi = new cellPhone();
//        Abhi.get_ringing();
//        Abhi.get_vibrating();


        square sq = new square();

        float a = sq.get_area(5);
        float b = sq.get_perimeter(5);
        System.out.println(a + "\n"+ b);

    }
}
