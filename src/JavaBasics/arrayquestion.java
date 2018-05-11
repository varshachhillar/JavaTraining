package JavaBasics;

import java.util.Arrays;

public class arrayquestion {

    //Bubble Sort O(n square)
    public static void bubblesort(int s[]) {
        int tmp;
        int n = s.length;
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] > s[j]) {
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }

    }

    //Insertion Sort O(n square)
    public static void insertionsort(int s[]) {
        int k, j;
        for (int i = 1; i < s.length; i++) {
            k = s[i];
            for (j = i - 1; j >= 0 && k < s[j]; j--) {
                s[j + 1] = s[j];
            }
            s[j + 1] = k;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    //Quick sortO(nlogn)
    public static void quicksort(int s[], int low, int high) {
        int i = low;
        int j = low + 1;
        int tmp;
        int pivot = s[high];
        while (j != high) {
            for (j = low + 1; j < high; j++) {
                if (s[j] < pivot) {
                    tmp = s[j];
                    s[j] = s[i + 1];
                    s[i + 1] = tmp;
                    i++;
                }
            }
            tmp = s[i + 1];
            s[i + 1] = s[j];
            s[j] = tmp;
        }
        if (i != low && low == -1) {
            quicksort(s, low, i);
        }
        if (high == 9 && i < (s.length - 2)) {
            quicksort(s, i + 1, high);
        }

    }


    //merge sort O(nlogn)
    public static void mergesort(int s[], int low, int mid, int high) {
        int i, j, k;
        int t[] = new int[s.length];
        i = low;
        j = mid + 1;
        k = low;
        while (i <= mid && j <= high) {
            if (s[i] <= s[j]) {
                t[k] = s[i];
                i++;
            } else {
                t[k] = s[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            t[k] = s[i];
            k++;
            i++;
        }
        while (j <= high) {
            t[k] = s[j];
            k++;
            j++;
        }
        for (i = low; i <= high; i++) {
            s[i] = t[i];
        }

    }

    public static void mergesortdiv(int s[], int low, int high) {
        int mid;
        if (low < high) {
            mid = low + (high - low) / 2;
            mergesortdiv(s, low, mid);
            mergesortdiv(s, mid + 1, high);
            mergesort(s, low, mid, high);
        }
    }

    //Selection sort O(n square)
    public static void selectionsort(int s[]) {
        int min, tmp;
        for (int i = 0; i < s.length; i++) {
            min = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[min]) {
                    min = j;
                }
            }
            tmp = s[i];
            s[i] = s[min];
            s[min] = tmp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    //sort 2D array with column k
    public static void sort2d(int a[][], int k) {
        int len = a[0].length;
        int tmp[] = new int[len];
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i][k] > a[j][k]) {
                    for (int x = 0; x < len; x++) {
                        tmp[x] = a[i][x];
                        a[i][x] = a[j][x];
                        a[j][x] = tmp[x];
                    }
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //all nos 2 times but one number is one times only in sorted array

//    public static int findonetime(int arr[], int start, int end) {
//        int mid = (start + end) / 2;
//        if (arr[mid] == arr[mid + 1] && mid % 2 == 0) {
//            return findonetime(arr, mid + 2, end);
//        }
//        if (arr[mid] == arr[mid - 1] && mid % 2 == 0) {
//            return findonetime(arr, start, mid - 2);
//        }
//        if (arr[mid] == arr[mid + 1] && mid % 2 != 0) {
//            return findonetime(arr, start, mid - 1);
//        }
//        if (arr[mid] == arr[mid - 1] && mid % 2 != 0) {
//            return findonetime(arr, mid + 1, end);
//        if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
//            return (arr[mid]);
//        }
//        else return (-1);
//    }

    //max number of 1 in 2D mtrix
        public static void maxonearr(int arr[][], int strow, int endrow, int stcol, int endcol){
            int midr = (strow+endrow)/2;
            int midc = (stcol+endcol)/2;
            int frow=-1, fcol=-1;

            if (arr[midr][midc]== 1){
                frow = firstone(arr,0,endrow,midc);
                fcol = firstone(arr,0,endcol,midr);
            }
            else {
            maxonearr(arr,midr+1,endrow,midc+1,endcol);
            }
            if (fcol< frow){
                System.out.println("matrix is");
            }
        }
        public  static int firstone(int arr[][],int start, int end, int rc){
        int mid = (start+end)/2;
        if ((arr[mid-1][rc]==0 && arr[mid][rc]==1)){
            return mid;
        }
        if (arr[mid+1][rc]==1 && arr[mid][rc]==0){
            return mid+1;
        }
        if(arr[mid][rc] == 1){
            return firstone(arr, start,mid-1,rc);
        }
        else{
            return  firstone(arr,mid+1,end,rc);
        }
        }


}
