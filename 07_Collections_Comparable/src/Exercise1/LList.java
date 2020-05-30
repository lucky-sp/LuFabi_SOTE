package Exercise1;

import java.util.Iterator;

public class LList implements Iterable<Object> {
    private Node head;

    public void insert(Object content) {
        if (head == null) {
            head = new Node(content);
        } else {

            Node iterationNode = head;

            while (iterationNode.getNextNode() != null) {
                iterationNode = iterationNode.getNextNode();
            }

            Node newNode = new Node(content);
            iterationNode.setNextNode(newNode);
            newNode.setPreviousNode(iterationNode);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }

        int size = 1;
        Node iterationNode = head;
        for (; iterationNode.getNextNode() != null; size++) {
            iterationNode = iterationNode.getNextNode();
        }
        return size;
    }

    public Object get(int index) {

        Node iterationNode = head;
        for (int i = 0; i < index; i++) {
            iterationNode = iterationNode.getNextNode();
        }

        return iterationNode.getContent();
    }

    public void remove(int index) {

        if (index == 0) {
            head = head.getNextNode();
        } else {

            Node iterationNode = head;
            for (int i = 0; i < index; i++) {
                iterationNode = iterationNode.getNextNode();
            }

            iterationNode.getPreviousNode().setNextNode(iterationNode.getNextNode());

            if (iterationNode.getNextNode() != null) {// if iterationNode is last element in list, then there is no next
                // node
                iterationNode.getNextNode().setPreviousNode(iterationNode.getPreviousNode());
            }
        }
    }

    public boolean contains(Object content) {
        if (head == null) {
            return false;
        }
        Node iterationNode = head;
        if (iterationNode.getContent().equals(content)) {
            return true;
        } else {
            while (iterationNode.getNextNode() != null) {
                if (iterationNode.getContent().equals(content)) {
                    return true;
                }
                iterationNode = iterationNode.getNextNode();
            }
        }
        return false;
    }


    @Override
    public Iterator<Object> iterator() {
        return new LListIterator(head);
    }

    public static class LListIterator implements Iterator<Object> {

        private Node iterationNode;

        public LListIterator(Node head) {
            iterationNode = head;
        }

        @Override
        public boolean hasNext() {
            return iterationNode != null;
        }

        @Override
        public Node next() {
            Node nextNode = iterationNode;
            iterationNode = iterationNode.getNextNode();
            return nextNode;
        }
    }
}
