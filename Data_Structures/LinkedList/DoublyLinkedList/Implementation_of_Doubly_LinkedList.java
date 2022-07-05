package LinkedList.DoublyLinkedList;

import java.util.Scanner;

class Node_1
{
    int data;
    Node_1 next;
    Node_1 prev;
    public Node_1(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Linked_list_1
{
    public Node_1 head=null,temp=null;
    public int size=0;

    public void insert(int num)
    {
        Node_1 nw=new Node_1(num);
        if(head==null)
        {
            head=temp=nw;
            size++;
            System.out.println("Element Inserted");
        }
        else
        {
            temp.next=nw;
            nw.prev=temp;
            temp=temp.next;
            size++;
            System.out.println("Element Inserted");
        }
    }
    public void display()
    {
        Node_1 temp=head;
        while (temp!=null)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
        }
    }
    public void get_size()
    {
        System.out.println("Size of the List: "+size);
    }
}

public class Implementation_of_Doubly_LinkedList {
    
    public static void main(String [] args)
    {
        Linked_list_1 li=new Linked_list_1();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.insert(50);
        li.display();
        li.get_size();
        
    }
}
