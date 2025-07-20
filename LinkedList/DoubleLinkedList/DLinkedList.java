package LinkedList.DoubleLinkedList;

public class DLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DLinkedList(){
        this.size=0;
    }

    public void insertFirstDLL(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
    }

    public void displayDll(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public void insertLastDLL(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirstDLL(val);
        }
    }

    public void insertCustomDLL(int val,int index){
        Node node = getNode(index);

    }

    public Node getNode(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void displayRevDll(){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.val+" -> ");
            temp = temp.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
