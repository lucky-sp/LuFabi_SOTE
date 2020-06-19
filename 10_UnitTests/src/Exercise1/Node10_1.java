package Exercise1;

public class Node10_1 {
    private Node10_1 nextNode;
    private Node10_1 previousNode;
    private Object content;

    public Node10_1(Object content) {
        this.content = content;
    }

    public Node10_1 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node10_1 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node10_1 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node10_1 previousNode) {
        this.previousNode = previousNode;
    }
}
