import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger A=new BigInteger(a,2);
        BigInteger B=new BigInteger(b,2);
        BigInteger c=A.add(B);
        return c.toString(2);
        
    }
}