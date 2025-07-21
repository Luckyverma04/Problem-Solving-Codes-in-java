import java.util.*;
public class WaterProblem {
    public static int Water(ArrayList<Integer>height){
int lp=0;
int rp=height.size()-1;
int mx=0;
while(lp<rp){
int ht=Math.max(height.get(lp),height.get(rp));
int width=rp-lp;
int currWater=ht*width;
mx=Math.max(mx,currWater);
if(height.get(lp)<height.get(rp)){
    lp++;

}else{
    rp--;

}

}
return mx;

    }

    public static void main(String args[]){
               ArrayList<Integer> height = new ArrayList<>();
height.add(9);
height.add(5);
height.add(3);
height.add(6);
height.add(3);
height.add(9);
height.add(6);
System.out.print(Water(height));

        }
}
