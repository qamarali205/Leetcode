/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
       if(head==null) 
       return head;
       
        HashMap<Integer,ListNode> hm = new HashMap<>();
        ListNode ans= new ListNode(0);
        hm.put(0,ans);
        ans.next=head;
        int sum=0;
        ListNode curr=head;
        while(curr!=null){
            sum+=curr.val;
            if(hm.containsKey(sum)) {
                int currSum=sum;
                ListNode toRemove=hm.get(sum).next;
                while(toRemove!=curr){
                    currSum+=toRemove.val;
                    hm.remove(currSum);
                    toRemove=toRemove.next;
                }
                hm.get(sum).next=curr.next;}
            else {
                hm.put(sum,curr);
                 }         
            curr=curr.next;
        }
        return ans.next;        
    }
}