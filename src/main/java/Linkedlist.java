import java.util.LinkedList;

class Linkedlist {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.getLast();

        list.addFirst("this");
        list.getLast();
        System.out.println(list.size());

        list.removeFirst();
        list.getLast();
    }
}
