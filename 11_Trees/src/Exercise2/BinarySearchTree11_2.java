package Exercise2;

public class BinarySearchTree11_2 {
    private Node11_2 head;

    public void insert(int value) {

        if (head == null) {
            head = new Node11_2(value);
        } else {
            head.insert(value);
        }
    }

    public int size() {

        if (head == null) {
            return 0;
        }

        return head.size();
    }

    public void print() {

        if (head != null) {

            head.print();
        }
    }
    public boolean contains(int value) {
        while (head != null) {
            if (value < head.value) {
                head = head.left;
            } else if (value > head.value) {
                head = head.right;
            } else
                return true;
        }
        return false;
    }
}
