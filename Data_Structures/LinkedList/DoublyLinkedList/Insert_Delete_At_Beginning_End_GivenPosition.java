package LinkedList.DoublyLinkedList;

import java.util.Scanner;

class Node_2
{
    int data;
    Node_2 next;
    Node_2 prev;
    public Node_2(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Double_LinkedList
{
    public Node_2 head=null,tail=null;
    public int size=0;

    public void create(int data)
    {
        Node_2 nw=new Node_2(data);
        if(head==null)
        {
            head=tail=nw;
            size++;
            System.out.println("Element Inserted "+tail.data);
        }
        else
        {
            tail.next=nw;
            nw.prev=tail;
            tail=nw;
            size++;
            System.out.println("Element Inserted "+tail.data);
        }

    }

    public void insert_beginning(int data)
    {
        Node_2 nw=new Node_2(data);
        if(head==null)
        {
            head=tail=nw;
            size++;
            System.out.println("Element Inserted "+tail.data);
        }
        else
        {
            nw.next=head;
            head.prev=nw;
            head=nw;
            size++;
            System.out.println("Element Inserted "+head.data);

        }
    }
    public void insert_End(int data)
    {
        Node_2 nw=new Node_2(data);
        if(head==null)
        {
            head=tail=nw;
            size++;
            System.out.println("Element Inserted "+tail.data);
        }
        else
        {
            nw.prev=tail;
            tail.next=nw;
            tail=nw;
            size++;
            System.out.println("Element Inserted "+tail.data);
        }
    }

    public void insert_at_GivenPostion(Scanner obj)
    {
        System.out.println("Enter the position You want to add");
        int pos=obj.nextInt();
        System.out.println("Enter the number");
        int num=obj.nextInt();
        Node_2 nw=new Node_2(num);

        if(pos>size)
        {
            System.out.println("Exceeds the Boundary limit");
        }
        else if(pos==1)
        {
            insert_End(num);
        }
        else
        {
            int i=1;
            Node_2 temp=head;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            nw.prev=temp;
            nw.next=temp.next;
            temp.next=nw;
            nw.next.prev=nw;
            size++;
            System.out.println("Element inserted at "+pos+" value is "+nw.data);

        }
    }
    public void insert_After_Position(Scanner obj)
    {
        System.out.println("Enter the position ");
        int pos=obj.nextInt();
        System.out.println("Enter the data to add after the given position");
        int num=obj.nextInt();
        Node_2 nw=new Node_2(num);
        if(pos>size)
        {
            System.out.println("Exceeds the Limit");
        }
        else
        {
            int i=1;
            Node_2 temp=head;
            while(i<pos)
            {
                temp=temp.next;
                i++;
            }
            nw.prev=temp;
            nw.next=temp.next;
            temp.next=nw;
            nw.next.prev=nw;
            size++;
            System.out.println("Element added after the position"+nw.data);
        }
    }


    public void delete_Beginning()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            head=head.next;
            head.prev=null;
            size--;
            System.out.println("Element is Deleted at beginning");
        }
    }
    public void delete_End()
    {
        if(head==null || tail==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            tail=tail.prev;
            tail.next=null;
            size--;
            System.out.println("Element deleted at end");

        }
    }
    public void delete_At_Position(Scanner obj) {
        System.out.println("Enter the position to delete");
        int pos = obj.nextInt();
        if (pos > size)
        {
            System.out.println("Exceeds Limit");
        }
        else
        {
            Node_2 temp=head;
            int i=1;
            while(i<pos)
            {
                temp=temp.next;
                i++;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            size--;
            System.out.println("Element deleted at given position"+temp.data);
        }
    }
    public void display()
    {
        Node_2 temp=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println();
            while (temp!=null)
            {
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
    }
}

public class Insert_Delete_At_Beginning_End_GivenPosition {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        Double_LinkedList dl=new Double_LinkedList();
        dl.create(10);
        dl.create(20);
        dl.create(30);
        dl.create(40);
        dl.create(50);
        dl.display();
        dl.insert_beginning(5);
        dl.display();
        dl.insert_End(60);
        dl.display();
        dl.insert_at_GivenPostion(obj);
        dl.display();
        dl.delete_Beginning();
        dl.display();
        dl.delete_End();
        dl.display();
        dl.insert_After_Position(obj);
        dl.display();
        dl.delete_At_Position(obj);
        dl.display();
    }
}
