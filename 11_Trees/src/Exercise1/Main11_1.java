package Exercise1;

public class Main11_1 {
    public static void main(String[] args) {

        BinarySearchTree11_1 bst = new BinarySearchTree11_1();
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
        bst.insert(9);
        bst.insert(2);
        bst.insert(2);

        //System.out.println("size: "+bst.size());

        //bst.print();
        System.out.println("Does it contain your value?: " + bst.contains(2));
    }
}
