/**
 * Created by badkass on 7/24/2017.
 */
/**
 * Created by badkass on 7/19/2017.
 */



class Node {
    public char character;
    public Node link;
    public static int count;
    Node() {

    }

    Node(char c){
        this.character = c;
        this.link = null;
        count++;
    }

}

class List {
    private Node head;

    public  List() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public  void insert(char c) {
        Node node = new Node(c);
        node.link = head;
        head = node;
    }

    public void insertAtPos(char c, int pos) {
        Node currentLink = head;
        int count = 0;
        Node newNode = new Node(c);
        while (count < pos-1) {
            if (currentLink == null) {
                System.out.println("The position does not exist");
            }
            currentLink = currentLink.link;
            count++;
        }
        newNode.link = currentLink.link;
        currentLink.link = newNode;
    }

    public Node delete() {
        Node temp = head;
        if (head == null) {
            return  null;
        }
        head = head.link;
        return temp;
    }

    public void deleteAtPos (int pos) {
         Node currentLink = head;
         int count = 0;
         while (count < pos-1) {
             if (currentLink == null) {
                 System.out.println("The position does not exist");
             }
             currentLink = currentLink.link;
             count++;
         }
         currentLink.link = currentLink.link.link;
    }

    public void printList() {
        Node currentLink = head;
        System.out.println("The list is as follows : ");
        while (currentLink != null) {
            System.out.println(currentLink.character);
            currentLink = currentLink.link;
        }
        System.out.println();

    }
}

public  class LinkedList {
    public static void main(String[] args) {
        List ls = new List();
        ls.insert('a');
        ls.insert('b');
        ls.insert('c');
        ls.insert('d');
        ls.insert('e');
        ls.insert('f');
        ls.insert('g');
        ls.insertAtPos('x', 3);

        ls.printList();

        ls.deleteAtPos(2);
        ls.printList();
    }
}


/*
class LinkListTest {
    public static void main(String[] args) {


        while(!list.isEmpty()) {
            Link deletedLink = list.delete();
            System.out.print("deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        list.printList();
    }
}
*/
