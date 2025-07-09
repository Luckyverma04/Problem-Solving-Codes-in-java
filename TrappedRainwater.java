public class TrappedRainwater {
    public static int TrappedRainwater(int height[]){
        int n = height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(rightMax[i],leftMax[i]);
            trappedWater+=waterLevel-height[i];
        
        }
        return trappedWater;   
    }
    public static void main(String args[]){
        int height[]={2,3,4,6,2,7};
        System.out.println("Trapped Rainwater: " + TrappedRainwater(height));

    }
}
