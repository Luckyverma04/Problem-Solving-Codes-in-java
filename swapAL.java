import java.util.*;
public class swapAL {
    public static void Swap(ArrayList<Integer>List,int  idx1,int idx2){
int temp = List.get(idx1);
List.set(idx1,List.get(idx2));
List.set(idx2,temp);

    }
    public static void main(String args[]){
        ArrayList<Integer>List = new ArrayList<>();
        List.add(11);
        List.add(12);
        List.add(13);
        List.add(14);
        List.add(15);
        System.out.print(List);
                Scanner sc = new Scanner(System.in);
                   System.out.println("Enter the value of idx1=");
        int idx1 = sc.nextInt();
               System.out.println("Enter the value of idx2=");
          sc = new Scanner(System.in);
   
        int idx2 = sc.nextInt();
                 System.out.println("Enter the value of idx2=");
        Swap(List,idx1,idx2);
            System.out.print(List);

    }
}
