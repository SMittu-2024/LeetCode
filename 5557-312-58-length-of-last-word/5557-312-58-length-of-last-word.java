class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int pos= s.lastIndexOf(' ');    
        return s.substring(pos+1).length();
    }
}