package Exercise1;

public class Node7_1 {
    private Node7_1 nextNode;
    private Node7_1 previousNode;
    private Object content;

    public Node7_1(Object content) {
        this.content = content;
    }

    public Node7_1 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node7_1 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node7_1 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node7_1 previousNode) {
        this.previousNode = previousNode;
    }
}
