package Exercise2;

import java.util.Iterator;

public class LList7_2 implements Iterable<Object> {
    private Node7_2 head;

    public void insert(Object content) {
        if (head == null) {
            head = new Node7_2(content);
        } else {

            Node7_2 iterationNode = head;

            while (iterationNode.getNextNode() != null) {
                iterationNode = iterationNode.getNextNode();
            }

            Node7_2 newNode = new Node7_2(content);
            iterationNode.setNextNode(newNode);
            newNode.setPreviousNode(iterationNode);
        }
    }

    public void put(int i, Object content) {
        if (i == 0) {
            head.setContent(content);
        } else {
            Node7_2 iterationNode = head;
            for (int j = 0; j < i; j++) {
                iterationNode = iterationNode.getNextNode();
            }
            if (iterationNode != null) {
                iterationNode.setContent(content);
            }
            else {
                System.out.println("Index " + i + " out of list's length");
            }
        }
    }



    public int size() {
        if (head == null) {
            return 0;
        }

        int size = 1;
        Node7_2 iterationNode = head;
        for (; iterationNode.getNextNode() != null; size++) {
            iterationNode = iterationNode.getNextNode();
        }
        return size;
    }

    public Object get(int index) {

        Node7_2 iterationNode = head;
        for (int i = 0; i < index; i++) {
            iterationNode = iterationNode.getNextNode();
        }

        return iterationNode.getContent();
    }

    public void remove(int index) {

        if (index == 0) {
            head = head.getNextNode();
        } else {

            Node7_2 iterationNode = head;
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
        Node7_2 iterationNode = head;
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
        return new LList7_2.LListIterator(head);
    }

    public static class LListIterator implements Iterator<Object> {

        private Node7_2 iterationNode;

        public LListIterator(Node7_2 head) {
            iterationNode = head;
        }

        @Override
        public boolean hasNext() {
            return iterationNode != null;
        }

        @Override
        public Node7_2 next() {
            Node7_2 nextNode = iterationNode;
            iterationNode = iterationNode.getNextNode();
            return nextNode;
        }
    }

}
