package calc;


abstract class Parent1{
    /*Parent1(){
        System.out.println("Hello");
    }*/
    public void Child1(){
        System.out.println("Hello Bacho....");
    }

    abstract void greet();
}

class Parent2 extends Parent1{
    @Override
    public void greet(){
        System.out.println("Hello again");
    }
}




public class Abstract_class {
    public static void main(String[] args) {
        Parent2 a = new Parent2();
         a.greet();
        a.Child1();

    }
}
