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
        tail = newNode;

        // ORR O(1)
        // tail.next = newNode;// tail -> next = newNode
        // tail = newNode;// tail points to new node
    }

    public void printList() {
        if (head == null)
            System.out.print("Linklist is empty");
        Node p = head;
        while (p != null) {
            System.out.print("[ " + p.data + " | -]->");
            p = p.next;
        }
    }

    public void add(int data, int index) {
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node p = head;
        int i = 0;
        while (i < index - 1 && p.next != null) {
            p = p.next;
            i++;
        }
        newNode.next = p.next;
        p.next = newNode;
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

        linkList.add(10, 10);
        linkList.printList();
    }
}
