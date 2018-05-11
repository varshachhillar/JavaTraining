package JavaBasics.arraypractise;

public class MergeSort {
     void sort(int[] arr, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    void merge(int[] arr, int start, int mid, int end){
        int sub1 = mid-start+1;
        int sub2 = end-mid;
        int[] subarr1 = new int[sub1];
        int[] subarr2 = new int[sub2];
        for (int i =0;i<sub1;i++)
            subarr1[i]= arr[start+i];
        for (int j=0;j<sub2;j++)
            subarr2[j]= arr[mid+1+j];
        int i=0, j=0;
        int k= start;
        while (i<sub1 && j<sub2){
            if (subarr1[i]<=subarr2[j]){
                arr[k]=subarr1[i];
                i++;
            }
            else{
                arr[k]=subarr2[j];
                j++;
            }
            k++;
        }
        while (i<sub1){
            arr[k]=subarr1[i];
            i++;
            k++;
        }
        while (j<sub2){
            arr[k]=subarr2[j];
            j++;
            k++;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public  static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
