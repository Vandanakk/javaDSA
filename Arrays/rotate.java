import java.util.Arrays;
public class rotateright {
    public static void main(String[] args){
        int[] arr = {-1,-100,3,99};
        rotate(arr, 2);
    }
    static void rotate(int[] arr, int k){
        int n = arr.length;
        int[] ans = new int[n];
        int a = 0;
        for(int i=n-k; i<n; i++){
            ans[a++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[a++] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
