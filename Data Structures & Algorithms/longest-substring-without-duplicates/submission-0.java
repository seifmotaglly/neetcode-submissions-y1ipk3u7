class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int j = 0;
        for(int i = 0; i <= s.length()-1; i++){
            boolean flag = true;
            while(s.substring(j, i).contains(s.charAt(i)+"")){
                j++;
                flag = false;
            }
            count = flag ? Math.max(count, s.substring(j, i+1).length()) : count;
        }
        return count;
    }
}
