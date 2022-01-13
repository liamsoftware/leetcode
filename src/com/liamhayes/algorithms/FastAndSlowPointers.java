package com.liamhayes.algorithms;

public class FastAndSlowPointers {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        //fast and slow
        //fast will catch slow eventually if there is a cycle

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}