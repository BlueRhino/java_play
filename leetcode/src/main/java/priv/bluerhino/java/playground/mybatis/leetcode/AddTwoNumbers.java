package priv.bluerhino.java.playground.mybatis.leetcode;

/**
 * Created by niekunlin @ 18/5/28.
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(9);
        list1.next = new ListNode(9);
        ListNode list2 = new ListNode(1);
        addTwoNumbers(list2,list1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryNumber = 0;
        ListNode resHead = null, resCurrent = null;
        while (l1 != null) {
            if (l2 == null) {
                break;
            } else {
                int tmp = l1.val + l2.val + carryNumber;
                carryNumber = 0;
                if (tmp >= 10) {
                    carryNumber = 1;
                    tmp -= 10;
                }
                if (resHead == null) {
                    resHead = new ListNode(tmp);
                    resCurrent = resHead;
                } else {
                    resCurrent.next = new ListNode(tmp);
                    resCurrent = resCurrent.next;
                }
                l2 = l2.next;
            }
            l1 = l1.next;
        }
        ListNode listLast;
        if (l1 != null) {
            listLast = l1;
        } else if (l2 != null) {
            listLast = l2;
        } else {
            if(carryNumber > 0 ){
                resCurrent.next = new ListNode(carryNumber);
            }
            return resHead;
        }
        while (listLast != null) {
            if (resCurrent == null) {
                return listLast;
            }
            int tmp = listLast.val + carryNumber;
            carryNumber = 0;
            if (tmp >= 10) {
                carryNumber = 1;
                tmp -= 10;
            }
            resCurrent.next = new ListNode(tmp);
            listLast = listLast.next;
            resCurrent = resCurrent.next;
        }
        if(carryNumber > 0 ){
            resCurrent.next = new ListNode(carryNumber);
        }
        return resHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
