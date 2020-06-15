package Excercise2;

public class Node09_3 {
    private Node09_3 nextNode;
    private Node09_3 previousNode;
    private Object content;

    //Aufgabe 5
/*    @Override
    public String toString() {
        return (String) content;
    }*/

    public Node09_3(Object content) {
        this.content = content;
    }

    public Node09_3 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node09_3 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node09_3 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node09_3 previousNode) {
        this.previousNode = previousNode;
    }
}
