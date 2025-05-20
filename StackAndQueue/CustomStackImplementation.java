package STACK_and_QUEUE;

public class CustomStackImplementation {

  protected int[] data;
  private static final int D_SIZE=10;
  int ptr=-1;

  public CustomStackImplementation(int size){
      this.data=new int[size];
  }

  public CustomStackImplementation(){
      this(D_SIZE);
  }

  public boolean isFull(){
      return ptr==data.length-1;
  }

  public boolean isEmpty(){
      return ptr==-1;
  }

  public boolean push(int item){
      if(isFull()){
          System.out.println("Hey!!Stack is full..!");
          return false;
      }
      data[++ptr]=item;
      return true;
  }

  public int pop() throws CustomException{
      if(isEmpty()){
          throw new CustomException("Stack is Empty....!");
      }
      return data[ptr--];
  }

  public int peek() throws CustomException{
      if(isEmpty()){
          throw new CustomException("Stack is Empty...!");
      }
      return data[ptr];
  }

}
