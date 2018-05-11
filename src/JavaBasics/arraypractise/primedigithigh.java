package JavaBasics.arraypractise;


//Find the highest occurring digit in prime numbers in a range

import java.util.ArrayList;
import java.util.Scanner;

public class primedigithigh {
    public static int[] prime(int l, int r){
        int count =0;
        int dig[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i =l;i<=r;i++){
            count =0;
            for(int j=1;j<=i;j++)
                if(i%j==0 && i!=j && j!= 1)
                    count =1;
            if(count == 0&& i!=1) {
                int num =i;
                while (num !=0){
                    int digit = num%10;
                    dig[digit] = dig[digit] + 1;
                    num= num/10;
                }
                }
        }
        return dig;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int dig[] = {0,0,0,0,0,0,0,0,0,0};
        dig = primedigithigh.prime(l,r);
        int large= dig[0];
        int digit =0;
        for (int i =1;i<10;i++){
            if(dig[i]>large){
                large =dig[i];
                digit =i;
            }
        }
        System.out.println("Digit is " + digit +" no of times " +large);

    }

}
