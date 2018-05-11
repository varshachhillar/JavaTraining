package JavaBasics.arraypractise;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];

        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for(int i =a-1;i<=b-1;i++)
                arr[i]=arr[i]+k;
        }
        long max =0;
        for (int j=0;j<n;j++){
            if(arr[j]>max)
                max= arr[j];
        }
        System.out.println(max);
        in.close();
    }
}
