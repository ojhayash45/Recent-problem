class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] char_Arr = new boolean[26];

        for(char ch : sentence.toCharArray()){
            char_Arr[ch-'a'] = true;
        }
        for(boolean b : char_Arr){
            if(!b) return false;
        }
        return true;
    }
}