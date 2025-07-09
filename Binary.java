import java.util.*;
public class Binary {
    public static int BinarySeach(int number[],int key){
        int start=0;
        int end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparision of key;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }
            else{
                end =mid -1;

            }
        }
        return -1;

    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7,8};
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number of key:");
    int key=sc.nextInt();
    System.out.println("The key is found at index: " + BinarySeach(number,key));
    sc.close();


}
}
