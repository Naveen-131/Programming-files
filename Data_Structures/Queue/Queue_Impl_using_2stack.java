package Queue;
import java.util.Scanner;
import java.util.Stack;

class Queue_Stack
{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int top1=-1,top2=-1;
    public void enqueue(Scanner obj)
    {
        System.out.println("Enter the number");
        int x=obj.nextInt();
        s1.push(x);

    }
    public void dequeue()
    {
        if(s1.isEmpty() && s2.isEmpty())
        {
            System.out.println("Queue is empty");
        }
        if(s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            System.out.println("Removed Elemnet from queue:"+s2.pop());
        }
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    public void peek()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            if(s2.isEmpty())
            {
                while(!s1.isEmpty())
                {
                    s2.push(s1.pop());
                }
                System.out.println("Front/Rear Element:"+s2.pop());
            }
            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }

        }

    }
    public void display()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i:s1)
            {
                System.out.print(i+" ");
            }
        }

    }

}
public class Queue_Impl_using_2stack {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        Queue_Stack q=new Queue_Stack();
        int choice=0;
        while(choice!=5)
        {
            System.out.println("Choose the option.\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.Exit");
            System.out.println("Enter the Choice");
            choice=obj.nextInt();
            switch (choice)
            {
                case 1:
                    q.enqueue(obj);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the valid choice");

            }

        }


    }
}
