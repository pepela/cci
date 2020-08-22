package chapter_2.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void append(int data) {
        ListNode node = new ListNode(data);
        ListNode n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = node;
    }

}
