package chapter_2;

import chapter_2.linkedlist.ListNode;

public class DeleteMiddleNode {

    public void solve(ListNode node) {
        ListNode n = node.next;

        node.val = n.val;
        node.next = n.next;
    }
}
