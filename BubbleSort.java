import java .util.*;
public class BubbleSort{
public static void Bubble(int arr[]){

for(int j=0;j<arr.length-1;j++){
    for(int i = 0;i<arr.length-1-j;i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
        }

    }
}
}
public static void Print(int arr[]){
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
 System.out.println();

}
public static void main(String args[]){
    int arr []={1,2,33,21,1,2};
    Bubble(arr);
    Print(arr);
}
}