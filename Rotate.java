import java.util.Arrays;
public class Rotate {
    public static void rotate(int arr[],int k){
       int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int arr[],int start ,int end){
        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
        start++;
    end--;
}
}
    public static void main(String args[]){
        int arr[]={1,2,33,34,54};
        int k=2;
        rotate(arr,k);
  System.out.println("Rotated Array: " + Arrays.toString(arr));    }
}
