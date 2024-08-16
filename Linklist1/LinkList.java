package Linklist1;

public class LinkList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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
        if (head == null) {
            System.out.print("Linklist is empty");
        }
        Node p = head;
        while (p != null) {
            System.out.print("[ " + p.data + " | -]->");
            p = p.next;
        }
        System.out.println();
    }

    public void add(int data, int index) {
        if (index == 0) {
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

    public void insertAfter(int node, int data) {
        Node newNode = new Node(data);
        Node p = head;
        while (p.data != node) {
            if (p.next == null) {
                System.out.println("Node not found");
                return;
            }
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
    }

    public void insertBefore(int node, int data) {
        Node newNode = new Node(data);
        Node p = head;
        Node prev = null;
        while (p.data != node) {
            if (p.next == null) {
                System.out.println("Node not found");
                return;
            }
            prev = p;
            p = p.next;
        }
        newNode.next = p;
        prev.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Link List is empty");
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        if (size == 1) {
            head = tail = null;
            size--;
            return data;
        }
        head = head.next;
        size--;
        return data;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Link List is empty");
            return Integer.MIN_VALUE;
        }
        Node p = head;
        int data = tail.data;
        if (size == 1) {
            head = tail = null;
            size--;
            return data;
        }
        while (p.next != tail) {
            p = p.next;
        }
        p.next = null;
        tail = p;
        size--;
        return data;
    }

    public void remove(int node) {
        if (size == 0) {
            System.out.println("Linklist is empty");
            return;
        }
        if (size == 1 && head.data == node) {
            head = tail = null;
            size--;
            return;
        }
        if (head.data == node) {
            removeFirst();
            return;
        }
        if (tail.data == node) {
            removeLast();
            return;
        }
        Node prev = null;
        Node p = head;
        while (p.data != node) {
            if (p.next == null) {
                System.out.println("Node Not Found");
                return;
            }
            prev = p;
            p = p.next;
        }
        prev.next = p.next;
        size--;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addLast(1);
        linkList.addLast(2);
        linkList.addLast(3);
        linkList.addLast(4);
        linkList.addLast(5);
        linkList.remove(1);
        linkList.printList();
    }
}
