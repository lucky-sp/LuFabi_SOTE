package Exercise2;

public class Main11_2 {
    public static void main(String[] args) {

        BinarySearchTree11_2 bst = new BinarySearchTree11_2();
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
       // bst.insert(9);
      //  bst.insert(2);
       // bst.insert(2);

        //System.out.println("size: "+bst.size());

        //bst.print();
        //System.out.println("Does it contain your value?: " + bst.contains(2));
        System.out.println("Is the tree full?: " + bst.isFullTree());
    }
}
