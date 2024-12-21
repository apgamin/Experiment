package calc;


public class array {
    public static void main(String[] args) {

        //Problem: 1.


        /*float [] marks = {82.4f,78.3f,25.6f,79.5f,99.9f};
        float sum = 0;
        for(float element: marks){
             sum += element;
        }
        System.out.println(sum);*/


        //Problem:2.


        /*float [] marks = {82.4f,78.3f,25.6f,79.5f,99.9f};
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
                boolean isPresent = false;
        for(float element: marks){
            if(num == element){
                isPresent = true;
            }
            }
        if(isPresent == true){
            System.out.println(num+" is available");
        } else {
            System.out.println(num + " is not available");
        }*/


        //Problem:3.

        /*float [] marks = {82.4f,78.3f,25.6f,79.5f,99.9f};
        float sum = 0;
        for (float element: marks){
            sum += element;
        }
        System.out.println("Avarage of your array is: "+sum/marks.length);*/


        //problem: 4.

        /*int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for (int i=0;i<mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");

            }
            System.out.println("");
        }*/


        //Problem>5.

        /*int arr[] = {1,2,3,4,5,6,7,8,9};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp = 0;
        for (int i = 0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for (int element : arr){
            System.out.println(element);
        }*/


        //Problem: 6.

        /*int arr[] = {5,4,6,2,7,44,6,5,55,5,4,6};
        int max = 0;
        for (int element : arr){
            if (element > max){
                max = element;
            }
        }
        System.out.println("Maximum number in this array is: "+ max);*/

        //Problem: 7.

        /*int arr[] = {5,4,6,2,7,44,6,5,55,5,4,6};
        int min = Integer.MAX_VALUE;
        for (int element : arr){
            if (min>element){
                min = element;
            }

        }
        System.out.println("Min is "+min);*/

        //Problem : 8.

        int arr[] = {1,2,3,4,5,6};
        boolean isShorted = true;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isShorted = false;
                break;
            }
        }
       if(isShorted){
           System.out.println("Your array is shorted");
       }
       else{
           System.out.println("Your array is not shorted");
       }
    }
}
