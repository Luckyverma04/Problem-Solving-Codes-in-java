import java.util.*;
public class ArrL{
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2); 
        List.add(3);
        List.add(4); 
        // System.out.println(List);
        // List.remove(2);
        List.set(3, 11);

//         System.out.println(List);
// System.out.println(List.contains(11));
// System.out.println(List.contains(4));
System.out.println(List.size());
// for(int i =List.size()-1;i>=0;i--){
//     System.out.print(List.get(i)+" ");
// }
// System.out.println();

// // int e =List.get(3);
// // System.out.println(e);
//     }
    int max = Integer.MIN_VALUE;
    for(int i=0;i<List.size();i++){
        max=Math.max(max , List.get(i));
    }
    System.out.println("max element="+ max);

}
}
