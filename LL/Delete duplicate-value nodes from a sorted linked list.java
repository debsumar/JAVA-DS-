static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null) {
        return null;
    }
    SinglyLinkedListNode n = head;
    while (n.next != null) {
        if (n.data == n.next.data) {
            n.next = n.next.next;
        } else {
            n = n.next;
        }
    }
    return head;

    }