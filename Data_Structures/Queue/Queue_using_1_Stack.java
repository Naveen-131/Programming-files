package Queue;
import java.util.Stack;
class queue_1_stack
{
    Stack<Integer> s1=new Stack<Integer>();

    public void enqueue(int data)
    {
        s1.push(data);
        System.out.println("Inserted Element:"+data);

    }
    public void dequeue()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is empty");
        }
        if(s1.size()==1)
        {
            System.out.println("Removed Elemnet"+s1.pop());
        }
        int data=s1.pop();
        dequeue();
        s1.push(data);


    }

}
public class Queue_using_1_Stack {
    public static void main(String[] args)
    {
        queue_1_stack q=new queue_1_stack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.dequeue();


    }
}
