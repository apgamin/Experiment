package calc;

class Emp1{
    public int a;
    public void meth1(){
        System.out.println("Hello");
    }

    public int meth2(){
        return 4;
    }
}

class Emp2 extends Emp1
{
    @Override
    public void meth1(){
        System.out.println("Hello Again");
    }

    public int meth4(){
        return 6;
    }
}



public class Overiding {
    public static void main(String[] args) {
        Emp2 a = new Emp2();
        

        a.meth1();

    }
}
