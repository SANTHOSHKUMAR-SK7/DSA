package STACK_and_QUEUE;

public class Cqueue {
    public static void main(String[] args) throws Exception {
        CustomImplementationQueue q=new CustomImplementationQueue();
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.front();
        q.remove();
        q.display();
    }
}
