package Exercise4;

public class Node7_4 {
    private Node7_4 nextNode;
    private Node7_4 previousNode;
    private Object content;

    public Node7_4(Object content) {
        this.content = content;
    }

    public Node7_4 getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node7_4 nextNode) {
        this.nextNode = nextNode;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }

    public Node7_4 getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node7_4 previousNode) {
        this.previousNode = previousNode;
    }
}
