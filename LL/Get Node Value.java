static int getNode(SinglyLinkedListNode head, int positionFromTail) {
    SinglyLinkedListNode currentNode = head;
    int index = 0;
    while (currentNode.next != null){
        currentNode = currentNode.next;
        index ++;
    }
    currentNode = head;
    for(int i = 0; i <index-positionFromTail; i++){
        currentNode = currentNode.next;
    }
    return currentNode.data;

    }