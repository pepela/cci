package chapter_2;

import chapter_2.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    /*
     * Time - O(n)
     * Space - O(n)
     * */
    public void solve(ListNode node) {
        Set<Integer> set = new HashSet<>();
        ListNode previous = null;
        ListNode n = node;
        while (n != null) {
            if (set.contains(n.val)) {
                previous.next = n.next;
            } else {
                set.add(n.val);
                previous = n;
            }
            n = n.next;
        }
    }

    /*
     * Time - O(n*n)
     * Space - O(1)
     * */
    public void solve1(ListNode node) {
        ListNode current = node;
        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (runner.next.val == current.val) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
