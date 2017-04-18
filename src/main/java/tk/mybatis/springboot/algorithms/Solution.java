package tk.mybatis.springboot.algorithms;

/**
 * Created by jmx on 16/10/31.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode copy = head;
        int carry = 0;
        int sum;
        int v1;
        int v2;
        while (l1 != null || l2 != null || carry != 0) {
            v1 = l1 == null ? 0 : l1.val;
            v2 = l2 == null ? 0 : l2.val;
            sum = v1 + v2 + carry >= 10 ? v1 + v2 + carry - 10 : v1 + v2 + carry;
            copy.next = new ListNode(sum);
            carry = v1 + v2 + carry >= 10 ? 1 : 0;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            copy = copy.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(7);
        ListNode l3 = new Solution().addTwoNumbers(l1, l2);
        System.out.println(l3.val);
        System.out.println(l3.next.val);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
