package STACK_and_QUEUE;

public class DynamicCustomStack extends CustomStackImplementation {

   public DynamicCustomStack(){
       super();
   }

   public DynamicCustomStack(int size){
       super(size);
   }

   public boolean push(int item){
       if(isFull()){
           System.out.println("Stack is Full...!");
           return false;
       }

       int[] temp=new int[data.length*2];
       for(int i=0;i< data.length;i++){
           temp[i]=data[i];
       }
       data=temp;
       return super.push(item);
   }
}
