import java.util.*;
public class LinearSearch{
    public static int Linear(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
            return i;
           }

        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key=sc.nextInt();
        int index=Linear(numbers,key);
        if(index==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);

        }
        }
    }