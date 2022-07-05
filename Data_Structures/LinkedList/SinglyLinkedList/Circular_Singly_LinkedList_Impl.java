package LinkedList.SinglyLinkedList;

import java.util.Scanner;

class Node_5
{
    int data;
    Node_5 next;
    public Node_5(int x)
    {
        this.data=x;
        this.next=null;
    }
}
class Circular_Singly_LinkedList_1
{
    public Node_5 head,tail=null;
    public int size=0;

    public void create(int data)
    {
        Node_5 nw=new Node_5(data);
        if(head==null)
        {
            head=tail=nw;
            tail.next=head;
            size++;
            System.out.println("Element Instered "+nw.data);
        }
        else
        {
            tail.next=nw;
            tail=nw;
            tail.next=head;
            size++;
            System.out.println("Element Inserted "+nw.data);
        }
    }
    public void insert_Beginning(int data)
    {
        Node_5 nw=new Node_5(data);
        if(head==null)
        {
            head=tail=nw;
            tail.next=head;
            size++;
            System.out.println("Element Inserted at Beginning "+nw.data);
        }
        else
        {
            nw.next=head;
            head=nw;
            tail.next=head;
            size++;
            System.out.println("Element Inserted at Beginning "+nw.data);
        }

    }
    public void insert_end(int data)
    {
        Node_5 nw=new Node_5(data);
        if(head==null)
        {
            head=tail=nw;
            tail.next=head;
            size++;
            System.out.println("Element Inserted AT end "+nw.data);
        }
        else
        {
            tail.next=nw;
            tail=nw;
            nw.next=head;
            size++;
            System.out.println("Element Inserted  at End "+nw.data);

        }
    }
    public void insert_position(Scanner obj)
    {
        System.out.println();
        System.out.println("Enter the position you vwant to add the Element");
        int pos=obj.nextInt();
        System.out.println("Enter the Number to add");
        int num=obj.nextInt();
        Node_5 nw=new Node_5(num);
        if(pos>size)
        {
            System.out.println("Exceeds Limit");
        }
        else
        {
            int i=1;
            Node_5 temp=head;
            while (i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            nw.next=temp.next;
            temp.next=nw;
            size++;

            System.out.println("Element Inserted at Given Position "+pos+" value is " +nw.data);
        }
    }

    public void delete_begin()
    {
        if(head==null)
        {

            System.out.println("list is empty");
        }
        else
        {
            head=head.next;
            tail.next=head;
            size--;
            System.out.println("Element Deleted at the Beginning");
        }
    }
    public void delete_end()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node_5 temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
            System.out.println("Element Deleted at the End");
        }
    }


    public void display()
    {
        Node_5 temp=head;
        System.out.println();
        while(temp.next!=head)
        {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print(" "+temp.data);

    }
}

public class Circular_Singly_LinkedList_Impl {


    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Circular_Singly_LinkedList_1 sl=new Circular_Singly_LinkedList_1();
        sl.create(10);
        sl.create(20);
        sl.create(30);
        sl.create(40);
        sl.create(50);
        sl.display();
        sl.insert_Beginning(5);
        sl.display();
        sl.insert_end(60);
        sl.display();
        sl.insert_position(obj);
        sl.display();
        sl.delete_begin();
        sl.display();
        sl.delete_end();
        sl.display();

    }
}
