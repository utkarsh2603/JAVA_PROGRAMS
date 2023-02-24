import javax.swing.*;

public class Linked_List
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        while(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        while(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int index, int data)
    {
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;

    }


    public void print()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }

    public int search(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String args[])
    {
        Linked_List ll=new Linked_List();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addLast(6);
        ll.addLast(8);
        ll.add(0,5);
        ll.removeFirst();
        ll.removeFirst();

        ll.print();
        System.out.println(ll.search(10));
    }
}
