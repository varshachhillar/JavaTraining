package JavaBasics.arraypractise;

public class MaxSumOfSubarray {

    public static void main(String[] args){
        int[] arr = {-10,4,0,-5,25,9};
        int sum=0;
        if(arr.length>0){
            for(int i =0;i<arr.length;i++){
                if(arr[i]>0){
                    sum = sum +arr[i];
                }
            }
        }
        System.out.println(sum);

    }
}
