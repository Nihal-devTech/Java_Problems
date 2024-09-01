public class trapping_rainwater{

    public static int trap(int height[]){
        //calculate leftmaxboundary
        //calculate rightmaxboundary
        //loop
        //waterlevel=min(maxleftboundary,maxrightboundary)
        //trapped water=waterlevel-height


        //1
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1 ; i<height.length ; i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //2
        //ulta array chlado
        int rightmax[]=new int[height.length];
        //last wale ki right max khud last wale kii value hee rahegi
        rightmax[height.length-1]=height[height.length-1];

        for(int i=height.length-2; i>=0 ; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trapped_water=0;
        for(int i=0;i<height.length;i++){
            int wl=Math.min(leftMax[i],rightmax[i]);
            trapped_water += wl - height[i];
        }


        return trapped_water;
    }

    public static void main(String args[]){
        int height[]={3,1,2,4,0,1,3,2};
        System.out.println(trap(height));
    }
}