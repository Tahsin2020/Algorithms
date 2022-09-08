package Linked_List;

public class Linked_List {
    Linked_Node Head=null;

    public Linked_List(){}

    public Linked_List(Linked_Node Head) {
        this.Head = Head;
    }

    public int size() {
        int count = 0;
        Linked_Node node = this.Head;
        while (node!=null) {
            count++;
            node = node.Next;
        }
        return count;
    }
    public void clear() {
        this.Head = null;
    }
    public Linked_Node getLast() {
        Linked_Node lastNode = this.Head;
        if (lastNode!=null) {
            while (lastNode.Next!=null) {
                lastNode = lastNode.Next;
            }
        }
        return lastNode;
    }
    public Linked_Node getFirst() {
        return this.Head;
    }
    public void Push(Linked_Node newHead){
        newHead.Next=this.Head;
        Head=newHead;
    }
    public Linked_Node Pull(){
        Linked_Node Return = this.Head;
        this.Head=this.Head.Next;
        return Return;
    }
}
