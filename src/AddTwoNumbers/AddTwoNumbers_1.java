package AddTwoNumbers;

/**
 * Created by fengjw on 2018/5/27
 * Code Change The World!
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbers_1 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tmp = null;
        ListNode result = null;

        int intPart = 0;

        while (l1 != null || l2 != null || intPart != 0){
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + intPart;
            intPart = sum / 10;

            ListNode listNode = new ListNode(sum % 10);


            if (tmp == null){
                tmp = listNode;
                result = tmp;
            }else {
                tmp.next = listNode;
                tmp = tmp.next;
            }

            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
        }

        return result;
    }

}
