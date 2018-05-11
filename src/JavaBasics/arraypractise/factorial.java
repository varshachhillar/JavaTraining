package JavaBasics.arraypractise;

import java.util.Scanner;

public class factorial {

    static int factorial(int n) {
        int result =1;
        if(n!=1){
            return factorial(n-1)*n;
        }
        return  result;
    }
    static void add(int[] arr){
        System.out.println("ssss");
        arr[2]=5;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int[] arr= {1,2,3};
//        int n = in.nextInt();
//        int result = factorial(n);
//        System.out.println(result);
        System.out.println(arr[2]);
        add(arr);
        System.out.println(arr[2]);

    }
}
