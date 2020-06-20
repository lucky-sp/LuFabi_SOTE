package Exercise10_1;

import Excercise2.Exceptions.ListISEmptyException;
import Excercise2.Exceptions.OutOfRangeException;

import java.util.Iterator;

public class LList10_1<T> implements Iterable<Object> {
    private Node10_1 head;

    public void insert(Object content) {
        if (head == null) {
            head = new Node10_1(content);
        } else {

            Node10_1 iterationNode = head;

            while (iterationNode.getNextNode() != null) {
                iterationNode = iterationNode.getNextNode();
            }

            Node10_1 newNode = new Node10_1(content);
            iterationNode.setNextNode(newNode);
            newNode.setPreviousNode(iterationNode);
        }
    }

    //Aufgabe 2
    public void put(int i, Object content) throws ListISEmptyException, OutOfRangeException {
        if (head == null) {
/////////////////////////// Exception
            throw new ListISEmptyException("List is empty, cannot put on index");
        }
        if (i == 0) {
            head.setContent(content);
        } else {
            Node10_1 iterationNode = head;
            try {
                for (int j = 0; j < i; j++) {
                    iterationNode = iterationNode.getNextNode();
                }
                if (iterationNode != null) {
                    iterationNode.setContent(content);
                }
            } catch (NullPointerException e) {

//////////////////////// Exception
                throw new OutOfRangeException("Index " + i + " out of list's length");
            }
        }
    }

    //Aufgabe 3
    public void insertOnIndex(int index, Object content) throws ListISEmptyException {
        if (head == null) {
/////////////////////// Exception
            throw new ListISEmptyException("List is empty, cannot insert on index");
        }
        if (index == 0) {
            Node10_1 previousHead = head;
            head = new Node10_1(content);
            head.setNextNode(previousHead);
            previousHead.setPreviousNode(head);
        } else {
            Node10_1 iterationNode = head;
            for (int j = 0; j < index; j++) {
                iterationNode = iterationNode.getNextNode();
            }
            if (iterationNode != null) {
                Node10_1 previousPreviousNode = iterationNode.getPreviousNode();
                Node10_1 previousNode = iterationNode;
                iterationNode = new Node10_1(content);
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
        Node10_1 iterationNode = head;
        for (; iterationNode.getNextNode() != null; size++) {
            iterationNode = iterationNode.getNextNode();
        }
        return size;
    }

    public Object get(int index) {
        Node10_1 iterationNode = head;
        for (int i = 0; i < index; i++) {
            iterationNode = iterationNode.getNextNode();
        }

        return iterationNode.getContent();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNextNode();
        } else {

            Node10_1 iterationNode = head;
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
    public boolean removeOnObject(Object content) {
        if (head == null) {
            return false;
        }
        Node10_1 iterationNode = head;
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
    public boolean contains(Object content) {
        if (head == null) {
            System.out.println("List is empty, cannot search on object");
            return false;
        }
        Node10_1 iterationNode = head;
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
        return new LList10_1.LListIterator(head);
    }

    public static class LListIterator implements Iterator<Object> {

        private Node10_1 iterationNode;

        public LListIterator(Node10_1 head) {
            iterationNode = head;
        }

        @Override
        public boolean hasNext() {
            return iterationNode != null;
        }

        @Override
        public String next() {
            Node10_1 nextNode = iterationNode;
            iterationNode = iterationNode.getNextNode();
            return (String) nextNode.getContent();
        }
    }
}

