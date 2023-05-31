public class SinglyLinkedList {
    ListNode head;
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNewNodeAtHead(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertNewNodeAtTail(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertNewNodeAtPosition(int value, int position) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = null;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                ++count;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }
}
