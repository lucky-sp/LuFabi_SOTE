package Exercise3;

import java.util.Iterator;

public class LList7_3 implements Iterable<Object> {
    private Node7_3 head;

    public void insert(Object content) {
        if (head == null) {
            head = new Node7_3(content);
        } else {

            Node7_3 iterationNode = head;

            while (iterationNode.getNextNode() != null) {
                iterationNode = iterationNode.getNextNode();
            }

            Node7_3 newNode = new Node7_3(content);
            iterationNode.setNextNode(newNode);
            newNode.setPreviousNode(iterationNode);
        }
    }

    //Aufgabe 2
    public void put(int i, Object content) {
        if(head == null) {
            System.out.println("List is empty, cannot put on index");
            return;
        }
        if (i == 0) {
            head.setContent(content);
        } else {
            Node7_3 iterationNode = head;
            for (int j = 0; j < i; j++) {
                iterationNode = iterationNode.getNextNode();
            }
            if (iterationNode != null) {
                iterationNode.setContent(content);
            } else {
                System.out.println("Index " + i + " out of list's length");
            }
        }
    }

    //Aufgabe 3
    public void insertOnIndex(int index, Object content) {
        if(head == null) {
            System.out.println("List is empty, cannot insert on index");
            return;
        }
        if (index == 0) {
            Node7_3 previousHead = head;
            head = new Node7_3(content);
            head.setNextNode(previousHead);
            previousHead.setPreviousNode(head);
        } else {
            Node7_3 iterationNode = head;
            for (int j = 0; j < index; j++) {
                iterationNode = iterationNode.getNextNode();
            }
            if (iterationNode != null) {
                Node7_3 previousPreviousNode = iterationNode.getPreviousNode();
                Node7_3 previousNode = iterationNode;
                iterationNode = new Node7_3(content);
                previousPreviousNode.setNextNode(iterationNode);
                iterationNode.setNextNode(previousNode);
                previousNode.setPreviousNode(iterationNode);
            } else {
                System.out.println("Index " + index + " out of list's length");
            }
        }
    }


    public int size() {
        if (head == null) {
            return 0;
        }

        int size = 1;
        Node7_3 iterationNode = head;
        for (; iterationNode.getNextNode() != null; size++) {
            iterationNode = iterationNode.getNextNode();
        }
        return size;
    }

    public Object get(int index) {

        Node7_3 iterationNode = head;
        for (int i = 0; i < index; i++) {
            iterationNode = iterationNode.getNextNode();
        }

        return iterationNode.getContent();
    }

    public void remove(int index) {

        if (index == 0) {
            head = head.getNextNode();
        } else {

            Node7_3 iterationNode = head;
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

    //Aufgabe 1
    public boolean contains(Object content) {
        if (head == null) {
            System.out.println("List is empty, cannot search on object");
            return false;
        }
        Node7_3 iterationNode = head;
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
        if (iterationNode.getNextNode() == null) {
            if (iterationNode.getContent().equals(content)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator<Object> iterator() {
        return new LList7_3.LListIterator(head);
    }

    public static class LListIterator implements Iterator<Object> {

        private Node7_3 iterationNode;

        public LListIterator(Node7_3 head) {
            iterationNode = head;
        }

        @Override
        public boolean hasNext() {
            return iterationNode != null;
        }

        @Override
        public Node7_3 next() {
            Node7_3 nextNode = iterationNode;
            iterationNode = iterationNode.getNextNode();
            return nextNode;
        }
    }

}
