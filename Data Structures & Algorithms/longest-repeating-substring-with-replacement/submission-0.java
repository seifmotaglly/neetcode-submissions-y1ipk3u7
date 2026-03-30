class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int res = 0;
        int[] count = new int[26];
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            count[s.charAt(j) - 'A']++;
            max = Math.max(max, count[s.charAt(j) - 'A']);
            if(j - i + 1 - max > k){
                count[s.charAt(i) - 'A']--;
                i++;
            }
            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
