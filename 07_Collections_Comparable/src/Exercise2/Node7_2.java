package Exercise2;

public class Node7_2 {
    private Node7_2 nextNode;
    private Node7_2 previousNode;
    private Object content;

    public Node7_2(Object content) {
        this.content = content;
    }

    public Node7_2 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node7_2 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node7_2 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node7_2 previousNode) {
        this.previousNode = previousNode;
    }
}
