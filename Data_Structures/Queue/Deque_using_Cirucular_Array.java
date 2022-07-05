package Queue;
import java.util.Scanner;

class deque{

    int n=5;
    int[] arr=new int[n];
    int front=-1;
    int rear=-1;
    public void enqueue_front(Scanner obj)
    {
        System.out.println("Enter the number");
        int x=obj.nextInt();
        if((rear+1)%n==front)
        {
            System.out.println("Queue is Full");
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            arr[front]=x;
            System.out.println("Element Inserted at front:"+x);
        }
        else if(front==n-1)
        {
            front=n-1;
            arr[front]=x;
            System.out.println("Element Inserted at front:"+x);
        }
        else
        {
            front--;
            arr[front]=x;
            System.out.println("Element Inserted at front:"+x);
        }
    }
    public void enqueue_rear(Scanner obj)
    {
        System.out.println("Enter the number");
        int x=obj.nextInt();
        if((rear+1)%n==front)
        {
            System.out.println("Queue is Full");
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            arr[rear]=x;
            System.out.println("Element Inserted at rear:"+x);
        }
        else if(rear==n-1)
        {
            rear=0;
            arr[rear]=x;
            System.out.println("Element Inserted at rear:"+x);
        }
        else
        {
            rear++;
            arr[rear]=x;
            System.out.println("Element Inserted at rear:"+x);
        }
    }
    public void dequeue_front()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(front==rear)
        {
            System.out.println("Removed Element at front:"+arr[front]);
            front=rear=-1;
        }
        else if(front==n-1)
        {
            System.out.println("Removed Element at front:"+arr[front]);
            front=0;
        }
        else
        {
            System.out.println("Removed Element at front:"+arr[front]);
            front++;
        }
    }
    public void dequeue_rear()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(front==rear)
        {
            System.out.println("Removed Element at rear"+arr[rear]);
        }
        else if(rear==0)
        {
            System.out.println("Removed element at rear:"+arr[rear]);
            rear=n-1;
        }
        else
        {
            System.out.println("Removed element at rear"+arr[rear]);
            rear--;
        }
    }
    public void display()
    {
        int i=front;
        while(i!=rear)
        {
            System.out.println(arr[i]+" ");
            i=(i+1)%n;
        }
        System.out.print(arr[rear]);
    }
    public void getRear()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Rear Element:"+arr[rear]);
        }
    }

    public void getFront()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Front element:"+arr[front]);
        }
    }
}
public class Deque_using_Cirucular_Array{


    public static void main(String [] args)
    {
        deque q=new deque();
        Scanner obj=new Scanner(System.in);
        int choice=0;
        while(choice!=8)
        {

            System.out.println("\n1.EnqueueFront\n2.EnqueueRear\n3.DequeueFront\n4.DequeueRear\n5.Get_Front\n6.Get_Rear\n7.Display\n8.Exit");
            System.out.println("Enter the choice");
            choice=obj.nextInt();
            switch (choice)
            {
                case 1:
                    q.enqueue_front(obj);
                    break;
                case 2:
                    q.enqueue_rear(obj);
                    break;
                case 3:
                    q.dequeue_front();
                    break;
                case 4:
                    q.dequeue_rear();
                    break;
                case 5:
                    q.getFront();
                    break;
                case 6:
                    q.getRear();
                    break;
                case 7:
                    q.display();
                    break;
                case 8:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Enter the valid option");
            }



        }

    }

}
