class Solution {
    public String gcdOfStrings(String str1, String str2) {

        
            String result = "";
            int minLength;
            if(str1.length() < str2.length()){
                minLength = str1.length();
            }else{
                minLength = str2.length();
            }
            for(int i=1; i<=minLength; i++){
                String part = str1.substring(0,i);
                if(canMake(str1, part) && canMake(str2, part)){
                    result = part;
                }
                
            }
            return result;
        }
        boolean canMake(String word, String part){
            if(word.length() % part.length() != 0){
                return false;
            }
            String repeated = "";
            for(int i = 0; i < word.length()/part.length(); i++){
                repeated = repeated + part;

            }
            return repeated.equals(word);
        }
        
    
}