package calc;

interface Bicycle{
    void speedDown(int decrement);
    void speedUp(int increment);
        }
        interface Bike {
    void cc (int eng);
        }

        class abhi implements Bicycle , Bike{
    void greet(){
        System.out.println("Hello");
    }

            @Override
            public void speedDown(int decrement) {
                System.out.println("Deacccelerate");
            }
            public void speedUp(int incremenet){
                System.out.println("Accelerate");
            }
            public void cc(int eng){
                System.out.println("Power of engine is "+ eng);
            }
        }


public class Interface {
    public static void main(String[] args) {
        abhi a = new abhi();
        a.speedDown(5);
        a.speedUp(6);
        a.greet();
        a.cc(350);
    }
}
