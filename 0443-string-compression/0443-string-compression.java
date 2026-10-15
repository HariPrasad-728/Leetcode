class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int read = 0;
        while (read < n){
            char current = chars[read];
            int count = 0;
            while (read < n&& chars[read]==current){
                read++;
                count++;
            }
            chars[write] = current;
            write++;
            if(count > 1){
                String number = String.valueOf(count);
                for(int i = 0; i < number.length(); i++){
                    chars[write] = number.charAt(i);
                    write++;
                }
            }
        }
        return write;
    }
}