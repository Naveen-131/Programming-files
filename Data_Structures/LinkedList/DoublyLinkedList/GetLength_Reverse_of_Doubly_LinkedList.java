package LinkedList.DoublyLinkedList;
class Node_3
{
    int data;
    Node_3 next;
    Node_3 prev;
    public Node_3(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Double_Linkedlist_2
{
    public Node_3 head,tail=null;
    public int size=0;

    public void create(int data)
    {
        Node_3 nw=new Node_3(data);
        if(head==null)
        {
            head=tail=nw;
            size++;
            System.out.println("Element added : "+tail.data);
        }
        else
        {
            tail.next=nw;
            nw.prev=tail;
            tail=tail.next;
            size++;
            System.out.println("Element added : "+nw.data);
        }
    }
    public void get_size()
    {
        System.out.println("Size :"+size);
    }


    public void reverse()
    {
        Node_3 current_node=head;
        Node_3 next_node;
        while(current_node!=null)
        {
            next_node=current_node.next;
            current_node.next=current_node.prev;
            current_node.prev=next_node;
            current_node=next_node;
        }
        current_node=head;
        head=tail;
        tail=current_node;
        System.out.println("Head "+head.data);
        System.out.println("Tail "+tail.data);
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node_3 temp=head;
            System.out.println();
            while (temp!=null)
            {
                System.out.println(" "+temp.data);
                temp=temp.next;
            }
        }
    }

}

public class GetLength_Reverse_of_Doubly_LinkedList {
    public static void main(String [] args)
    {
        Double_Linkedlist_2 dl=new Double_Linkedlist_2();
        dl.create(10);
        dl.create(20);
        dl.create(30);
        dl.create(40);
        dl.create(50);
        dl.display();
        dl.get_size();
        dl.reverse();
        dl.display();
    }
}
