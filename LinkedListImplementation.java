public class LinkedListImplementation {
    private Node head;
    public void create(int headInput) {
        Node node = new Node();
        node.data = headInput;
        head = node;
    }

    public void insert(int input) {
        Node node = new Node();
        node.data = input;
        node.next = null;

        Node n = head;
        while (n.next != null) {
                n = n.next;
        }
        n.next = node;
    }

    public void print() {
        Node n = head;
        while (n.next != null) {
            System.out.print("[" + n.data + "]");
            n = n.next;
        }
        System.out.print("[" + n.data + "]");
    }

    public boolean LinkedListChecker() {
        return head == null;
    }

    public void delete(int deleteInput) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == deleteInput) {
            head = temp.next;
        }
        while (temp != null && temp.data != deleteInput) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("No node was deleted.");
            return;
        }
        prev.next = temp.next;

    }

    public void search(int searchInput) {
        Node n = head;
        boolean status = false;
        while(n.next != null) {
            if (n.data == searchInput) {
                status = true;
                break;
            }
            n = n.next;
        }
        if (status) {
            System.out.println("node with value " + searchInput + " was found in the Linked List.");
        } else if (n.next == null && n.data == searchInput){
            System.out.println("node with value " + searchInput + " was found in the Linked List.");
        } else {
            System.out.println("No node was found in the Linked List.");
        }
    }
}