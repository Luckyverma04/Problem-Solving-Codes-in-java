public class SelectionSort {
    public static void selection(int arr[]){
for(int i=0;i<arr.length-1;i++){
    int pos =i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[pos]){
             pos=j;    
        }
    }
    int temp=arr[pos];
    arr[pos]=arr[i];
    arr[i]=temp;
}
    }
    public static void Print(int arr[]){
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
public static void main(String args[]){
int arr[]={2,1,3,4,2,5};
selection(arr);
Print(arr);

}
}
