package calc;

class Base{
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class inheritace {
    public static void main(String[] args) {

      Derived a = new Derived();
        a.setSalary(40000);
        a.setY(80045);
        System.out.println(a.getSalary());
        System.out.println(a.getY());

    }
}
