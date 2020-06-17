package Exercise0;

public class Node8_0 {
    private Node8_0 nextNode;
    private Node8_0 previousNode;
    private Object content;

    public Node8_0(Object content) {
        this.content = content;
    }

    public Node8_0 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node8_0 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node8_0 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node8_0 previousNode) {
        this.previousNode = previousNode;
    }
}
