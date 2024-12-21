package calc;

class Base1{
    Base1(){
        System.out.println("I am Constucter of Base");
    }
    Base1(int n){
        System.out.println("I am a Overloade Constucter of Base");
    }
}
class Derived1 extends Base1{
     Derived1(){

         System.out.println("I am a Constucter of Derived");
     }
     Derived1(int x){
         super(5);
         System.out.println("I am a Overloade Constucter of Derived");
     }
}




public class constructer{
    public static void main(String[] args) {
        Derived1 a = new Derived1();
    }
}
