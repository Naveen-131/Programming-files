package LinkedList.SinglyLinkedList;

class Node_1
{
    int data;
    Node_1 next;
    public Node_1(int data)
    {
        this.data=data;
        this.next=null;

    }
}
class Linked_list_1
{
    public Node_1 head=null;
    Node_1 tail=null;
    public int size=0;
    public void List_Create(int x)
    {
        Node_1 nw=new Node_1(x);
        if(head==null && size==0)
        {
            head=nw;
            tail=nw;
            size++;
        }
        else
        {
            tail.next=nw;
            tail=nw;
            size++;
        }

    }
    public void get_size()
    {
        System.out.println("Size of the Linked List: "+size);
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node_1 temp=head;
            while (temp.next!=null)
            {
                System.out.println(" "+temp.data);
                temp=temp.next;
            }
            System.out.println(" "+temp.data);
        }

    }


}
public class Singly_LinkedList_Implementation
{
    public static void main(String [] args)
    {
        Linked_list_1 li=new Linked_list_1();
        li.List_Create(10);
        li.List_Create(20);
        li.List_Create(30);
        li.List_Create(40);
        li.get_size();
        li.display();

    }
}
