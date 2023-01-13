/*
Original List: 
1 2 3 4 5 
Updated List:
Updated List:
3 4 5
Updated List:
4 5
Updated List:
5
Updated List:
List is empty
*/

public class DelBeg
{  
  
    //Represent a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
}  
  
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
    }  
  
    //deleteFromStart() will delete a node from the beginning of the list  
    public void deleteFromStart() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether the list contains only one element  
            if(head != tail) {  
                //head will point to next node in the list  
                head = head.next;  
                //Previous node to current head will be made null  
                head.previous = null;  
            }  
            //If the list contains only one element  
            //then, it will remove node and now both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
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
  
        DelBeg dList = new DelBeg();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        //Printing original list  
        System.out.println("Original List: ");  
        dList.display();  
        while(dList.head != null) {  
            dList.deleteFromStart();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            dList.display();  
        }  
    }  
} 
