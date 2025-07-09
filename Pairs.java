import java.util.*;
public class Pairs {
    public static void PrintPairs(int numbers[]){
        int tp=0; // Total Pairs
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            } System.out.println();
        }
       
              System.out.println("Total Pairs: "+tp);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};
        PrintPairs(numbers);
      

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");
//         int n=sc.nextInt();
//         int numbers[]=new int[n];
//          System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             numbers[i] = sc.nextInt();
//         }

//         // Print the array
//         System.out.println("The entered array is:");
//         for (int i = 0; i < n; i++) {
//            System.out.print(numbers[i] + " ");
      }
    }
  
