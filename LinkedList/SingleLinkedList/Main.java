package LinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirstLL(7);
        ll.insertFirstLL(2);
        ll.insertFirstLL(71);
        ll.insertFirstLL(74);
        ll.displayLL();
        ll.insertLastLL(123);
        ll.displayLL();
        ll.insertCustom(22,2);
        ll.displayLL();
        System.out.println(ll.deleteFirst());
        ll.displayLL();
        System.out.println(ll.deleteLast());
        ll.displayLL();
        System.out.println(ll.deleteIndex(2));
        ll.displayLL();

    }
}