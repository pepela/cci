package chapter_2;

import chapter_2.linkedlist.ListNode;

public class KthLastElement {

    public int solve(ListNode node, int k) {
        ListNode current = node;

        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }

        int val = 0;
        for (int i = 0; i < size - k - 1; i++) {
            node = node.next;
            val = node.val;
        }

        return val;
    }

    public int solve1(ListNode node, int k) {
        if (node == null) {
            return 0;
        }
        int i = solve1(node.next, k) + 1;
        if (i == k) {
            System.out.println(node.val);
        }
        return i;
    }

    public int solve2(ListNode node, int k) {
        ListNode current = node;
        ListNode runner = node;

        for (int i = 0; i < k; i++) {
            current = current.next;
        }

        while (current != null) {
            current = current.next;
            runner = runner.next;
        }

        return runner.val;
    }

}
