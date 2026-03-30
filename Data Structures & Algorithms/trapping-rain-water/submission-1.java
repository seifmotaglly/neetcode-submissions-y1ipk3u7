class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int area = 0;
        while (left < right){
            if(maxLeft <= maxRight){
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                area += maxLeft - height[left];
            }else{
               right--; 
               maxRight = Math.max(maxRight, height[right]);
               area += maxRight - height[right];
            }
        }
        // for(int i = 0; i < height.length; i++){
        //     if(height[i] > max)
        //         max = height[i];
        // }
        // int area = (height.length - 2) * max;
        // for(int i = 1; i < height.length - 2; i++){
        //     if(i == 1 && height[i] > height[0])
        //         area -= max;
        //     else if(i == height.length - 2 && height[i] > height[height.length - 1])
        //         area -= max;
        //     else if(height[i] > height[i+1] && height[i] > height[i-1]){
        //         area -= max;
        //     }else if(height[i] < height[i+1] && height[i] < height[i-1]){
        //         area -= max - Math.min(height[i+1],height[i-1]);
        //     }else{
        //         area -= height[i];
        //     } 
        // }

        return area;
    }
}
