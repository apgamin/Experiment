package calc;

class Calculator{
  public void calculate(int a,int b){
    System.out.println("Simple calculater is: " + a+b);
  }
}

class SCcalculator{
    public void calculate(int a , int b){
      System.out.println("Scintific calculator: "+ Math.sin(a+b));
    }
}

class Hcalculator{
  public void calculate(int a , int b){
    System.out.println("Hybrid calculator: "+ a+b);
    System.out.println("Hybrid calculator: "+ Math.sin(a+b));
  }
}


public class problem1 {
  public static void main(String[] args) {
    System.out.println("I am a main method");
  }
  
}
