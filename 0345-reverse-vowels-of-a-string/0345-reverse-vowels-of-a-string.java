class Solution {
    public String reverseVowels(String s) {
        int n= s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n-1;
        while(start < end) {
            if(!isVowel(ch[start])) {
                start++;
            }
            else if(!isVowel(ch[end])) {
                end--;
            }else {
                char t = ch[start];
                ch[start] = ch[end];
                ch[end] = t;
                start++;
                end--;
            }
        }
        return new String(ch);
        
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
        || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        return true;
        return false;
    }
}