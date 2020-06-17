package Exercise0;

import java.util.Iterator;
import java.util.List;

public class LList8_0<T> implements Iterable<Object> {
    private Node8_0 head;


    public void insert(T content) {
        if (head == null) {
            head = new Node8_0(content);
        } else {

            Node8_0 iterationNode = head;

            while (iterationNode.getNextNode() != null) {
                iterationNode = iterationNode.getNextNode();
            }

            Node8_0 newNode = new Node8_0(content);
            iterationNode.setNextNode(newNode);
            newNode.setPreviousNode(iterationNode);
        }
    }

    //Aufgabe 2
    public void put(int i, T content) {
        if (head == null) {
            System.out.println("List is empty, cannot put on index");
            return;
        }
        if (i == 0) {
            head.setContent(content);
        } else {
            Node8_0 iterationNode = head;
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
    public void insertOnIndex(int index, T content) {
        if (head == null) {
            System.out.println("List is empty, cannot insert on index");
            return;
        }
        if (index == 0) {
            Node8_0 previousHead = head;
            head = new Node8_0(content);
            head.setNextNode(previousHead);
            previousHead.setPreviousNode(head);
        } else {
            Node8_0 iterationNode = head;
            for (int j = 0; j < index; j++) {
                iterationNode = iterationNode.getNextNode();
            }
            if (iterationNode != null) {
                Node8_0 previousPreviousNode = iterationNode.getPreviousNode();
                Node8_0 previousNode = iterationNode;
                iterationNode = new Node8_0(content);
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
        Node8_0 iterationNode = head;
        for (; iterationNode.getNextNode() != null; size++) {
            iterationNode = iterationNode.getNextNode();
        }
        return size;
    }

    public Object get(int index) {
        Node8_0 iterationNode = head;
        for (int i = 0; i < index; i++) {
            iterationNode = iterationNode.getNextNode();
        }

        return iterationNode.getContent();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNextNode();
        } else {

            Node8_0 iterationNode = head;
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

    //Aufgabe 4
    public boolean removeOnObject(T content) {
        if (head == null) {
            return false;
        }
        Node8_0 iterationNode = head;
        int index = 0;
        if (iterationNode.getContent().equals(content)) {
            remove(index);
            return true;

        } else {
            while (iterationNode.getNextNode() != null) {
                iterationNode = iterationNode.getNextNode();
                index += 1;
                if (iterationNode.getContent().equals(content)) {
                    remove(index);
                    return true;
                }
            }

        }
        if (iterationNode.getNextNode() == null) {
            index += 1;
            if (iterationNode.getContent().equals(content)) {
                remove(index);
                return true;
            }
        }

        return false;
    }

    //Aufgabe 1
    public boolean contains(T content) {
        if (head == null) {
            System.out.println("List is empty, cannot search on object");
            return false;
        }
        Node8_0 iterationNode = head;
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
        return new LList8_0.LListIterator(head);
    }

    public static class LListIterator implements Iterator<Object> {

        private Node8_0 iterationNode;

        public LListIterator(Node8_0 head) {
            iterationNode = head;
        }

        @Override
        public boolean hasNext() {
            return iterationNode != null;
        }

        @Override
        public Node8_0 next() {
            Node8_0 nextNode = iterationNode;
            iterationNode = iterationNode.getNextNode();
            return nextNode;
        }
    }
}
