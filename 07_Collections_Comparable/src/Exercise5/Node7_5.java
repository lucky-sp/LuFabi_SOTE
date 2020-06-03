package Exercise5;

public class Node7_5 {
    private Node7_5 nextNode;
    private Node7_5 previousNode;
    private Object content;

    //Aufgabe 5
/*    @Override
    public String toString() {
        return (String) content;
    }*/

    public Node7_5(Object content) {
        this.content = content;
    }

    public Node7_5 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node7_5 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node7_5 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node7_5 previousNode) {
        this.previousNode = previousNode;
    }
}
