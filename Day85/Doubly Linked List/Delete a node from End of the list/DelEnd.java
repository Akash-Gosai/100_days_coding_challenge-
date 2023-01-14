
/*
Original List: 
1 2 3 4 5 
Updated List: 
1 2 3 4 
Updated List:
1 2 3
Updated List:
1 2
Updated List:
1
Updated List:
List is empty
*/
public class DelEnd {  
  
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
  
    //deleteFromEnd() will delete a node from the end of the list  
    public void deleteFromEnd() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether the list contains only one node  
            if(head != tail) {  
                //Previous node to the tail will become new tail  
                tail = tail.previous;  
                //Node next to current tail will be made null  
                tail.next = null;  
            }  
            //If the list contains only one element  
            //Then it will remove node and now both head and tail will point to null  
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
  
        DelEnd dList = new DelEnd();  
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
            dList.deleteFromEnd();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            dList.display();  
        }  
    }  
}  
