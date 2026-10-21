class Solution {
    public int maxVowels(String s, int k) {

      int count = 0;
      int maxCount = 0;
      for (int i = 0; i < k; i++){
        if("aeiou".indexOf(s.charAt(i)) != -1){
            count++;
        }
      }  
      maxCount = count;
      for (int i = k; i < s.length(); i++){
        if ("aeiou".indexOf(s.charAt(i - k))!=-1){
            count--;
        }
        if("aeiou".indexOf(s.charAt(i))!= -1){
            count++;
        }
        maxCount = Math.max(maxCount, count);
        if(maxCount == k){
            return k;
        }
      }
      return maxCount;
    }
}