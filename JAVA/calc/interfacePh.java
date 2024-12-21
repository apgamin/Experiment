package calc;


interface SampleInterFace{
    void meth1();
    void meth2();
}

interface childSampleInterFace{
    void meth3();
    void meth4();
}

class Base2 implements childSampleInterFace,SampleInterFace {
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4(){
        System.out.println("meth4");
    }
}
public class interfacePh {
    public static void main(String[] args) {
        SampleInterFace ms = new Base2();
        ms.meth1();
        ms.meth2();
//        ms.meth3();
//        ms.meth4();
        }
    }

