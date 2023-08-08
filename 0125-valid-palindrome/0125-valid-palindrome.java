class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        str = str.replaceAll("\\s",""); 
        str = str.replaceAll("[^a-z0-9]",""); 
        int i=0,j=str.length()-1;
        while(i<j){
            char ch = str.charAt(i);
            char ch1 = str.charAt(j);
            if(ch==ch1){
                i++;
                j--;
            }
            else return false;
        }
        return true;
        
    }
}