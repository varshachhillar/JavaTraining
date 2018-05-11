package JavaBasics.arraypractise;

import java.util.HashMap;

public class repetativeelement {
    public static void  main(String args[]){
        int a[] = {2, 3, 4, 1, 2};
        int i=0;
        int sum1=0, sum2=0;

        int len = a.length;
        //Only one repeate
        for (;i<len;i++){
            sum1 = sum1+a[i];
            if(i<len-1)
                sum2 = sum2+(i+1);
        }
        System.out.println(sum1-sum2);


        //Multiple repeat
        int b[] = {2, 3, 1, 1, 2};
        i=0;
        len = b.length;
        for (;i<len;i++){
            sum1 = sum1+b[i];
            if(i<len-1)
                sum2 = sum2+(i+1);
        }
        System.out.println(sum1-sum2);
//
//        HashMap<Integer,Integer> hmap = new HashMap<>();
//        for(;i<a.length;i++){
//            Integer count =  hmap.get(a[i]);
//            if(count == null)
//                hmap.put(a[i],1);
//            else{
//                hmap.put(a[i],++count);
//                break;
//            }
//        }
//        System.out.print(a[i]);

    }

}
