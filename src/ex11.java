public static Node<Integer> removeCommon(Node<Integer> listA, Node<Integer> listB) {
    Node<Integer> current = new Node<>(0, listA);
    Node<Integer> head = current;
    
    while (current.hasNext()) {
        int value = current.getNext().getValue();
        if (isNumIn(listB, value)) {
            current.setNext(current.getNext().getNext());
        } else {
            current = current.getNext();
        }
    }
    
    return head.getNext();
}
