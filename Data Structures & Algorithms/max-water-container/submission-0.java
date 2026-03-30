class Solution {
    public int maxArea(int[] heights) {
        int area = 0; 
        int left = 0;
        int right = heights.length - 1;
        while(left < right){
            int min = Math.min(heights[left], heights[right]);
            area = Math.max(area,min * (right - left));
            if(heights[left] <= heights[right])
                left++;
            else
                right--;
        }
        return area;
    }
}
