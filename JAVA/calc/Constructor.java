package calc;

class Emp{
    int salary;
    String name;


    public Emp(){
        salary = 100000;
        name = "Abhishek Pandey";
    }

    public Emp(int sal,String n){
        salary = sal;
        name = n;
    }
   public int getSalary(){
       return salary;
   }

   public void setSalary(int sal){
       salary = sal;
   }
   public String getName(){
       return name;
   }

   public void setName(String n){
       name = n;
   }
}


public class Constructor {
    public static void main(String[] args) {

        Emp abhi = new Emp(12000,"Abhishek Pandey");

        //abhi.setSalary(70000);
        System.out.println(abhi.getSalary());
        //abhi.setName("Abhishek Pandey");
        System.out.println(abhi.getName());

    }
}
