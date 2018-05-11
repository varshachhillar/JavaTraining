package JavaBasics.arraypractise;

        import java.util.*;

public class rotaion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        a = rotaion.leftrotate(a,n,k);
        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i]+" ");
        }
    }

    public static int[] leftrotate(int arr[], int n, int k){
        int sol[] = new int[n];
        int i =0;
        for ( ; k+i< n;i++){
            sol[i]=arr[k+i];
        }
        int j=0;
        for(;i<n;i++,j++ ){
            sol[i] = arr[j];
        }
        return sol;
    }
}
