package calc;



interface BasicAnimal{
    void eat();
}

class Monkey{
    void jump(){
        System.out.println("Monkey can jump");
    }
    void bite(){
        System.out.println("They also bite anyone");
    }

}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("They eat food like humans");
    }
}








public class abstract_ps {
    public static void main(String[] args) {
//    Fountain_pen ms = new Fountain_pen();
//    ms.write();
//    ms.refill();
//    ms.changeNib();

        Human ms = new Human();
        ms.eat();
        ms.bite();
        ms.jump();
    }
}
