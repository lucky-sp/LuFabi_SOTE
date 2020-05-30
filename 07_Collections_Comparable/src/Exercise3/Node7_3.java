package Exercise3;

public class Node7_3 {
    private Node7_3 nextNode;
    private Node7_3 previousNode;
    private Object content;

    public Node7_3(Object content) {
        this.content = content;
    }

    public Node7_3 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node7_3 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node7_3 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node7_3 previousNode) {
        this.previousNode = previousNode;
    }
}
