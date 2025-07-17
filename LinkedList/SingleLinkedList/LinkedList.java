package LinkedList.SingleLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirstLL(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        size++;
        if(tail == null){
            tail=head;
        }
    }

    public void insertLastLL(int val){
        if (tail==null){
            insertFirstLL(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertCustom(int val,int index){
        if(index==0){
            insertFirstLL(val);
            return;
        }
        if(index== size){
            insertLastLL(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i< index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void displayLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        Node node = head;
        int val = node.value;
        head=node.next;
        size--;
        return val;
    }

    public int deleteLast(){
        Node SecondLast=getNode(size-2);
        int value = SecondLast.next.value;
        SecondLast.next=null;
        tail=SecondLast;
        size--;
        return value;
    }

    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node node = getNode(index-1);
        int val= node.next.value;
        node.next = node.next.next;
        size--;
        return val;
    }

    public Node getNode(int index){
        Node node = head;
        for(int i =0 ; i< index;i++){
            node=node.next;
        }
        return node;
    }
}