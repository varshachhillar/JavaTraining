package JavaBasics.stringpractise;

import java.util.*;

public class SparseArrays {

    static int[] search(String[] numstr, String[] qstr){
        int[] count= new int[qstr.length];
        for (int i =0;i<qstr.length;i++){
            for(int j=0;j<numstr.length;j++){
                if (numstr[j].equals(qstr[i]))
                    count[i]= count[i]+1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=0,q=0;
        n= scan.nextInt();
        String[] numstr = new String[n];
        for(int i =0 ; i<n;i++)
            numstr[i] = scan.next();
        q= scan.nextInt();
        String[] qstr = new String[q];
        for(int i =0 ; i<q;i++)
            qstr[i] = scan.next();
        int[] result = new int[q];
        result = search(numstr,qstr);
        for(int i =0 ; i<q;i++)
            System.out.println(result[i]);


    }
}
