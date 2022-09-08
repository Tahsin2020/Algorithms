package Linked_List;

public class Linked_Node {
    int value;
    Linked_Node Next = null;

    public Linked_Node(int value){
        this.value=value;
    }

    public Linked_Node(int value,Linked_Node Next){
        this.Next=Next;
        this.value=value;
    }

    public int getValue() {
        return this.value;
    }
}
