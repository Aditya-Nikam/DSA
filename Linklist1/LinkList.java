package Linklist1;

public class LinkList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);// create a new node
        if (head == null) {
            head = tail = newNode;// empty LinkList
        } else {
            newNode.next = head;// newNode -> next = head
            head = newNode;// head points to new node
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);// create a new node
        if (head == null) {
            head = tail = newNode;// empty LinkList
            return;
        }

        // O(n)
        Node p = head;
        while (p.next != null) {// traverse the link list
            p = p.next;
        }
        p.next = newNode;
        tail = p.next;

        // ORR O(1)
        // tail.next = newNode;// tail -> next = newNode
        // tail = newNode;// tail points to new node
    }

    public void printList() {
        Node p = head;
        while (p != null) {
            System.out.print("[ " + p.data + " | -]->");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addFirst(0);
        linkList.addFirst(1);
        linkList.addFirst(2);
        // linkList.printList();
        linkList.addLast(4);
        linkList.addLast(5);
        linkList.addLast(6);
        linkList.printList();
    }
}
