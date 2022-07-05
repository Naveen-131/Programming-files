package Queue;

import java.util.Scanner;

class queue
{
    int n=10;
    int[] arr =new int[n];
    int front,rear=-1;
    public void enqueue(Scanner obj)
    {
        System.out.println("enter the number");
        int x=obj.nextInt();
        if(rear==n-1)
        {
            System.out.println("Overflow");
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            arr[rear]=x;
        }
        else
        {
            rear++;
            arr[rear]=x;
            System.out.println("Inserted Element:"+arr[rear]);
        }
    }
    public void dequeue()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Underflow");
        }
        else if(front==rear)
        {
            System.out.println("Dequeued element:"+arr[front]);
            front=rear=-1;
        }
        else
        {
            System.out.println("Dequeued element:"+arr[front]);
            front++;
        }
    }
    public void peek()
    {
        System.out.println("Peeked Element:"+arr[front]);
    }
    public void display()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]);
            }
        }
    }


}
public class Queue_Impl_Using_Array {

    public static void main(String[] args)
    {
        queue q=new queue();
        Scanner obj=new Scanner(System.in);
        int choice=0;

        while(choice!=5)
        {
            System.out.println("Choose an Option");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.exit");
            choice= obj.nextInt();
            switch(choice)
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
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the Valid Choice");

            }
        }




    }

}
