class Solution {
    public int romanToInt(String s) {
        
        int result = 0;
        for(int i = 0; i <s.length(); i++){
            int current = value(s.charAt(i));
            if(i + 1 < s.length()){
                int next = value(s.charAt(i + 1));
                if(current < next){
                    result = result - current;
                }else{
                    result = result + current;
                }
            }else{
                result = result + current;
            }
        }
        return result;
        
        
        
    }
    int value(char ch){
        if(ch == 'I'){
            return 1;
        }else if(ch == 'V'){
             return 5;
        }else if(ch == 'X'){
             return 10;
        }else if(ch == 'L'){
             return 50;
        }else if(ch == 'C'){
             return 100;
        }else if(ch == 'D'){
             return 500;
        }else {
             return 1000;
        }

    }

    
}