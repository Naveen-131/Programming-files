package DSA.Queue;
 
import java.util.Stack;

public class Queueusing1Stack { 
 public static void main(String[] args) {
  //QueueUsingSingleStack queueUsingStack = new QueueUsingSingleStack();
 
  /*queueUsingStack.enQueue(10);
  queueUsingStack.enQueue(20);
  queueUsingStack.enQueue(30);
  queueUsingStack.enQueue(40);
 
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
 
  queueUsingStack.enQueue(50);
  queueUsingStack.enQueue(60);
 
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();
  queueUsingStack.deQueue();*/
  QueueUsingSingleStack qs = new QueueUsingSingleStack();
  qs.enQueue(10);
  qs.enQueue(20);
  qs.enQueue(30);
  qs.deQueue();
  qs.deQueue();
 }
}
 
class QueueUsingSingleStack{
 Stack<Integer> stack = new Stack<Integer>();
 
 public void enQueue(int data)
 {	 
   stack.push(data);
   System.out.println("Data Inserted.."+data);
 }
 
 public void deQueue(){
  if(stack.size()<1){
   System.out.println("Nothing to deQueue");
   return;
  }
 
  if(stack.size()==1){
   System.out.println("Element Removed is.. "+stack.pop());
   return;
  }
 
  int data = stack.pop();
  deQueue();
  stack.push(data);
 }
}
