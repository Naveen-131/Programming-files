package LinkedList.SinglyLinkedList;

class Node_4
{
    int data;
    Node_4 next;
    public Node_4(int x)
    {
        this.data=x;
        this.next=null;
    }
}
class Circular_Singly
{
    public Node_4 head,tail=null;
    public int size=0;
    public void insert(int data)
    {
        Node_4 nw=new Node_4(data);
        if(head==null)
        {
            head=tail=nw;
            head.next=head;
            size++;
            System.out.println("Element Inserted "+nw.data);
        }
        else
        {
            tail.next=nw;
            nw.next=head;
            tail=nw;
            size++;
            System.out.println("Element Inserted "+nw.data);

        }
    }
    public void display()
    {
        Node_4 temp=head;
        int i=1;
        while(temp!=null && i<=size)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
            i++;
        }
    }
}

public class Circular_Singly_LinkedList {
    public static void main(String [] args)
    {
        Circular_Singly cl=new Circular_Singly();
        cl.insert(10);
        cl.insert(20);
        cl.insert(30);
        cl.insert(40);

        cl.insert(50);
        cl.display();
    }
}
