
package calc;

class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int r , int h){
        super(r);
        this.height = h;
    }

    public double Volume(){
        return Math.PI * radius * radius * height;
    }
}




public class Chapter_ps_10 {
    public static void main(String[] args) {

        Cylinder ar = new Cylinder(5,7);
        System.out.println(ar.area());
    }
}
