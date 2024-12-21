package calc;

public class Method_Overloading {

    /*static void table(int n){
        for (int i = 1; i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }*/


    /*static void pattern(int row){
        for (int i = 0; i<row; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }*/


    /*static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }*/


    /*static void pattern(int row){
        for (int i = 0; i<row; i++){
            for (int j = row; j>i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }*/

    /*static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }*/

    static float avg(float ... arr){
        float sum = 0,avrage = 0;
        for(float element : arr){
            sum += element;
            avrage = sum / arr.length;
        }
        return avrage;
    }

    public static void main(String[] args) {


        //Problem: 1.

       //table(5);


        //Problem: 2.

        //pattern(5);


        //Problem: 3.


        //int c = sumRec(4);
        //System.out.println(c);



    //pattern(5);

        //int a = fibonacci(5);
        //System.out.println(a);


        //Problem: 6.


        float a = avg(5,6,4,8,2.5f);
        System.out.println(a);

    }
}
