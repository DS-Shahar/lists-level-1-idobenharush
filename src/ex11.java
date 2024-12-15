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
public static Node<Integer> removeCommon2(Node<Integer> listA, Node<Integer> listB) {
    Node<Integer> current = new Node<>(0, listA);
    Node<Integer> head = current;
    Node<Integer> pB = listB;
    while (current.hasNext()) {
        int a = current.getNext().getValue();
        pB = listB;
        while (pB != null && !pB.getValue().equals(a)))  {
            pB = pB.getNext();
        }
        if (pB != null)
            current.setNext(current.getNext().getNext());
        else
            current = current.getNext();        
    }    
    return head.getNext();
}
