package Exercise1;

public class Node11_1 {
    public int value;
    public Node11_1 left;
    public Node11_1 right;

    public Node11_1(int value) {
        this.value = value;
    }

    public void insert(int value) {

        if(value<this.value) {

            if(left == null) {
                left = new Node11_1(value);
            }else {
                left.insert(value);
            }
        }else if(value>this.value) {
            if(right==null) {
                right = new Node11_1(value);
            }else {
                right.insert(value);
            }
        }
    }

    public int size() {
        int size = 1;

        if(left !=null) {
            size+= left.size();
        }

        if(right !=null) {
            size+= right.size();
        }

        return size;
    }

    public void print() {

        if(left !=null) {
            left.print();
        }

        System.out.println(value);

        if(right!=null) {
            right.print();
        }
    }

}
