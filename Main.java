public class Main {

    public static void main(String[] args) {

        SinglyLinkedList s = new SinglyLinkedList();

        s.head = new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode l2 =
                new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode l3 =
                new SinglyLinkedList.ListNode(8);
        SinglyLinkedList.ListNode l4 =
                new SinglyLinkedList.ListNode(11);


        s.head.next = l2;
        l2.next = l3;
        l3.next = l4;
        //l4.next = s.head;

        SinglyLinkedList.ListNode newNode =
                new SinglyLinkedList.ListNode(7);
        newNode.next = s.head;
        s.head = newNode;

        s.insertNewNodeAtHead(14);
        s.insertNewNodeAtTail(45);
        s.insertNewNodeAtPosition(10,2);

        SinglyLinkedList.ListNode current = s.head;
        int count = 0;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
            ++count;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("There are " + count + " item(s) in the list");
    }
}
