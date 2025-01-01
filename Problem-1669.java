/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */1669. Merge In Between Linked Lists You are given two linked lists: list1 and list2 of sizes n and m respectively.
Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
The blue edges and nodes in the following figure indicate the result:
 
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = null;
        ListNode end = list1;
        for(int index = 0; index < b; index++){
            if(index == a-1)
            {
                start = end;
            }
            end = end.next;
        }
        start.next = list2;
        while(list2.next != null)
        {
            list2 = list2.next;
        }
        list2.next = end.next;
        end.next = null;
        return list1;
    }
}
