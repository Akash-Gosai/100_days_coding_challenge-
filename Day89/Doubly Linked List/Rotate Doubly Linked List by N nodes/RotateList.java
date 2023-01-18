public class RotateList {  
  
    //Represent a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    int size = 0;  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
        //Size will count the number of nodes present in the list  
        size++;  
    }  
  
    //rotateList() will rotate the list by given n nodes  
    public void rotateList(int n) {  
        //Initially, current will point to head  
        Node current = head;  
  
        //n should not be 0 or greater than or equal to number of nodes present in the list  
        if(n == 0 || n >= size)  
            return;  
        else {  
            //Traverse through the list till current point to nth node  
            //after this loop, current will point to nth node  
            for(int i = 1; i < n; i++)  
                current = current.next;  
  
            //Now to move entire list from head to nth node and add it after tail  
            tail.next = head;  
            //Node next to nth node will be new head  
            head = current.next;  
            //Previous node to head should be null  
            head.previous = null;  
            //nth node will become new tail of the list  
            tail = current;  
            //tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        RotateList dList = new RotateList();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        System.out.println("Original List: ");  
        dList.display();  
  
        //Rotates list by 3 nodes  
        dList.rotateList(3);  
  
        System.out.println("Updated List: ");  
        dList.display();  
    }  
}  
