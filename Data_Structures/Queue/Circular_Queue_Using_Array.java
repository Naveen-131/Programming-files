package Queue;
import java.util.*;

class circular_queue
{
    int front=-1,rear=-1;
    int n=5;
    int[] arr =new int[n];
    public void enqueue()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter the number");
        int x=obj.nextInt();
        if( front==-1 && rear==-1 )
        {
            front=rear=0;
            arr[rear]=x;
            System.out.println("Element Inserted");
        }
        else if((rear+1)%n==front)
        {
            System.out.println("\nQueue iS full");
        }
        else
        {
            rear=(rear+1)%n;
            arr[rear]=x;
        }
    }
    public void dequeue()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("\nQueue is Empty");

        }
        else if(front==rear)
        {
            System.out.println("Dequeued Element:"+arr[front]);
            front=rear=-1;
        }
        else
        {
            System.out.println("\nDequeued element:"+arr[front]);
            front=(front+1)%n;
        }
    }
    public void peek()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("\nQueue is empty");

        }
        else
        {
            System.out.println("\nPeeked Element:"+arr[front]);
        }

    }
    public void display()
    {
        int i=front;

        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.print("\nCircular queue elements are:");
            while(i!=rear)
            {
                System.out.print(" "+arr[i]);
                i=(i+1)%n;
            }
            System.out.print(" "+arr[rear]);
        }
    }
}



public class Circular_Queue_Using_Array {

    public static void main(String[] args)
    {
        circular_queue c=new circular_queue();
        Scanner obj=new Scanner(System.in);
        int choice=0;

        while(choice!=5)
        {
            System.out.println("\nChoose the option");
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.Exit/n");
            System.out.println("Enter the option");
            choice=obj.nextInt();
            switch (choice)
            {
                case 1:
                    c.enqueue();
                    break;
                case 2:
                    c.dequeue();
                    break;
                case 3:
                    c.peek();
                    break;
                case 4:
                    c.display();
                    break;
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("enter valid choice");
            }
        }



    }



}
